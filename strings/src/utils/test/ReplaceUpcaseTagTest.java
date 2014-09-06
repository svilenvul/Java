package utils.test;

import utils.StringUtilities;

public class ReplaceUpcaseTagTest {
	public static void main(String[] args) {		
		String text = "We are living in a <upcase>yellow submarine</upcase>.We don't have <upcase>anything</upcase> else.";
		String replaced = StringUtilities.replaceUpcaseTag(text);
		System.out.println (replaced);
	}
}
