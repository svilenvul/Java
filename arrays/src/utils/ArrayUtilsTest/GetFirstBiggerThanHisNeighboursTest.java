package utils.ArrayUtilsTest;

import java.util.Arrays;

import utils.ArrayUtils;

public class GetFirstBiggerThanHisNeighboursTest {
	public static void main(String[] args) {
		int [] array ={5,3,4,6,7,56,8,6,96,3};		
		int [] array2 ={2};		
		int [] array3 ={2,2,2,2,2,2,2,2,2,2};
		
		
		System.out.println("The number at position "+ 
				ArrayUtils.getFirstBiggerThanHisNeighbours(array) + 
				" is  the first bigger than his nejghbors in " +
				Arrays.toString(array));
		System.out.println("The number at position "+ 
				ArrayUtils.getFirstBiggerThanHisNeighbours(array2) + 
				" is  the first bigger than his nejghbors in " +
				Arrays.toString(array2));
		System.out.println("The number at position "+ 
				ArrayUtils.getFirstBiggerThanHisNeighbours(array3) + 
				" is  the first bigger than his nejghbors in " +
				Arrays.toString(array3));
	}
}
