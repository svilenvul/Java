package generators;

/** Generate all subsets with  K elements, from given set.
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetGenerator {
	public static int i = 0;
	private static ArrayList<String[]> allCombinations;

	public static ArrayList<String[]> generate(String[] set,
			int elementsInSubset) {
		if (set.length < elementsInSubset) {
			throw new IllegalArgumentException(
					"The elements in the subset must not"
							+ " be more tha the elements in the set!");
		} else {
			allCombinations = new ArrayList<String[]>();
			String[] subSet = new String[elementsInSubset];
			findAllSubsets(0, set.length, elementsInSubset, set, subSet);
			return allCombinations;
		}
	}

	public static ArrayList<String[]> generateAll(String[] set) {
		int elementsInSubset = set.length;
		allCombinations = new ArrayList<String[]>();
		String[] subSet = new String[elementsInSubset];

		for (int l = 1; l <= set.length; l++) {
			elementsInSubset = l;
			i = 0;
			findAllSubsets(0, set.length, elementsInSubset, set, subSet);
		}
		return allCombinations;
	}

	private static void findAllSubsets(int currentElement, int elementsInSet,
			int elementsInSubset, String[] set, String[] subSet) {
		if (currentElement == elementsInSubset) {
			allCombinations.add(Arrays.copyOf(subSet, elementsInSubset));
			return;
		}
		for (int counter = i; counter < elementsInSet; counter++) {
			i = counter + 1;
			subSet[currentElement] = set[counter];
			findAllSubsets(currentElement + 1, elementsInSet, elementsInSubset,
					set, subSet);
		}
	}

}
