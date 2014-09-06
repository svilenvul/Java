package io.textcode;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;

public class TextCodeTest {
	public static void main (String[] args) throws FileNotFoundException, URISyntaxException {
		URL inputURL = TextCode.class.getResource("data/CssUnits.txt");
		URL outputURL = TextCode.class.getResource("data/CssUnitsReplaced.txt");
		
		TextCode.codeWord(inputURL.getPath(), outputURL.getPath(),"CSS");
	}
}
