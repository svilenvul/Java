package associative;

/**
 * The program creates three series and finds 
 * the union and/or intersection of their sets.
 * @param k = number of members of the rows
 */

import java.util.Set;
import java.util.TreeSet;

public class Series {	
	
	public static Set<Long> union(Set<Long> set1, Set<Long> set2) {		
		Set<Long> union = new  TreeSet <Long> ();
		union.addAll(set1);
		union.addAll(set2);
		return union;
	}
	
	public static Set<Long> intersect(Set<Long> set1, Set<Long> set2) {		
		Set<Long> intersect = new TreeSet <Long> ();
		intersect.addAll(set1);
		intersect.retainAll(set2);
		return intersect;
	}
	
	public static Set <Long> f1 (int numberOfMembers, Set <Long >firstFun) {		
		long result = 1;
		firstFun.add(result);
		
		for (int i = 1; i <= numberOfMembers; i++) {
			result = 2 * result + 3;
			firstFun.add (result);
			if (result > 10000) {
				break;
			}
		}		
		return firstFun;				
	}
	
	public static Set <Long> f2 (int k, Set<Long> secondFun) {		
		long result = 2;
		secondFun.add(result);
		
		for (int i = 1; i <= k; i++) {
			result = 3 * result + 1;
			secondFun.add (result);
			if (result > 10000){
				break;
			}
		}		
		return secondFun;				
	}
	
	public static Set <Long> f3 (int k, Set<Long> thirdFun) {		
		long result = 2;
		thirdFun.add(result);
		
		for (int i = 1 ;i <= k; i++) {			
			result = 2 * result - 1;
			thirdFun.add (result);
			if (result > 10000){
				break;
			}
		}		
		return thirdFun;				
	}
	

}
