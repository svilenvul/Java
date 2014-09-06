package sequences;

import java.util.Scanner;

public class MagicMatrix {
	static int cols;
	static int rows;
	static int currRow;
	static int currCol;
	static int[][] matrix;

	private static void print() {
		for (int i = 0; i < matrix.length; i++) {
			for (int l = 0; l < matrix[0].length; l++) {
				System.out.printf(" %d " + " ", matrix[i][l]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printFromTopToDown(int m, int n) {
		rows = m;
		cols = n;
		matrix = new int[rows][cols];

		for (currRow = 0; currRow < rows; currRow++) {
			int sum = currRow + 1;
			for (currCol = 0; currCol < cols; currCol++) {
				matrix[currRow][currCol] = sum;
				sum += rows;
			}
		}
		print();
	}

	public static void printZigZag(int m, int n) {
		int part = -1;
		rows = m;
		cols = n;
		matrix = new int[rows][cols];

		for (currRow = 0; currRow < rows; currRow++) {
			int sum = currRow + 1;
			part += 1;
			for (currCol = 0; currCol < cols; currCol = currCol + 2) {
				matrix[currRow][currCol] = sum;
				sum += 2 * rows;
			}
			for (currCol = 1; currCol < cols; currCol = currCol + 2) {
				matrix[currRow][currCol] = (rows * (currCol + 1)) - part;
			}
		}
		print();
	}

	public static void printDiagonal(int m, int n) {
		rows = m;
		cols = n;
		matrix = new int[rows][cols];
		int value = 1;

		for (currRow = 0; currRow < rows; currRow++) {
			currCol = 0;
			for (int i = currRow, l = currCol; i < rows && l < cols; l++, i++, value++) {
				matrix[i][l] = value;
			}
		}
		for (currCol = 1; currCol < cols; currCol++) {
			currRow = 0;
			for (int i = currRow, l = currCol; l < cols && i < rows; l++, i++, value++) {
				matrix[i][l] = value;
			}
		}
		print();
	}

	public static void printSpiral(int m, int n) {
		int value = 1;
		int startRow = 0;
		int startCol = 0;
		currCol = 0;
		currRow = 0;
		rows = m;
		cols = n;
		matrix = new int[rows][cols];

		while (cols > 0 || rows > 0) {

			// write from top to down
			for (int i = currRow + startRow; i < rows; i++, value++) {
				matrix[i][currCol + startCol] = value;
				currRow = i;
			}
			currCol++;

			// write from left to right
			for (int l = currCol + startCol; l < cols; l++, value++) {
				matrix[currRow][l] = value;
				currCol = l;
			}

			// write from down to top
			currRow--;
			for (int i = currRow; i >= 0 + startRow; i--, value++) {
				matrix[i][currCol] = value;
				currRow = i;
			}

			// write from right to left
			currCol--;
			for (int l = currCol; l > 0 + startCol; l--, value++) {
				matrix[currRow][l] = value;
				currCol = l;
			}

			currRow = 0;
			currCol = 0;
			rows -= 1;
			cols -= 1;
			startRow += 1;
			startCol += 1;
		}

		print();
	}

}
