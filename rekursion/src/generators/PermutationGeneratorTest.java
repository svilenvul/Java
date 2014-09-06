package generators;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationGeneratorTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Set number of elements - n");
		int n = input.nextInt();
		ArrayList<int[]> combinations = PermutationGenerator.generate(n);
		for (int[] comb : combinations) {
			for (int i = 0; i < comb.length; i++) {
				System.out.printf("%d ", comb[i]);
			}
			System.out.println();
		}
	}
}
