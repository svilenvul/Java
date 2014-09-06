package trees.binarytree;

/**
 * The programme checks if binary tree is ideal balanced
 */




import trees.binarytree.BinaryTree.BinaryTreeNode;

public class BinaryTreeBalanced {
	static int leftSum = 0;
	static int rightSum = 0;

	public static void main (String [] args) {
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>(18,
				new BinaryTree<Integer>(29, 
						new BinaryTree<Integer>(23, new BinaryTree<Integer>(21),
								new BinaryTree<Integer>(21)), 
						new BinaryTree<Integer>(6, 
								new BinaryTree<Integer>(11),
								new BinaryTree<Integer>(21))), 
						new BinaryTree<Integer>(15, 
								new BinaryTree<Integer>(3, 
										new BinaryTree<Integer>(10), 
								new BinaryTree<Integer>(21)),
						new BinaryTree<Integer>(10,
								new BinaryTree<Integer>(10), new BinaryTree<Integer>(11))));
		boolean test = binaryTree.isBalanced();
		System.out.println("The binary tree is balanced ?: "+test);
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		int leftSum = 0;
		int rightSum = 0;

		leftSum = countHalf(root.getLeftChild());

		rightSum = countHalf(root.getRightChild());

		if (rightSum - leftSum < 2 && rightSum - leftSum > -2) {
			return true;
		} else {
			return false;
		}
	}

	private static int countHalf(BinaryTreeNode<Integer> childNode) {
		int sum = 0;
		// leftSum++;
		// 1. Visit the left child.
		sum += countChild(childNode.getLeftChild(), sum);

		// 2. Visit the right child

		sum += countChild(childNode.getRightChild(), sum);
		return sum;
	}

	private static int countChild(BinaryTreeNode<Integer> childNode, int sum) {
		if (childNode == null) {
			return sum;
		} else {
			sum++;
			// 1. Visit the left child.
			sum = countChild(childNode.getLeftChild(), sum);

			// 2. Visit the right child

			sum = countChild(childNode.getRightChild(), sum);
			return sum;
		}
	}

}
