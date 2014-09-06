package io.wordcounter;

import java.net.URL;

public class WordCounterTest {
	public static void main(String[]args) {
		URL inputURL = WordCounter.class.getResource("data/CssUnits.txt");
		int []count = WordCounter.countFrom(inputURL.getPath());
		System.out.println("Words count: " + count[0]);
		System.out.println("Words with only uppercase: " + count[1]);
		System.out.println("Words with only lowecase: " + count[2]);
	}
}
