package sort;

public class QuickSort {

	public static void sort(int x[]) {
		qSort(x, 0, x.length - 1);
	}

	private static void qSort(int x[], int links, int rechts) {
		if (links < rechts) {
			int i = partition(x, links, rechts);
			qSort(x, links, i - 1);
			qSort(x, i + 1, rechts);
		}
	}

	private static int partition(int x[], int left, int right) {
		int pivot, i, j, help;
		pivot = x[right];
		i = left;
		j = right - 1;
		while (i <= j) {
			if (x[i] > pivot) {

				help = x[i];
				x[i] = x[j];
				x[j] = help;
				j--;
			} else
				i++;
		}

		help = x[i];
		x[i] = x[right];
		x[right] = help;
		return i;
	}
}
