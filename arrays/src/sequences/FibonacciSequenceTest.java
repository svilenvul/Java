package sequences;

import java.util.Scanner;

public class FibonacciSequenceTest {
	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);
		System.out.print("Set number n:");
		int n = input.nextInt();
		System.out.print("The sum of fibonacci members from 1 to " + n
				+ " is: " + FibonacciSequence.findSumOfFibonacciNumbers(n));
	}
}
