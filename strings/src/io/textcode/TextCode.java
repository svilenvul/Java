package io.textcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TextCode {

	public static void codeWord(String inputPath, String outputPath, String word)
			throws URISyntaxException, FileNotFoundException {

		int lineNumber = 0;
		Scanner fileReader = new Scanner(new File(inputPath));
		System.out.println("File" + inputPath + " opened.");
		PrintStream fileWriter = new PrintStream(new File(outputPath));
		System.out.println("File" + outputPath + " opened.");

		String regExp = "\\b" + word + "\\b";
		StringBuilder codedWord = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			codedWord.append("*");
		}
		while (fileReader.hasNextLine()) {
			lineNumber++;
			String line = fileReader.nextLine();
			String lineRepaced = line.replaceAll(regExp, codedWord.toString()); 
			fileWriter.println(lineRepaced);
		}
		fileReader.close();
		fileWriter.close();
		System.out.println("File" + outputPath + " written.");
	}
}
