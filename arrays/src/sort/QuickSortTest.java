package sort;

import java.util.Arrays;

public final class QuickSortTest {

	public static void main(String[] args) {
		int[] numbers = { 0, 9, 4, 6, 2, 8, 5, 1, 7, 3 };
		int[] numbers2 = { 8, 8, 4, 6, 4, 1, 1, 1, 8, 3 };
		int[] numbers3 = { 0, 1, 2, 3, 4, 5, 6, 7, 7, 8 };

		System.out.println("before: " + Arrays.toString(numbers));
		QuickSort.sort(numbers);
		System.out.println("after: " + Arrays.toString(numbers));

		System.out.println("before: " + Arrays.toString(numbers2));
		QuickSort.sort(numbers2);
		System.out.println("after: " + Arrays.toString(numbers2));

		System.out.println("before: " + Arrays.toString(numbers2));
		QuickSort.sort(numbers2);
		System.out.println("after: " + Arrays.toString(numbers2));

	}

}
