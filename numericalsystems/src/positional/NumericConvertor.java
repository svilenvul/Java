package positional;

public class NumericConvertor {
	private static int getDecValue(String digit) {
		digit = digit.toUpperCase();
		switch (digit) {
		case "0":return 0;
		case "1":return 1;
		case "2":return 2;
		case "3":return 3;
		case "4":return 4;
		case "5":return 5;
		case "6":return 6;
		case "7":return 7;
		case "8":return 8;
		case "9":return 9;
		case "A":return 10;
		case "B":return 11;
		case "C":return 12;
		case "D":return 13;
		case "E":return 14;
		case "F":return 15;
		default:return Integer.parseInt(digit);
		}
	}

	public static String binToHex(String binNumber) {
		String hex = "";
		String halfbit;
		int value;
		while (binNumber.length() > 4) {
			halfbit = binNumber.substring(binNumber.length() - 4);
			value = Integer.parseInt(halfbit, 2);
			hex = Integer.toHexString(value) + hex;
			binNumber = binNumber.substring(0, binNumber.length() - 4);
		}
		halfbit = binNumber;
		value = Integer.parseInt(halfbit, 2);
		hex = Integer.toHexString(value) + hex;
		return hex;
	}

	public static String hexToBin(String hexNumber) {
		String bin = "";
		String hexDigit;
		int value;
		while (hexNumber.length() > 0) {
			hexDigit = hexNumber.substring(0, 1);
			value = Integer.parseInt(hexDigit, 16);
			bin += Integer.toBinaryString(value);
			hexNumber = hexNumber.substring(1);
		}
		return bin;
	}

	public static String anyToDecimal(String number, int base) {
		int power = 0;
		int decimal = 0;
		double temp;
		String digit;

		while (number.length() > 0) {
			digit = number.substring(number.length() - 1);
			temp = getDecValue(digit) * (Math.pow(base, power));
			decimal += temp;
			power++;
			number = number.substring(0, number.length() - 1);
		}

		return Integer.toString(decimal);
	}

	public static String decToAny(String number, int base) {
		String result = "";
		int remainder;
		int decNumber = getDecValue(number);

		for (int i = decNumber; i > 0; i /= base) {
			remainder = i % base;
			result = remainder + result;
		}
		return result;
	}
}
