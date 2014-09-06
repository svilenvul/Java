package emailvalidator;
/**
 * Open file with names and email addresses and writes the valid one in other file.
 * An email is valid, if it matches the pattern: * <username>@<host>.<domain>, where
 * <username> consists of Latin characters and "_" symbol,
 * <host> consists of small caps Latin characters,
 * <domain> consists of 2 to 4 small caps Latin characters. * 
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.util.*;

public class EmailValidator {
	
	public static void validateEmails (String inputFilePath, String outputFilePath) throws URISyntaxException {
		final String charset = "windows-1251";		
		Scanner reader = null;
		PrintStream writer = null;	
		
		System.out.println("File" + inputFilePath + " opened.");
		try {
			reader =  new Scanner (new File (inputFilePath),charset);			
			writer = new PrintStream (new File (outputFilePath));
			
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				if (line.matches("[a-zA-z]+\\s[a-zA-Z]+\\s[a-zA-z_]+@[a-z]+.[a-z]{2,4}")) {
					System.out.println("Valid mail: " + line);
					writer.println(line);
				}
			}			
			System.out.println("File" + outputFilePath + " writen.");
		} catch (IOException ioex){
			System.err.println("Can not read or write file " + ioex);
		} finally {
			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}						
		}
	}
}
