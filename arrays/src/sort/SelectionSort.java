package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implements Selection Sort algorithm
 * 
 * @author 888
 *
 */
public class SelectionSort {

	public static int[] sortAscending(int[] numbers) {
		int temp;
		int minValue;
		int minIndex;
		for (int i = 0; i < numbers.length; i++) {
			minValue = numbers[i];
			minIndex = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < minValue) {
					minValue = numbers[j];
					minIndex = j;
				}
			}
			if (minValue != numbers[i]) {
				temp = numbers[i];
				numbers[i] = numbers[minIndex];
				numbers[minIndex] = temp;
			}
		}
		return numbers;
	}

}