package positional;

import java.util.Scanner;

public class NumericConvertorTest {
	
	public static void main (String [] arguments) {	
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter hexadecimal number: ");
		System.out.println("The decimal number is: " + NumericConvertor.anyToDecimal(input.nextLine(),16));
		System.out.println ("Enter decimal number: ");
		System.out.println("The octal number is: "+ NumericConvertor.decToAny(input.nextLine(),8));
		System.out.println ("Enter hexadecimal number: ");
		System.out.println("The binary numer is: "+ NumericConvertor.hexToBin(input.nextLine()));
		System.out.println ("Enter binary number: ");
		System.out.println("The hexadeximal numner is: "+ NumericConvertor.binToHex(input.nextLine()));
	}
	
}
