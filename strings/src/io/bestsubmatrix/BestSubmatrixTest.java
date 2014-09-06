package io.bestsubmatrix;

import java.net.URL;

public class BestSubmatrixTest {
	public static void main(String[]args) {
		URL inputURL = BestSubmatrix.class.getResource("data/Matrix.txt");
		URL outputURL = BestSubmatrix.class.getResource("data/BestSubmatrix.txt");
		
		BestSubmatrix.writeFromTo(inputURL.getPath(), outputURL.getPath());
	}
}
