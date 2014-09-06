package sequences;

import java.util.Scanner;

public class FibonacciSequence {
	static int firstNumber = 0;
	static int secondNumber = 1;

	public static int findSumOfFibonacciNumbers(int n) {
		int first = firstNumber;
		int second = secondNumber;
		int third;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			third = first + second;
			first = second;
			second = third;
			sum += first;
		}
		return sum;
	}
}
