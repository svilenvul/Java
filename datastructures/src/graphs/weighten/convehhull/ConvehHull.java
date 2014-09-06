package graphs.weighten.convehhull;

/**
 * The program finds convex 2d hull implementing the Graham Scan algorithm  
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class ConvehHull  {	
	
	public static void main (String[] args) throws URISyntaxException{		
		URL inputFile = ConvehHull.class.getResource("data/garden.txt");
		// Reads data from input file
		ArrayList<double[]> elementsData = readDataFromFile(inputFile);	
		
		
		// Sort elements to find the element with lowest y value
		Collections.sort(elementsData, new ComparatorYValue());
		
		//Takes the coordinates of the point with lowest y value
		double[] startData = elementsData.get(0);
		double startX = startData[0];
		double startY = startData[1];	
		
		//Applying relative angle in relation to the point with lowest y value
		// if = 0  the points are collinear 
		// if > 0 the points define negative angle value (left turn)
		// if < 0 the points define positive angle value (right turn)
		for (int i = 0; i < elementsData.size(); i++) {
			double[] currentData = elementsData.get(i);
			double relativeX = currentData[0] - startX;
			double relativeY = currentData[1] - startY;
			double relativeAngle = Math.atan2(relativeY, relativeX);
			currentData[2] = relativeAngle;
		}	
		// Sort elements based on relative angle value 
		Collections.sort(elementsData, new ComparatorAngle());
		
		int count = 1;
		//Searches sorted elements starting from point with lowest y value		
		while (count < elementsData.size() - 2) {
			double[] previousPointData = elementsData.get(count);
			double[] currentPointData = elementsData.get(count + 1);			
			double[] nextPointData = elementsData.get(count + 2);
			double previousPointX = previousPointData [0];
			double previousPointY = previousPointData [1];
			double currentPointX = currentPointData [0];
			double currentPointY = currentPointData [1];		
			double nextPointX = nextPointData [0];
			double nextPointY = nextPointData [1];
			//Checks if the points build positive or negative angle (left or right turn)
			double angle = (currentPointX - previousPointX) * (nextPointY - previousPointY) -
					(currentPointY - previousPointY) * (nextPointX - previousPointX);
			if (angle > 0) {
				count++;
			} else {				
				elementsData.remove(count+1);
				count--;
			}			
		}
		printResult (elementsData);		
	}
	
	public static ArrayList<double[]> readDataFromFile (URL inputFile) throws URISyntaxException {
		String inputFileName = inputFile.toString();
		Scanner fileReader = null;		
		ArrayList <double []> elementsData = new ArrayList <double []>();
		
		try {
			
			fileReader = new Scanner (new File(inputFile.toURI()));
			System.out.println("File " + inputFileName + " opened.");			
			String line = fileReader.nextLine();	
			if (line.isEmpty()) {
				System.out.println("File" + inputFileName + " is empty.");
				System.exit(0);
			}
			while (!(line = fileReader.nextLine()).isEmpty()) {
				String[] pointData = line.split(" +");				
				double xCoordinate = Double.parseDouble(pointData[0]);
				double yCoordinate = Double.parseDouble(pointData[1]);
				double [] dataInfo = {xCoordinate, yCoordinate, 0};
				elementsData.add(dataInfo);				
			}
			
			return elementsData;

		} catch (NullPointerException npe) {
			System.out.println("File " + inputFileName + " not found.");
		} catch (NoSuchElementException noe) {
			System.out.println("File " + inputFileName + " is readen.");
		} catch (FileNotFoundException fnf) {
			System.out.println("File " + inputFileName + " not found.");
		} finally {			
			if (fileReader != null) {
				fileReader.close();
			}
		}
		return elementsData;
	}	
	
	public static void printResult (ArrayList<double[]> elementsData) {
		System.out.println();		
		for (int i = 0; i < elementsData.size() ; i++) {
			double[] hullPoint = elementsData.get(i);
			System.out.print("(" + hullPoint [0] + ", " + hullPoint [1] + ") - " );
		}		
		double[] hullPoint = elementsData.get(0);
		System.out.print("(" + hullPoint [0] + ", " + hullPoint [1] + ")" );
	}
	
}

class ComparatorYValue implements Comparator<double[]> {
	@Override
	public int compare(double[] a, double[] b) {
		Double a1 = Double.valueOf(a[1]);
		Double b1 = Double.valueOf(b[1]);			
		return a1.compareTo(b1);
	}
}

class ComparatorAngle implements Comparator<double[]> {
	@Override
	public int compare(double[] a, double[] b) {
		Double a1 = Double.valueOf(a[2]);
		Double b1 = Double.valueOf(b[2]);			
		return a1.compareTo(b1);
	}
}
