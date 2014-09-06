package utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;

public class ArrayUtils {
	public static boolean areIdentical(int[] first, int[] second) {
		boolean same = true;
		if (first.length != second.length) {
			same = false;
			return same;
		}
		for (int row = 0; row < second.length; row++) {
			if (first[row] != second[row]) {
				same = false;
			}
		}
		return same;
	}

	public static int compareLexicographically(char[] first, char[] second) {

		int smallerLenght = Math.min(first.length, second.length);

		for (int letter = 0; letter < smallerLenght; letter++) {
			if (first[letter] < second[letter]) {
				return 2;
			} else if (first[letter] > second[letter]) {
				return 1;
			} else {
				continue;
			}
		}
		if (first.length < second.length) {
			return 1;
		} else if (first.length > second.length) {
			return 2;
		} else {
			return 0;
		}
	}

	public static int findAverageSum(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		int averageSum = sum / array.length;

		return averageSum;
	}

	public static int[] findElementsWithBiggestSum(int array[],
			int numberOfElements) {
		int[] sequence = new int[numberOfElements];
		if (numberOfElements > array.length) {
			throw new RuntimeException(
					"Number of items cant be bigger than the lenght of the array !");
		}
		Arrays.sort(array);

		for (int l = array.length - 1, k = 0; l >= array.length
				- numberOfElements; l--, k++) {
			sequence[k] = array[l];
		}

		return sequence;
	}

	public static int findMostCommonNumber(int array[]) {
		int count = 0;
		int maxCount = 0;
		int mostCommonNumber = array[0];
		int currentNumber;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			currentNumber = array[i];
			if (map.containsKey(currentNumber)) {
				count = map.get(currentNumber);
				count++;
				if (count > maxCount) {
					mostCommonNumber = currentNumber;
					maxCount = count;
				}
				map.put(currentNumber, count);
			} else {
				map.put(currentNumber, 1);
			}

		}
		return mostCommonNumber;
	}

	public static int getFirstBiggerThanHisNeighbours(int[] array) {
		int position = -1;
		for (position = 0; position < array.length - 1; position++) {
			if (isNumberBiggerThanHisNeighbour(array, position)) {
				return position;
			}
		}
		return -1;
	}

	public static boolean isNumberBiggerThanHisNeighbour(int[] array,
			int position) {
		boolean isBigger = true;
		try {
			if (position == 0) {
				isBigger = compareNumbers(array[position], array[position + 1],
						isBigger);
				return isBigger;
			}
			if (position == array.length - 1) {
				isBigger = compareNumbers(array[position], array[position - 1],
						isBigger);
				return isBigger;
			} else {
				isBigger = (compareNumbers(array[position],
						array[position - 1], isBigger) && compareNumbers(
						array[position], array[position + 1], isBigger));
				return isBigger;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw (e);
		}
	}

	private static boolean compareNumbers(int element, int neighbour,
			boolean isBigger) {
		if (element <= neighbour) {
			isBigger = false;
		}
		return isBigger;
	}

	public static int getNumberOfOccurrences(int[] array, int value) {
		int numberOfOccurrences = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				numberOfOccurrences++;
			}
		}
		return numberOfOccurrences;
	}

}
