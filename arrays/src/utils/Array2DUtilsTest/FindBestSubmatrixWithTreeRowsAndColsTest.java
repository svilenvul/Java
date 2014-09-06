package utils.Array2DUtilsTest;

import utils.Array2DUtils;

public class FindBestSubmatrixWithTreeRowsAndColsTest {
	public static void main(String[] args) {
		int[][] array = {
				{ 3, 8, 8, 8, 8, 6, 8 }, 
				{ 6, 6, 9, 4, 7, 8, 3 },
				{ 6, 6, 6, 6, 8, 8, 8 } 
			};
		System.out.print("The array:");
		print(array);
		System.out.println();
		System.out.print("Best submatrix 3x3");
		print(Array2DUtils.findBestSubmatrixWithTreeRowsAndCols(array));
	}

	public static void print(int[][] best) {
		for (int row = 0; row < best.length; row++) {
			System.out.println();
			for (int col = 0; col < best[0].length; col++) {
				System.out.print(best[row][col]);
			}
		}
		System.out.println();
	}
}
