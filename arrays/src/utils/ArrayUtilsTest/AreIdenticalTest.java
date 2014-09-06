package utils.ArrayUtilsTest;

import java.util.Arrays;

import utils.ArrayUtils;

public class AreIdenticalTest {

	public static void main(String[] args) {
		int[] first = { 4, 5, 6, 7, 8, 93, 8, 0, 0 };
		int[] second = { 45, 6, 8, 47, 8 };
		int[] first2 = { 4, 5, 6, 7, 8, 93, 8, 0, 0 };
		int[] second2 = { 4, 5, 6, 7, 8 };
		int[] first3 = { 4, 5, 6, 7, 8, 93, 8, 0, 0 };
		int[] second3 = { 4, 5, 6, 7, 8, 93, 8, 0, 0 };

		System.out.println("The arrays " + Arrays.toString(first) + ", "
				+ Arrays.toString(second) + " are identical:"
				+ ArrayUtils.areIdentical(first, second));
		System.out.println("The arrays " + Arrays.toString(first2) + ", "
				+ Arrays.toString(second2) + " are identical:"
				+ ArrayUtils.areIdentical(first2, second2));
		System.out.println("The arrays " + Arrays.toString(first3) + ", "
				+ Arrays.toString(second3) + " are identical:"
				+ ArrayUtils.areIdentical(first3, second3));
	}

}
