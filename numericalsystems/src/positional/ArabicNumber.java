package positional;

/**
 * Converts Arabic values with Roman. Works with values from 1 to 3999.
 */
public class ArabicNumber {

	public static String convertToRoman(int arabicNumber) {
		int thousands = arabicNumber / 1000;
		int hundrets = (arabicNumber / 100) % 10;
		int tens = (arabicNumber / 10) % 10;
		int units = arabicNumber % 10;
		if (thousands >= 4 || thousands == 0 && hundrets == 0 && tens == 0
				&& units == 0) {
			throw new IllegalArgumentException(
					"Invalid number! Valid numbers 1 to 3999!");
		}
		int[] arabicNumerals = { thousands, hundrets, tens, units };
		StringBuilder result = new StringBuilder();

		char[] romanNumerals = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
		for (int i = 0; i < arabicNumerals.length; i++) {
			switch (arabicNumerals[i]) {
			case 0:
				break;
			case 1:
				result.append(romanNumerals[2 * i]);
				break;
			case 2:
				result.append(romanNumerals[2 * i]);
				result.append(romanNumerals[2 * i]);
				break;
			case 3:
				result.append(romanNumerals[2 * i]);
				result.append(romanNumerals[2 * i]);
				result.append(romanNumerals[2 * i]);
				break;
			case 4:
				result.append(romanNumerals[2 * i]);
				result.append(romanNumerals[2 * (i - 1) + 1]);
				break;
			case 5:
				result.append(romanNumerals[2 * (i - 1) + 1]);
				break;
			case 6:
				result.append(romanNumerals[2 * (i - 1) + 1]);
				result.append(romanNumerals[i]);
				break;
			case 7:
				result.append(romanNumerals[2 * (i - 1) + 1]);
				result.append(romanNumerals[2 * i]);
				result.append(romanNumerals[2 * i]);
				break;
			case 8:
				result.append(romanNumerals[2 * (i - 1) + 1]);
				result.append(romanNumerals[2 * i]);
				result.append(romanNumerals[2 * i]);
				result.append(romanNumerals[2 * i]);
				break;
			case 9:
				result.append(romanNumerals[2 * i]);
				result.append(romanNumerals[2 * (i - 1)]);
				break;
			}
		}
		return result.toString();
	}

	public static void printInBulgarian(int number) {
		int ones = number % 10;
		int dividedByTen = (number / 10);
		int tens = dividedByTen % 10;
		int dividedByHundred = dividedByTen / 10;
		int hundreds = dividedByHundred % 10;

		switch (hundreds) {
		case 1:
			System.out.print("��� ");
			break;
		case 2:
			System.out.print("������ ");
			break;
		case 3:
			System.out.print("������ ");
			break;
		case 4:
			System.out.print("������������ ");
			break;
		case 5:
			System.out.print("��������� ");
			break;
		case 6:
			System.out.print("�������� ");
			break;
		case 7:
			System.out.print("����������� ");
			break;
		case 8:
			System.out.print("���������� ");
			break;
		case 9:
			System.out.print("����������� ");
			break;
		}

		if (hundreds > 0 && tens > 0 && ones == 0) {
			System.out.print("� ");
		}
		if (hundreds > 0 && tens == 1) {
			System.out.print("� ");
		}
		if (hundreds > 0 && tens == 0 && ones > 0) {
			System.out.print("� ");
		}

		switch (tens) {
		case 1:
			switch (ones) {
			case 0:
				System.out.print("�ecet ");
				break;
			case 1:
				System.out.print("���������� ");
				break;
			case 2:
				System.out.print("���������� ");
				break;
			case 3:
				System.out.print("���������� ");
				break;
			case 4:
				System.out.print("���������ecet ");
				break;
			case 5:
				System.out.print("������ecet ");
				break;
			case 6:
				System.out.print("�������ecet ");
				break;
			case 7:
				System.out.print("��������ecet ");
				break;
			case 8:
				System.out.print("�������ecet ");
				break;
			case 9:
				System.out.print("��������ecet ");
				break;
			}
			break;
		case 2:
			System.out.print("�������� ");
			break;
		case 3:
			System.out.print("�������� ");
			break;
		case 4:
			System.out.print("���������� ");
			break;
		case 5:
			System.out.print("�������� ");
			break;
		case 6:
			System.out.print("��������� ");
			break;
		case 7:
			System.out.print("���������� ");
			break;
		case 8:
			System.out.print("��������� ");
			break;
		case 9:
			System.out.print("���������� ");
			break;
		}

		if (tens >= 2 && ones > 0) {
			System.out.print("� ");
			switch (ones) {
			case 1:
				System.out.print("����");
				break;
			case 2:
				System.out.print("���");
				break;
			case 3:
				System.out.print("���");
				break;
			case 4:
				System.out.print("������");
				break;
			case 5:
				System.out.print("���");
				break;
			case 6:
				System.out.print("����");
				break;
			case 7:
				System.out.print("�����");
				break;
			case 8:
				System.out.print("����");
				break;
			case 9:
				System.out.print("�����");
				break;
			}

		}
	}

}
