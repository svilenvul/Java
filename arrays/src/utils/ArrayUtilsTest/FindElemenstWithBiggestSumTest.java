package utils.ArrayUtilsTest;

import java.util.Arrays;

import utils.ArrayUtils;

public class FindElemenstWithBiggestSumTest {
	public static void main(String[] args) {
		int [] array ={5,3,4,6,7,56,8,6,96,3};	
		int number = 3; 
		int [] array2 ={2};
		int number2 = 1;
		int [] array3 ={2,2,2,2,2,2,2,2,2,2};
		int number3 = 5;
		
		
		System.out.println("The first "+ number + " elements in the array" + Arrays.toString(array)+
				"are: "  + Arrays.toString(ArrayUtils.findElementsWithBiggestSum(array, number)));
		System.out.println("The first "+ number2 + " elements in the array" + Arrays.toString(array2)+
				"are: "  + Arrays.toString(ArrayUtils.findElementsWithBiggestSum(array2, number2)));
		System.out.println("The first "+ number3 + " elements in the array" + Arrays.toString(array3)+
				"are: "  + Arrays.toString(ArrayUtils.findElementsWithBiggestSum(array3, number3)));
		
	}
}
