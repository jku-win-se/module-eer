package org.module.eer.jenetics.config.utils;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import io.jenetics.BitChromosome;
import io.jenetics.internal.util.Bits;
import io.jenetics.internal.util.Requires;

public class BitChromosomeUtils {
	
	/*Copy of the BitChromosome class
	 * return new BitChromosome(bits, bits.length*8, Requires.probability(p));
	 * should be
	 * return new BitChromosome(bits, value.length(), Requires.probability(p));
	 */
	public static BitChromosome of(final CharSequence value, final double p) {
		final byte[] bits = toByteArray(requireNonNull(value, "Input"));
		return privateConstructorBitChromosome(bits, value.length(), Requires.probability(p));		
	}
	
	private static byte[] toByteArray(final CharSequence value) {
		final byte[] bytes = Bits.newArray(value.length());
		for (int i = value.length(); --i >= 0;) {
			final char c = value.charAt(i);
			if (c == '1') {
				Bits.set(bytes, i);
			} else if (c != '0') {
				throw new IllegalArgumentException(format(
					"Illegal character '%s' at position %d", c, i
				));
			}
		}

		return bytes;
	}
	
	@SuppressWarnings("rawtypes")
	private static BitChromosome privateConstructorBitChromosome(byte[] bits, int i, double d) {
		Class[] arguments = new Class[3];
		arguments[0] = byte[].class;
        arguments[1] = int.class;
        arguments[2] = double.class;
		try {
			Constructor<BitChromosome> constructor = BitChromosome.class.getDeclaredConstructor(arguments);
			constructor.setAccessible(true);
			BitChromosome bitChromosome = constructor.newInstance(bits, i, d);			
			return bitChromosome;			
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException |
					IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}		
		throw new IllegalArgumentException("It cannot be access the BitChromosome reflective");
	}

}
