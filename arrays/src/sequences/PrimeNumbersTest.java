package sequences;

import java.util.List;
import java.util.Scanner;

public class PrimeNumbersTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Set maximal number: ");
		int arrayLength = input.nextInt();

		System.out.println("The prime numbers smaller then: " + arrayLength
				+ " are:");
		List<Integer> primes = PrimeNumbers.findAllSmallerThen(arrayLength);
		for (Integer integer : primes) {
			System.out.print(integer + " ");
		}

	}
}
