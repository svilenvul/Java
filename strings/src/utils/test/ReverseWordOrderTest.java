package utils.test;

import utils.StringUtilities;

public class ReverseWordOrderTest {

	public static void main(String[] args) {
		String text = "C# is not C++ and PHP is not Delphi";	
		String empty ="";
		String oneWord ="Philadelphia";
		String hard ="John´s mother is ill.";
		System.out.println (StringUtilities.reverseWordOrder(text));
		System.out.println (StringUtilities.reverseWordOrder(empty));
		System.out.println (StringUtilities.reverseWordOrder(oneWord));
		System.out.println (StringUtilities.reverseWordOrder(hard));
	}
}
