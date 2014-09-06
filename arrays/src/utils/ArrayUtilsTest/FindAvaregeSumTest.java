package utils.ArrayUtilsTest;

import java.util.Arrays;

import utils.ArrayUtils;

public class FindAvaregeSumTest {

	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 6, 7, 2, 8, 6, 96, 3 };
		int[] array2 = { 2 };
		int[] array3 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };

		System.out.println("The average sum of " + Arrays.toString(array)
				+ " is: " + ArrayUtils.findAverageSum(array));
		System.out.println("The average sum of " + Arrays.toString(array2)
				+ " is: " + ArrayUtils.findAverageSum(array2));
		System.out.println("The average sum of " + Arrays.toString(array3)
				+ " is: " + ArrayUtils.findAverageSum(array3));

	}

}
