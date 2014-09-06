package utils;

import java.util.Scanner;
import java.lang.IllegalArgumentException;

/**
 * Finds the best sum of submatrix [3][3]
 * 
 * @author 888
 *
 */
public class Array2DUtils {
	static int length = 0;
	static int maxLength = 1;

	public static int[][] findBestSubmatrixWithTreeRowsAndCols(int[][] matrix) {
		if (matrix.length < 3 || matrix[0].length < 3) {
			throw new IllegalArgumentException(
					"Matrix must be minimum with minimum 3 rows and cols");
		}

		int bestSum = Integer.MIN_VALUE;
		int bestRow = 0;
		int bestCol = 0;
		for (int row = 0; row < matrix.length - 2; row++) {
			for (int col = 0; col < matrix[0].length - 2; col++) {
				int sum = matrix[row][col] + matrix[row][col + 1]
						+ matrix[row][col + 2] + matrix[row + 1][col]
						+ matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
						+ matrix[row + 2][col] + matrix[row + 2][col + 1]
						+ matrix[row + 2][col + 2];
				if (sum > bestSum) {
					bestSum = sum;
					bestRow = row;
					bestCol = col;
				}
			}
		}
		int[][] result = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int l = 0; l < 3; l++) {
				result[i][l] = matrix[bestRow + l][bestCol + i];
			}
		}
		return result;
	}

	public static int[][] findBiggestAreaOfElements(int[][] array) {
		int[][] best = new int[array.length][array[0].length];
		int[][] temp = new int[array.length][array[0].length];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				length = 0;
				int search = array[row][col];
				searchNeighbours(array, temp, row, col, search);
				checkIsBest(temp, best);
			}
		}
		return best;
	}

	private static void searchNeighbours(int[][] array, int[][] temp, int row,
			int col, int search) {
		if ((col < 0) || (row < 0) || (col >= array[0].length)
				|| (row >= array.length)) {
			// We are out of the array
			return;
		}
		if (array[row][col] == 0) {
			// the value is searched
			return;
		}
		if (array[row][col] == search) {
			temp[row][col] = array[row][col];
			length++;
		} else {
			return;
		}

		array[row][col] = 0;

		searchNeighbours(array, temp, row - 1, col, search);
		searchNeighbours(array, temp, row, col - 1, search);
		searchNeighbours(array, temp, row, col + 1, search);
		searchNeighbours(array, temp, row + 1, col, search);
	}

	private static void checkIsBest(int[][] temp, int[][] best) {
		// delete best
		if (length > maxLength) {
			maxLength = length;
			for (int row = 0; row < best.length; row++) {
				for (int col = 0; col < best[0].length; col++) {
					best[row][col] = 0;
				}
			}
			// copy temp to best
			for (int row = 0; row < temp.length; row++) {
				for (int col = 0; col < temp[0].length; col++) {
					best[row][col] = temp[row][col];
				}
			}
		}
		// delete temp
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[0].length; col++) {
				temp[row][col] = 0;
			}
		}
	}
}
