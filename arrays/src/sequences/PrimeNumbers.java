package sequences;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {

	/**
	 * Finds all prime numbers in interval 1-n, using the algorithm
	 * "Sieve of Eratosthenes"
	 * 
	 * @author 888
	 *
	 */
	public static List<Integer> findAllSmallerThen(int number) {
		return excludeNonPrimes(markPrimes(number));
	}

	/**
	 * First mark all the prime numbers
	 * 
	 * Value equal to 0 in the sieve means prime Value equal to 1 in the sieve
	 * means not-prime
	 */
	private static int[] markPrimes(int number) {
		int[] sieve = new int[number];
		sieve[0] = 1;
		sieve[1] = 1;

		for (int i = 0; i < Math.sqrt(sieve.length); i++) {
			if (sieve[i] == 0) {
				for (int l = i; (i * l) < sieve.length; l++) {
					sieve[i * l] = 1;
				}
			}
		}
		return sieve;
	}

	private static List<Integer> excludeNonPrimes(int[] array) {
		List<Integer> primes = new LinkedList<Integer>();
		for (int k = 0; k < array.length; k++) {
			if (array[k] == 0) {
				primes.add(k);
			}
		}
		return primes;
	}

}
