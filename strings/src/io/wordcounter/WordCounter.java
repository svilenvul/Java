package io.wordcounter;
/**
 * Uses as input text file. Counts all words,uppercase and lowercase.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	public static int [] countFrom(String inputPath)  {
		//final String INPUT_FILE_PATH = "E:\\01 documents\\3 kurs\\1 sem\\grado\\neda\\test.txt";
		
		String text = readTextFromFile (inputPath);	
		return countWords(text);
		
	}
	/**
	 * The method checks for every symbol in the text, 
	 * if it is start of new word, or word break.
	 * It check also for every word, if it is only 
	 * with uppercase or lowercase characters.
	 * @param text
	 */
	public static int[] countWords(String text) {
		int countAll = 0;
		int countUpperCase = 0;
		int countLowerCase = 0;
		
		boolean firstCharInWord = true;
		StringBuilder currentWord = null;
		for (int i = 0; i < text.length(); i++) {
			char current = text.charAt(i);
			if (Character.isLetter(current) && firstCharInWord) {
				currentWord = new StringBuilder();
				countAll++;
				firstCharInWord = false;
			}
			if (Character.isLetter(current)) {
				currentWord.append(current);
			}
			if (!Character.isLetter(current)) {
				if (currentWord != null) { 
					if (isUpperCase(currentWord.toString())) {
						countUpperCase ++ ;
					} if (isLowerCase(currentWord.toString())) {
						countLowerCase ++ ;
					}					
					//Delete reference to current word  
					currentWord = null;
				}
				firstCharInWord = true;
			}
		}
		int [] result = {countAll,countUpperCase,countLowerCase};
		return result;
		
	}
	
	private static String readTextFromFile (String INPUT_FILE_PATH) {
		Scanner input =  null;
		StringBuilder text =  null;
		
		try {
			input  = new Scanner (new File (INPUT_FILE_PATH));
			System.out.println("File opened");
			text = new StringBuilder();
			String line = null;
			while (input.hasNextLine()) {
				line = input.nextLine();
				text.append(line);
			}	
		} catch (FileNotFoundException fnf) {
			System.out.println("File " + INPUT_FILE_PATH + " not found.");
		} finally {
			if (input != null) {
				input.close();
			}			
		}
		return text.toString();	
	}

	private static boolean isUpperCase(String word) {
		boolean result = word.equals(word.toUpperCase());
		return result;
	}

	private static boolean isLowerCase(String word) {
		boolean result = word.equals(word.toLowerCase());
		return result;
	}

}
