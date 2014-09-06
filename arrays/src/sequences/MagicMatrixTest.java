package sequences;

import java.util.Scanner;

public class MagicMatrixTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of columns: ");
		int cols = input.nextInt();
		System.out.println("Enter number of rows: ");
		int rows = input.nextInt();

		System.out.println("From top to down:");
		MagicMatrix.printFromTopToDown(cols, rows);
		System.out.println("Zig-zag:");
		MagicMatrix.printZigZag(cols, rows);
		System.out.println("Diagonal:");
		MagicMatrix.printDiagonal(cols, rows);
		System.out.println("Spiral:");
		MagicMatrix.printSpiral(cols, rows);
	}
}
