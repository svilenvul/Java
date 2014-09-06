package sort;

import java.util.Arrays;

public class MergeSortTest {
	public static void main(String[] args) {
		int[] list = { 14, 32, 67, 76, 23, 41, 58, 85 };
		int[] list2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] list3 = { 1, 1, 1, 1, 1, 1, 1, 1 };

		System.out.println("before: " + Arrays.toString(list));
		MergeSort.sortAscending(list);
		System.out.println("after:  " + Arrays.toString(list));

		System.out.println("before: " + Arrays.toString(list2));
		MergeSort.sortAscending(list2);
		System.out.println("after:  " + Arrays.toString(list2));

		System.out.println("before: " + Arrays.toString(list3));
		MergeSort.sortAscending(list3);
		System.out.println("after:  " + Arrays.toString(list3));
	}
}
