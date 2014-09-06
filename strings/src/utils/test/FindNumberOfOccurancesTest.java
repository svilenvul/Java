package utils.test;

import utils.StringUtilities;

public class FindNumberOfOccurancesTest {

	public static void main(String[] args) {
		String text = "We are living in a yellow submarine. We don't have anything else. "
				+ "Inside the submarine is very tight. So we are drinking all the day."
				+ " We will move out of it in 5 days.";
		String search = "We";
		String nonExistingWord ="fsdfs";
		System.out.println("The word \"" + search + "\" has " + 
				StringUtilities.findNumberOfOccurances(text, search) + " occurances in text.");	
		System.out.println("The word \"" + nonExistingWord + "\" has " + 
				StringUtilities.findNumberOfOccurances(text, nonExistingWord) + " occurances in text.");	
		
	}
}
