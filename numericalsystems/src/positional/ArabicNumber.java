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
			System.out.print("сто ");
			break;
		case 2:
			System.out.print("двеста ");
			break;
		case 3:
			System.out.print("триста ");
			break;
		case 4:
			System.out.print("четиристотин ");
			break;
		case 5:
			System.out.print("петстотин ");
			break;
		case 6:
			System.out.print("шестотин ");
			break;
		case 7:
			System.out.print("седемстотин ");
			break;
		case 8:
			System.out.print("осемстотин ");
			break;
		case 9:
			System.out.print("деветстотин ");
			break;
		}

		if (hundreds > 0 && tens > 0 && ones == 0) {
			System.out.print("и ");
		}
		if (hundreds > 0 && tens == 1) {
			System.out.print("и ");
		}
		if (hundreds > 0 && tens == 0 && ones > 0) {
			System.out.print("и ");
		}

		switch (tens) {
		case 1:
			switch (ones) {
			case 0:
				System.out.print("дecet ");
				break;
			case 1:
				System.out.print("единадесет ");
				break;
			case 2:
				System.out.print("дванадесет ");
				break;
			case 3:
				System.out.print("тринадесет ");
				break;
			case 4:
				System.out.print("четиринадecet ");
				break;
			case 5:
				System.out.print("петнадecet ");
				break;
			case 6:
				System.out.print("шестнадecet ");
				break;
			case 7:
				System.out.print("седемнадecet ");
				break;
			case 8:
				System.out.print("осемнадecet ");
				break;
			case 9:
				System.out.print("деветнадecet ");
				break;
			}
			break;
		case 2:
			System.out.print("двадесет ");
			break;
		case 3:
			System.out.print("тридесет ");
			break;
		case 4:
			System.out.print("четирдесет ");
			break;
		case 5:
			System.out.print("петдесет ");
			break;
		case 6:
			System.out.print("шестдесет ");
			break;
		case 7:
			System.out.print("седемдесет ");
			break;
		case 8:
			System.out.print("осемдесет ");
			break;
		case 9:
			System.out.print("деветдесет ");
			break;
		}

		if (tens >= 2 && ones > 0) {
			System.out.print("и ");
			switch (ones) {
			case 1:
				System.out.print("едно");
				break;
			case 2:
				System.out.print("две");
				break;
			case 3:
				System.out.print("три");
				break;
			case 4:
				System.out.print("четири");
				break;
			case 5:
				System.out.print("пет");
				break;
			case 6:
				System.out.print("шест");
				break;
			case 7:
				System.out.print("седем");
				break;
			case 8:
				System.out.print("осем");
				break;
			case 9:
				System.out.print("девет");
				break;
			}

		}
	}

}
