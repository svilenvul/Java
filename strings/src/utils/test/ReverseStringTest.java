package utils.test;

import utils.StringUtilities;

public class ReverseStringTest {
	public static void main(String[] args) {
		String text = "C# is not C++ and PHP is not Delphi";	
		String empty ="";
		
		System.out.println (StringUtilities.reverseString(text));
		System.out.println (StringUtilities.reverseString(empty));
		
	}
}
