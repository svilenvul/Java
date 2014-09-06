package io.bestsubmatrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BestSubmatrix {
	static int bestSum;

	public static void writeFromTo(String inputPath, String outputPath) {
		int[][] matrix = readMatrixFrom(inputPath);
		int[][] submatrix = findBestSubmatrix(matrix);
		writeSubMatrixToFile(submatrix, outputPath);
	}

	private static int[][] readMatrixFrom(String inputPath) {
		final String CHARSET = "windows-1251";

		Scanner fileReader = null;

		int lineNumber = 0;
		int matrixLength;
		int[][] matrix = null;

		try {
			fileReader = new Scanner(new File(inputPath), CHARSET);
			System.out.println("File " + inputPath + " opened.");

			lineNumber++;
			matrixLength = fileReader.nextInt();
			matrix = new int[matrixLength][matrixLength];

			for (int row = 0; row < matrixLength; row++) {
				lineNumber++;
				for (int col = 0; col < matrixLength; col++) {
					matrix[row][col] = fileReader.nextInt();
				}
			}

			return matrix;
		} catch (FileNotFoundException fnf) {
			System.out.println("File " + inputPath + " not found.");
			return matrix;
		} catch (NullPointerException npe) {
			System.out.println("File " + inputPath + " not found.");
			return matrix;
		} catch (NoSuchElementException noe) {
			System.out.println("File " + inputPath + " is empty.");
			return matrix;
		} finally {
			// Close the scanner in the finally block
			if (fileReader != null) {
				fileReader.close();
			}
		}
	}

	private static int[][] findBestSubmatrix(int[][] matrix) {
		// Find the maximal sum platform of size 2 x 2
		bestSum = Integer.MIN_VALUE;
		int bestRow = 0;
		int bestCol = 0;
		for (int row = 0; row < matrix.length - 1; row++) {
			for (int col = 0; col < matrix[0].length - 1; col++) {
				int sum = matrix[row][col] + matrix[row][col + 1]
						+ matrix[row + 1][col] + matrix[row + 1][col + 1];
				if (sum > bestSum) {
					bestSum = sum;
					bestRow = row;
					bestCol = col;
				}
			}
		}

		int[][] submatrix = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int l = 0; l < 2; l++) {
				submatrix[i][l] = matrix[bestRow][bestCol];
			}
		}
		return submatrix;
	}

	private static void writeSubMatrixToFile(int[][] matrix, String outputPath) {
		if (matrix.length != 2 || matrix[0].length != 2) {
			throw new IllegalArgumentException("Incorrect output matrix size");
		}

		PrintStream fileWriter = null;
		try {
			fileWriter = new PrintStream(new File(outputPath));
			fileWriter.println("The best platform is:");
			fileWriter.printf(" %d %d%n", matrix[0][0], matrix[0][1]);
			fileWriter.printf(" %d %d%n", matrix[1][0], matrix[1][1]);
			fileWriter.printf("The maximal sum is: %d%n", bestSum);

			System.out.println("File " + outputPath + " written.");

		} catch (FileNotFoundException fnf) {
			System.out.println("File " + outputPath + " not found.");
		} finally {
			if (fileWriter != null) {
				fileWriter.close();
			}
		}
	}
}
