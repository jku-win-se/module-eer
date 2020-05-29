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
package io.jenetics;

import io.jenetics.internal.util.Requires;

/**
 * Abstract implementation of the alterer interface.
 *
 * @author <a href="mailto:franz.wilhelmstoetter@gmail.com">Franz Wilhelmstötter</a>
 * @since 1.0
 * @version 6.0
 */
public abstract class AbstractAlterer<
	G extends Gene<?, G>,
	C extends Comparable<? super C>
>
	implements Alterer<G, C>
{

	/**
	 * The altering probability.
	 */
	protected final double _probability;

	/**
	 * Constructs an alterer with a given recombination probability.
	 *
	 * @param probability The recombination probability.
	 * @throws IllegalArgumentException if the {@code probability} is not in the
	 *         valid range of {@code [0, 1]}.
	 */
	protected AbstractAlterer(final double probability) {
		_probability = Requires.probability(probability);
	}

	/**
	 * Return the recombination/alter probability for this alterer.
	 *
	 * @return The recombination probability.
	 */
	public double probability() {
		return _probability;
	}

}
