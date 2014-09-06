package associative;

/**
 * Realization of hashMap, that stores more than one values
 */

import java.util.*;


public class MultiValueHashMap {
	
	public static HashMap <String, List <Integer>> create 
			(String [] allInfo) {
		
		HashMap <String, List <Integer>> extendetHashMap = new HashMap <String, List <Integer>>();	
		
		for (String personInfo : allInfo) {	
			List<Integer> information = new ArrayList<Integer>();			
			String [] info = personInfo.split("[:,]+");			
			String name = info[0];			
			for (int i = 1; i < info.length; i++){
				int note = Integer.parseInt (info [i]);				
				information.add(note);
			}			
			extendetHashMap.put(name, information);			
		}		
		
		return extendetHashMap;
	}

}
