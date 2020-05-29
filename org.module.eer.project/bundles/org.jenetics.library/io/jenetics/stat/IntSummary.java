/*
 * Java Genetic Algorithm Library (jenetics-6.0.0).
 * Copyright (c) 2007-2020 Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmail.com)
 */
package io.jenetics.stat;

import static java.lang.Double.NaN;
import static java.util.Objects.requireNonNull;
import static io.jenetics.internal.util.Hashes.hash;

import java.io.Serializable;
import java.util.IntSummaryStatistics;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;

/**
 * <i>Value</i> objects which contains statistical summary information.
 *
 * @see java.util.IntSummaryStatistics
 *
 * @implNote
 * This class is immutable and thread-safe.
 *
 * @author <a href="mailto:franz.wilhelmstoetter@gmail.com">Franz Wilhelmstötter</a>
 * @since 3.0
 * @version 6.0
 */
public final /*record*/ class IntSummary implements Serializable {

	private static final long serialVersionUID = 1L;

	private final long _count;
	private final int _min;
	private final int _max;
	private final long _sum;
	private final double _mean;

	/**
	 * Create an immutable object which contains statistical summary values.
	 *
	 * @param count the count of values recorded
	 * @param min the minimum value
	 * @param max the maximum value
	 * @param sum the sum of the recorded values
	 * @param mean the arithmetic mean of values
	 */
	private IntSummary(
		final long count,
		final int min,
		final int max,
		final long sum,
		final double mean
	) {
		_count = count;
		_min = min;
		_max = max;
		_sum = sum;
		_mean = mean;
	}

	/**
	 * Returns the count of values recorded.
	 *
	 * @return the count of recorded values
	 */
	public long count() {
		return _count;
	}

	/**
	 * Return the minimum value recorded, or {@code Integer.MAX_VALUE} if no
	 * values have been recorded.
	 *
	 * @return the minimum value, or {@code Integer.MAX_VALUE} if none
	 */
	public int min() {
		return _min;
	}

	/**
	 * Return the maximum value recorded, or {@code Integer.MIN_VALUE} if no
	 * values have been recorded.
	 *
	 * @return the maximum value, or {@code Integer.MIN_VALUE} if none
	 */
	public int max() {
		return _max;
	}

	/**
	 * Return the sum of values recorded, or zero if no values have been
	 * recorded.
	 *
	 * @return the sum of values, or zero if none
	 */
	public long sum() {
		return _sum;
	}

	/**
	 * Return the arithmetic mean of values recorded, or zero if no values have
	 * been recorded.
	 *
	 * @return the arithmetic mean of values, or zero if none
	 */
	public double mean() {
		return _mean;
	}

	@Override
	public int hashCode() {
		return
			hash(_count,
			hash(_sum,
			hash(_min,
			hash(_max,
			hash(_mean)))));
	}

	@Override
	public boolean equals(final Object obj) {
		return obj == this ||
			obj instanceof IntSummary &&
			_count == ((IntSummary)obj)._count &&
			_sum == ((IntSummary)obj)._sum &&
			_min == ((IntSummary)obj)._min &&
			_max == ((IntSummary)obj)._max &&
			Double.compare(_mean, ((IntSummary)obj)._mean) == 0;
	}

	@Override
	public String toString() {
		return String.format(
			"IntSummary[N=%d, ∧=%s, ∨=%s, Σ=%s, μ=%s]",
			count(), min(), max(), sum(), mean()
		);
	}

	/**
	 * Create an immutable object which contains statistical summary values.
	 *
	 * @param count the count of values recorded
	 * @param min the minimum value
	 * @param max the maximum value
	 * @param sum the sum of the recorded values
	 * @param mean the arithmetic mean of values
	 * @return an immutable object which contains statistical values
	 */
	public static IntSummary of(
		final long count,
		final int min,
		final int max,
		final long sum,
		final double mean
	) {
		return new IntSummary(
			count,
			min,
			max,
			sum,
			mean
		);
	}

	/**
	 * Return a new value object of the statistical summary, currently
	 * represented by the {@code statistics} object.
	 *
	 * @param statistics the creating (mutable) statistics class
	 * @return the statistical moments
	 */
	public static IntSummary of(final IntSummaryStatistics statistics) {
		return new IntSummary(
			statistics.getCount(),
			statistics.getMin(),
			statistics.getMax(),
			statistics.getSum(),
			statistics.getAverage()
		);
	}

	/**
	 * Return a {@code Collector} which applies an int-producing mapping
	 * function to each input element, and returns summary-statistics for the
	 * resulting values.
	 *
	 * <pre>{@code
	 * final Stream<SomeObject> stream = ...
	 * final IntSummary summary = stream
	 *     .collect(toIntSummary(v -> v.intValue()));
	 * }</pre>
	 *
	 * @param mapper a mapping function to apply to each element
	 * @param <T> the type of the input elements
	 * @return a {@code Collector} implementing the summary-statistics reduction
	 * @throws java.lang.NullPointerException if the given {@code mapper} is
	 *         {@code null}
	 */
	public static <T> Collector<T, ?, IntSummary>
	toIntSummary(final ToIntFunction<? super T> mapper) {
		requireNonNull(mapper);
		return Collector.of(
			IntSummaryStatistics::new,
			(a, b) -> a.accept(mapper.applyAsInt(b)),
			(a, b) -> {a.combine(b); return a;},
			IntSummary::of
		);
	}


	/* *************************************************************************
	 * Some static helper methods.
	 **************************************************************************/

	/**
	 * Return the minimum value of the given double array.
	 *
	 * @since 4.0
	 *
	 * @param values the array.
	 * @return the minimum value or {@link Integer#MAX_VALUE} if the given array is
	 *         empty.
	 * @throws NullPointerException if the given array is {@code null}.
	 */
	public static int min(final int[] values) {
		int min = Integer.MAX_VALUE;
		if (values.length > 0) {
			min = values[0];
			for (int value : values) {
				if (value < min) {
					min = value;
				}
			}
		}

		return min;
	}

	/**
	 * Return the maximum value of the given double array.
	 *
	 * @since 4.0
	 *
	 * @param values the array.
	 * @return the maximum value or {@link Integer#MIN_VALUE} if the given array is
	 *         empty.
	 * @throws NullPointerException if the given array is {@code null}.
	 */
	public static int max(final int[] values) {
		int max = Integer.MIN_VALUE;
		if (values.length > 0) {
			max = values[0];
			for (int value : values) {
				if (value > max) {
					max = value;
				}
			}
		}

		return max;
	}

	/**
	 * Return the sum of the given double array.
	 *
	 * @since 4.0
	 *
	 * @param values the values to sum up.
	 * @return the sum of the given {@code values}.
	 * @throws NullPointerException if the given array is {@code null}.
	 */
	public static long sum(final int[] values) {
		long sum = 0;
		for (int i = values.length; --i >= 0;) {
			sum += values[i];
		}
		return sum;
	}

	/**
	 * Returns a double describing the arithmetic mean of the values, or
	 * {@link Double#NaN} if the {@code values} array is empty.
	 *
	 * @since 4.0
	 *
	 * @param values the values to calculate the mean of
	 * @return the arithmetic mean of the given {@code values} or
	 *         {@link Double#NaN} if the {@code values} array is empty
	 * @throws NullPointerException if the given array is {@code null}.
	 */
	public static double mean(final int[] values) {
		return values.length > 0 ? (double)sum(values)/values.length : NaN;
	}

}
