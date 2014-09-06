package sequences.SequenceTest;

import java.util.Arrays;

import sequences.Sequence;

public class FindLongestGrowingInTest {
	public static void main(String[] args) {
		int[] test = { 1, 2, 2, 5, 2, 5, 6, 6, 6, 7, 8 };
		int[] test2 = { 1, 2, 12, 5, 5, 3, 4, 5, 6, 7, 8 };
		int[] test3 = { 1, 46, 2, 8, 6, 3, 6, 6, 8, 7, 6 };
		System.out
				.println(Arrays.toString(Sequence.findLongestGrowingIn(test)));
		System.out
				.println(Arrays.toString(Sequence.findLongestGrowingIn(test2)));
		System.out
				.println(Arrays.toString(Sequence.findLongestGrowingIn(test3)));
	}
}
