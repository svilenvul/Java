package utils;

public class StringUtilities {
	
	public static String reverseString (String text) {
		StringBuilder resultText = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {
			char ch = text.charAt(i);
			resultText.append(ch);
		}
		return resultText.toString();
	}
	
	public static String replaceUpcaseTag (String text) {
		String replacedText = text;
		int startIndex = text.indexOf ("<upcase>",0);
		int endIndex = text.indexOf ("</upcase>",0);
		String lowerCase ;
		String upperCase ;
		String tagsAndLowercase;
		
		while(startIndex >0) {
			lowerCase = text.substring (startIndex + 8, endIndex);
			upperCase = lowerCase.toUpperCase();
			tagsAndLowercase = text.substring (startIndex, endIndex + 9);
			replacedText = replacedText.replace(tagsAndLowercase, upperCase);
			startIndex = text.indexOf ("<upcase>",startIndex + 1);
			endIndex = text.indexOf ("</upcase>",endIndex + 1);
		}		
		
		return replacedText;
	}
	
	public static String replaceWords (String text, String [] forbidden) {
		String repalcedText = text;
		for (int i = 0; i < forbidden.length; i++) {
			 String search = forbidden[i]; 
			 int searchLenght = search.length();					
		
			 StringBuilder replace = new StringBuilder();
			 for(int j = 0; j < searchLenght; j++) {
				 replace.append("*");
			 }			 	
			 repalcedText = repalcedText.replaceAll (search, replace.toString());						
		}
		return repalcedText;	
	}
	
	public static String reverseWordOrder (String text) {
		String reversedText = reverseString(text);
		
		String [] words = reversedText.split("\\s");
		StringBuilder result = new StringBuilder();
		//Write words backwords
		for(int i = 0; i < words.length; i++) {		;
			result.append (reverseString (words [i]));
			result.append(" ");
		}
		
		return result.toString();
	}
	
	public static int findNumberOfOccurances (String text, String search) {
		int counter = 0;		
		search = search.toLowerCase();
		text = text.toLowerCase();
		int index = text.indexOf (search);		
		while (index != -1) {
			counter++;
			index = text.indexOf(search, index + 1);
		}
		return counter;
	}
}
