package labirinth;

import java.util.Scanner;

public class LabirinthTest {
	public static void main (String[] args) {

		Labirinth.print();
		
		Scanner input = new Scanner (System.in);
		System.out.println ("Set starting row");
		int rowStart = input.nextInt();
		System.out.println ("Set starting column");
		int colStart = input.nextInt();			
				
		System.out.println ("Set exit row");
		int rowExit = input.nextInt();
		System.out.println ("Set exit column");
		int colExit = input.nextInt();		
		
		Labirinth.searchIn (rowStart, colStart, rowExit, colExit);			
	}
	
}
