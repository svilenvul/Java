package trees.binarytree;

/**
 * The programme finds the sum of the nodes at each level
 */

import java.util.List;

import trees.binarytree.BinaryTree.BinaryTreeNode;

public class GetNodesAtLevel {

	static int maxDeepness = 0;

	public static void main(String[] args) {

		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>(18,
				new BinaryTree<Integer>(29, new BinaryTree<Integer>(23),
						new BinaryTree<Integer>(6, new BinaryTree<Integer>(10),
								new BinaryTree<Integer>(21))),
				new BinaryTree<Integer>(15, new BinaryTree<Integer>(3), null));

		List<BinaryTreeNode<Integer>> result = binaryTree.getNodesAtDeepness(3);

		// Print the result
		for (BinaryTreeNode<Integer> node : result) {
			System.out.println(node.getValue());
		}
	}

}
