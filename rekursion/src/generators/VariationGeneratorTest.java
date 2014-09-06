package generators;

import java.util.ArrayList;
import java.util.Scanner;

public class VariationGeneratorTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("N - number of all elements = ");
		int setLength = input.nextInt();
		System.out.print("K - number of picked = ");
		int subsetLength = input.nextInt();
		input.close();
		ArrayList<int[]> combinations = CombinationGenerator.generate(
				setLength, subsetLength);
		for (int[] comb : combinations) {
			for (int i = 0; i < comb.length; i++) {
				System.out.printf("%d ", comb[i]);
			}
			System.out.println();
		}
	}

}
