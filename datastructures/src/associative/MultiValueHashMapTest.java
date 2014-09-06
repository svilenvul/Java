package associative;

import java.util.HashMap;
import java.util.List;

public class MultiValueHashMapTest {
	
	public static void main(String[] args) {
		String [] allInfo = {"Svilen Valkanov:6,5,3,4,6", 
				"Dobrqna Koleva:3,4,5,6,6,6", "Kircho Minchev:3,4,2,3,4,5"};
	
		HashMap <String, List <Integer>> extendetHashMap = 
				MultiValueHashMap.create (allInfo);
		System.out.print(extendetHashMap.get("Svilen Valkanov"));	
	}
}
