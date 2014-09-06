package generators;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetGeneratorTest {

	public static void main(String[] args) {
		final String[] SET = { "test", "rock", "fun", "smash" };
		Scanner input = new Scanner(System.in);
		System.out.print("K - number of elements in the subset = ");
		int elementsInSubset = input.nextInt();
		input.close();
		ArrayList<String[]> combinations = SubsetGenerator.generate(SET,
				elementsInSubset);
		for (String[] comb : combinations) {
			for (int i = 0; i < comb.length; i++) {
				System.out.print(comb[i] + " ");
			}
			System.out.println();
		}

		ArrayList<String[]> allCombinations = SubsetGenerator.generateAll(SET);
		for (String[] comb : allCombinations) {
			for (int i = 0; i < comb.length; i++) {
				System.out.print(comb[i] + " ");
			}
			System.out.println();
		}
	}
}
