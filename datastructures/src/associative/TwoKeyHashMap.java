package associative;

/**
 * Realization of hashmap that sores elements with two keys
 */

import java.util.*;

public class TwoKeyHashMap {
	
	public static HashMap<Integer, HashMap<Integer, String>> createDoubleHashMap(
			String[] allData) {

		HashMap<Integer, HashMap<Integer, String>> outerHashMap = 
				new HashMap<Integer, HashMap<Integer, String>>();
		HashMap<Integer, String> innerHashMap = new HashMap<Integer, String>();

		for (String singlePoint : allData) {
			String[] dataPoint = singlePoint.split("[(,)]");
			String pointName = dataPoint[0];
			int pointX = Integer.parseInt(dataPoint[1]);
			int pointY = Integer.parseInt(dataPoint[2]);
			innerHashMap.put(pointY, pointName);
			outerHashMap.put(pointX, innerHashMap);
		}

		return outerHashMap;
	}

}
