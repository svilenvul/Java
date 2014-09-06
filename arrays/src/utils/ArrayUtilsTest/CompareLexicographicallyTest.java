package utils.ArrayUtilsTest;

import java.util.Arrays;

import utils.ArrayUtils;

public class CompareLexicographicallyTest {

	public static void main(String[] args) {
		char[] first = { 'a', 'd', 'f', 's', 'd', 'd', 'a', 's', 'f' };
		char[] second = { 'a', 'd', 'f', 's', 'd' };
		char[] first2 = { 'a', 'd', 'f', 's', 'd', 'd', 'a', 's', 'f' };
		char[] second2 = { 'a', 'd', 'f', 's', 'd', 'd', 'a', 's', 'f' };
		char[] first3 = { 'a', 'd', 'f', 's', 'd', 'd', 'a', 's', 'f' };
		char[] second3 = { 'a', 'd', 'd', 's', 'd', 'f', 's', 's', 'f' };

		System.out.println("From" + Arrays.toString(first) + ", "
				+ Arrays.toString(second) + "the :"
				+ ArrayUtils.compareLexicographically(first, second)
				+ " is earliar in the lexicographically table");
		System.out.println("From" + Arrays.toString(first2) + ", "
				+ Arrays.toString(second2) + "the :"
				+ ArrayUtils.compareLexicographically(first2, second2)
				+ " is earliar in the lexicographically table");
		System.out.println("From" + Arrays.toString(first3) + ", "
				+ Arrays.toString(second3) + "the :"
				+ ArrayUtils.compareLexicographically(first3, second3)
				+ " is earliar in the lexicographically table");
	}

}
