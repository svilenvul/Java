package utils.ArrayUtilsTest;

import java.util.Arrays;

import utils.ArrayUtils;

public class IsNumberBiggerThanHisNeighbour {

	public static void main(String[] args) {
		int [] array ={5,3,4,6,7,56,8,6,96,3};
		int position = 0;
		int [] array2 ={2};
		int position2 = 3;
		int [] array3 ={2,2,2,2,2,2,2,2,2,2};
		int position3= 4;
		
		System.out.println("The number at position"+ position + " in "+ 
				Arrays.toString(array) + " is bigger than his nejghbors: " +
				ArrayUtils.isNumberBiggerThanHisNeighbour(array, position));
		System.out.println("The number at position"+ position2 + " in "+ 
				Arrays.toString(array2) + " is bigger than his nejghbors: " +
				ArrayUtils.isNumberBiggerThanHisNeighbour(array2, position2));
		System.out.println("The number at position"+ position3 + " in "+ 
				Arrays.toString(array3) + " is bigger than his nejghbors: " +
				ArrayUtils.isNumberBiggerThanHisNeighbour(array3, position3));
	}
}
