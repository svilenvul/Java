package trees.binarytree;

import java.util.List;
import trees.binarytree.BinaryTree.BinaryTreeNode;

public class FindAllNodesWithChildrenLeaves {

	public static void main(String[] args) {
		// Create the binary tree from the sample.
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>(18,
				new BinaryTree<Integer>(29, new BinaryTree<Integer>(23),
						new BinaryTree<Integer>(6, new BinaryTree<Integer>(10),
								new BinaryTree<Integer>(21))),
				new BinaryTree<Integer>(15, new BinaryTree<Integer>(3), null));

		List<BinaryTreeNode<Integer>> result = binaryTree
				.getAllNodesWithoutGrandChildren();
		for (BinaryTreeNode<Integer> node : result) {
			System.out.println(node.getValue());
		}
	}

}
