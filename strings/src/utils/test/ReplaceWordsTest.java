package utils.test;

import utils.StringUtilities;

public class ReplaceWordsTest {
	
	public static void main(String[] args) {
		String text = "Microsoft announced its next generation Java compiler today."
				+ "It uses advanced parser and special optimizer for the Microsoft JVM.";
		String [] forbidden = {"Java","JVM","Microsoft"};
		String [] empty = {};
		String [] uppcase = {"JAVA","MICROSOFT"};
		System.out.println (StringUtilities.replaceWords (text, forbidden));
		System.out.println (StringUtilities.replaceWords (text, empty));
		System.out.println (StringUtilities.replaceWords (text, uppcase));
	}
}
