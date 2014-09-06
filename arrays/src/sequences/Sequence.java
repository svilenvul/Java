package sequences;

public class Sequence {

	private static int[] findLongestIn(int[] array,
			int differenceBetweenNumbers) {
		int lenght = 1;
		int bestLenght = 0;
		int start = 0;
		int bestStart = 0;
		int nextNumber = 0;

		for (int i = 0; i < array.length - 1; i++) {
			nextNumber = array[i + 1] - differenceBetweenNumbers;
			if (array[i] == nextNumber) {
				if (lenght == 1) {
					start = i;
				}
				lenght++;
			} else {
				if (lenght > bestLenght) {
					bestLenght = lenght;
					bestStart = start;
				}
				lenght = 1;
			}
		}
		if (lenght > bestLenght) {
			bestLenght = lenght;
			bestStart = start;
		}
		int[] sequence = new int[bestLenght];

		for (int i = bestStart, l = 0; i < bestStart + bestLenght; i++, l++) {
			sequence[l] = array[i];
		}

		return sequence;
	}

	public static int[] findLongestGrowingIn(int[] array) {
		return findLongestIn(array, 1);
	}

	public static int[] findLongestEqualIn(int[] array) {
		return findLongestIn(array, 0);
	}

	public static int[] findFirstInWithSum(int[] array, int sum) {
		int tempSum = 0;
		int length;
		int[] sequence;

		for (int k = 0; k < array.length; k++) {
			tempSum = array[k];
			length = 1;
			if (tempSum == sum) {
				sequence = new int[length];
				sequence[0] = array[k];
				return sequence;
			}
			for (int l = k + 1; l < array.length; l++) {
				tempSum += array[l];
				length += 1;
				if (tempSum == sum) {
					sequence = new int[length];
					for (int i = (l - length + 1), h = 0; i < (l + 1); i++, h++) {
						sequence[h] = array[i];
					}
					return sequence;
				}
				if (tempSum > sum) {
					break;
				}
			}

		}
		return null;
	}

}
