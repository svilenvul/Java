package associative;

import java.util.HashMap;

public class TwoKeyHashMapTest {
	public static void main(String[] args) {
		String[] allData = { "A (5,4)", "B (4,7)", "C (3,2)", "D (1,6)" };
		HashMap<Integer, HashMap<Integer, String>> resultMap = TwoKeyHashMap.createDoubleHashMap(allData);
		System.out.print(resultMap.get(3).get(2));
	}
}
