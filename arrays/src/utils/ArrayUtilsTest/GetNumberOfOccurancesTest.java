package utils.ArrayUtilsTest;

import java.util.Arrays;

import utils.ArrayUtils;

public class GetNumberOfOccurancesTest {

	public static void main(String[] args) {
		int [] array ={5,3,4,6,7,56,8,6,96,3};
		int [] array2 ={2};
		int [] array3 ={2,2,2,2,2,2,2,2,2,2};
		int searchNumber = 2;
		
		System.out.println("The number "+ searchNumber + " has "+ 
			ArrayUtils.getNumberOfOccurrences(array, searchNumber) + 
			" occurances in" + Arrays.toString(array));
		System.out.println("The number "+ searchNumber + " has "+ 
				ArrayUtils.getNumberOfOccurrences(array2, searchNumber) + 
				" occurances in" + Arrays.toString(array2));
		System.out.println("The number "+ searchNumber + " has "+ 
				ArrayUtils.getNumberOfOccurrences(array3, searchNumber) + 
				" occurances in" + Arrays.toString(array3));

	}
}
