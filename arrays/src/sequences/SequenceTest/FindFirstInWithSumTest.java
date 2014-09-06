package sequences.SequenceTest;

import java.util.Arrays;

import sequences.Sequence;

public class FindFirstInWithSumTest {
	public static void main(String[] args) {
		int[] test = { 1, 2, 2, 5, 2, 5, 6, 6, 6, 7, 8 };
		int[] test2 = { 1, 2, 12, 5, 5, 5, 3, 4, 6, 7, 8 };
		int[] test3 = { 1, 46, 2, 5, 2, 3, 6, 6, 8, 7, 6 };
		System.out.println(Arrays.toString(Sequence
				.findFirstInWithSum(test, 10)));
		System.out.println(Arrays.toString(Sequence.findFirstInWithSum(test2,
				15)));
		System.out.println(Arrays.toString(Sequence
				.findFirstInWithSum(test, 80)));
	}
}
