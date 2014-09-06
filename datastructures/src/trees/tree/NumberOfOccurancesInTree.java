package trees.tree;

public class NumberOfOccurancesInTree {	
	static int count = 0;	
	
	public static void main(String[] args) {
	        Tree<Integer> tree =
	            new Tree<Integer>(7,
	                    new Tree<Integer>(19,
	                          new Tree<Integer>(1),
	                          new Tree<Integer>(14),
	                          new Tree<Integer>(31)),
	                    new Tree<Integer>(21),
	                    new Tree<Integer>(14,
	                          new Tree<Integer>(23),
	                          new Tree<Integer>(7))
	            );	 
	       int search = 7;
	       System.out.print(tree.getNumberOfOccurances(search));
	    }
}
