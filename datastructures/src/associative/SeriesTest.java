package associative;

import java.util.HashSet;
import java.util.Set;

public class SeriesTest {
	public static void main(String[] args) {		
		int numberOfMembers = 10;
		
		 Set <Long > firstFun = new HashSet <Long> ();
		 Set <Long > secondFun = new HashSet <Long> ();
		 Set <Long > thirdFun = new HashSet <Long>  ();
		
			
		firstFun = Series.f1(numberOfMembers,firstFun);
		secondFun = Series.f2(numberOfMembers,secondFun);
		thirdFun = Series.f3(numberOfMembers,thirdFun);		
		
		Set <Long > unionFirstSecond = Series.union(firstFun,secondFun);
		Set <Long > intersectFirstThird = Series.intersect(firstFun,thirdFun);
		
		System.out.println(unionFirstSecond.toString());
		System.out.println(intersectFirstThird.toString());
		
	}
}
