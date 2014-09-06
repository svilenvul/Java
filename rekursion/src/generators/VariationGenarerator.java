package generators;

/**Prints all variations with repetition of N elements of K class.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class VariationGenarerator {
	private static ArrayList<int[]> allCombinations;

	public static ArrayList<int[]> generate(int setLength, int subsetLength) {
		allCombinations = new ArrayList<int[]>();
		int[] combination = new int[subsetLength];
		nestedLoops(0, setLength, subsetLength, combination);
		return allCombinations;
	}

	private static void nestedLoops(int currentLoop, int setLength,
			int subsetLength, int[] combination) {
		if (currentLoop == subsetLength) {
			allCombinations.add(Arrays.copyOf(combination, subsetLength));
			return;
		}
		for (int counter = 1; counter <= setLength; counter++) {
			combination[currentLoop] = counter;
			nestedLoops(currentLoop + 1, setLength, subsetLength, combination);
		}
	}

}
