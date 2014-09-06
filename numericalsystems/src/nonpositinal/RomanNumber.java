package nonpositinal;

/**
 * Convert numbers in Roman counting system to Arabic.
 * 
 * @author 888
 *
 */
public class RomanNumber {

	public static int convertToArabic(String romanNumber) {
		int[] convertedRomanNumerals = covertRomanNumerals(romanNumber);
		int result = calculateRomanNumbers(convertedRomanNumerals);
		return result;
	}

	private static int[] covertRomanNumerals(String romanNumber) {
		int[] convertedRomanNumerals = new int[romanNumber.length()];
		for (int index = 0; index < romanNumber.length(); index++) {
			char currentRomanNumeral = romanNumber.charAt(index);
			int convertedRomanNumeral = 0;
			switch (currentRomanNumeral) {
			case 'I':
				convertedRomanNumeral = 1;
				break;
			case 'V':
				convertedRomanNumeral = 5;
				break;
			case 'X':
				convertedRomanNumeral = 10;
				break;
			case 'L':
				convertedRomanNumeral = 50;
				break;
			case 'C':
				convertedRomanNumeral = 100;
				break;
			case 'D':
				convertedRomanNumeral = 500;
				break;
			case 'M':
				convertedRomanNumeral = 1000;
				break;
			default:
				throw new IllegalArgumentException("Invalid value !");
			}
			convertedRomanNumerals[index] = convertedRomanNumeral;
		}

		return convertedRomanNumerals;
	}

	// Read the Roman number from right to left,
	// if the next value is smaller apply subtraction
	// else apply addition.
	private static int calculateRomanNumbers(int[] convertedRomanNumerals) {
		int length = convertedRomanNumerals.length;
		int result = convertedRomanNumerals[length - 1];
		for (int rightNumeral = length - 1; rightNumeral > 0; rightNumeral--) {
			int leftNumeral = rightNumeral - 1;
			if (convertedRomanNumerals[rightNumeral] > convertedRomanNumerals[leftNumeral]) {
				result -= convertedRomanNumerals[leftNumeral];
			} else {
				result += convertedRomanNumerals[leftNumeral];
			}
		}
		return result;
	}

}
