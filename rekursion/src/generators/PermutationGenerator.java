package generators;

/** Prints all the permutations of numbers from 1 to n. 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationGenerator {
	private static ArrayList<int[]> allPermutations;

	public static ArrayList<int[]> generate(int length) {
		allPermutations = new ArrayList<int[]>();
		int[] permutation = new int[length];
		for (int i = 0; i < length; i++) {
			permutation[i] = i + 1;
		}
		shuffle(length - 1, permutation, 0);
		return allPermutations;
	}

	private static void shuffle(int k, int permutation[], int temp) {
		if (k == 0) {
			allPermutations.add(Arrays.copyOf(permutation, permutation.length));
		} else {
			for (int i = 0; i <= k; i++) {
				temp = permutation[i];
				permutation[i] = permutation[k];
				permutation[k] = temp;
				shuffle(k - 1, permutation, temp);
				temp = permutation[k];
				permutation[k] = permutation[i];
				permutation[i] = temp;
			}
		}
	}

}
