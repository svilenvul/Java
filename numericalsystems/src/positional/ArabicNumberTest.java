package positional;

import java.util.Scanner;

public class ArabicNumberTest {
	public static void main (String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("Type arabic number from 1 to 3999: ");	
		int arabicNumber = input.nextInt();		
		
		String converted =  ArabicNumber.convertToRoman(arabicNumber);	
		System.out.print(converted);
	}
}
