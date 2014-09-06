package trees.binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Represents a binary tree structure.
 */
public class BinaryTree<T> {

	/**
	 * Represents a binary tree node.
	 * 
	 * @param <T>
	 *            - the type of the values in nodes.
	 */
	public static class BinaryTreeNode<T> {
		// Contains the value of the node
		private T value;

		// Shows whether the current node has parent
		private boolean hasParent;

		// Contains the left child of the node
		private BinaryTreeNode<T> leftChild;

		// Contains the right child of the node
		private BinaryTreeNode<T> rightChild;

		/**
		 * Constructs a binary tree node.
		 * 
		 * @param value
		 *            - the value of the node.
		 * @param leftChild
		 *            - the left child of the node.
		 * @param rightChild
		 *            - the right child of the node.
		 */
		public BinaryTreeNode(T value, BinaryTreeNode<T> leftChild,
				BinaryTreeNode<T> rightChild) {
			if (value == null) {
				throw new IllegalArgumentException("Cannot insert null value!");
			}

			this.value = value;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
		}

		/**
		 * Constructs a binary tree node with no children.
		 * 
		 * @param value
		 *            - the value of the node.
		 */
		public BinaryTreeNode(T value) {
			this(value, null, null);
		}

		/**
		 * @return the value of the node.
		 */
		public T getValue() {
			return this.value;
		}

		/**
		 * Sets the value of the node.
		 * 
		 * @param value
		 *            - the value to be set.
		 */
		public void setValue(T value) {
			this.value = value;
		}

		/**
		 * @return the left child or null if it does not exists.
		 */
		public BinaryTreeNode<T> getLeftChild() {
			return this.leftChild;
		}

		/**
		 * Sets the left child.
		 * 
		 * @param value
		 *            - the new left child to be set.
		 */
		public void setLeftChild(BinaryTreeNode<T> value) {
			if (value == null || value.hasParent) {
				throw new IllegalArgumentException();
			}

			value.hasParent = true;
			this.leftChild = value;
		}

		/**
		 * @return the right child or null if it does not exists.
		 */
		public BinaryTreeNode<T> getRightChild() {
			return this.rightChild;
		}

		/**
		 * Sets the right child.
		 * 
		 * @param value
		 *            - the new right child to be set.
		 */
		public void setRightChild(BinaryTreeNode<T> value) {
			if (value == null || value.hasParent) {
				throw new IllegalArgumentException();
			}

			value.hasParent = true;
			this.rightChild = value;
		}
	}

	// The root of the tree
	private BinaryTreeNode<T> root;

	/**
	 * Constructs the tree.
	 * 
	 * @param value
	 *            - the value of the node.
	 * @param children
	 *            - the children of the node.
	 */
	public BinaryTree(T value, BinaryTree<T> leftChild, BinaryTree<T> rightChild) {
		if (value == null) {
			throw new IllegalArgumentException();
		}

		BinaryTreeNode<T> leftChildNode = leftChild != null ? leftChild.root
				: null;
		BinaryTreeNode<T> rightChildNode = rightChild != null ? rightChild.root
				: null;
		this.root = new BinaryTreeNode<T>(value, leftChildNode, rightChildNode);
	}

	/**
	 * Constructs the tree.
	 * 
	 * @param value
	 *            - the value of the node.
	 */
	public BinaryTree(T value) {
		this(value, null, null);
	}

	/**
	 * @return the root of the tree.
	 */

	public BinaryTreeNode<T> getRoot() {
		return this.root;
	}

	public boolean isBalanced() {
		int leftSum = 0;
		int rightSum = 0;

		leftSum = countHalf(this.root.getLeftChild());

		rightSum = countHalf(this.root.getRightChild());

		if (rightSum - leftSum < 2 && rightSum - leftSum > -2) {
			return true;
		} else {
			return false;
		}
	}

	private int countHalf(BinaryTreeNode<T> childNode) {
		int sum = 0;
		// leftSum++;
		// 1. Visit the left child.
		sum += countChild(childNode.getLeftChild(), sum);

		// 2. Visit the right child

		sum += countChild(childNode.getRightChild(), sum);
		return sum;
	}

	private int countChild(BinaryTreeNode<T> childNode, int sum) {
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

	public List<BinaryTreeNode<T>> getAllNodesWithoutGrandChildren() {
		List<BinaryTreeNode<T>> list = new LinkedList<BinaryTreeNode<T>>();
		Queue<BinaryTreeNode<T>> children = new LinkedList<BinaryTreeNode<T>>();
		BinaryTreeNode<T> node = root;
		boolean hasGrandChildren;
		do {
			if (node.getLeftChild() != null) {
				children.add(node.getLeftChild());
			}
			if (node.getRightChild() != null) {
				children.add(node.getRightChild());
			}
			node = children.poll();
			hasGrandChildren = hasGrandChildren(node);
			if (hasGrandChildren == false) {
				list.add(node);
			}
		} while (!(children.isEmpty()));

		return list;
	}

	private boolean hasGrandChildren(BinaryTreeNode<T> child) {
		BinaryTreeNode<T> leftChild = child.getLeftChild();
		BinaryTreeNode<T> rightChild = child.getRightChild();

		// Case 1: left child has children
		if (leftChild != null && rightChild == null) {
			if (leftChild.getLeftChild() == null
					&& leftChild.getRightChild() == null) {
				return false;
			} else {
				return true;
			}
		}
		// Case 2: right child has children
		else if (rightChild != null && leftChild == null) {
			if (rightChild.getLeftChild() == null
					&& rightChild.getRightChild() == null) {
				return false;
			} else {
				return true;
			}
		}
		// Case 3: right child and left child have children
		else if (rightChild != null && leftChild != null) {
			if (rightChild.getLeftChild() == null
					&& rightChild.getRightChild() == null
					&& leftChild.getLeftChild() == null
					&& leftChild.getRightChild() == null) {
				return false;
			} else {
				return true;
			}
		}
		// Case 4: the childhas grandchildren
		else {
			return true;
		}
	}

	public List<BinaryTreeNode<T>> getNodesAtDeepness(int deepness) {
		List<BinaryTreeNode<T>> list = new LinkedList<BinaryTreeNode<T>>();

		list = searchTreeByDeepness(root, 0, deepness, list);
		return list;

	}

	private List<BinaryTreeNode<T>> searchTreeByDeepness(
			BinaryTreeNode<T> root, int currDeepness, int searchDeepness,
			List<BinaryTreeNode<T>> list) {
		if (root == null) {
			return list;
		}

		currDeepness++;

		// 1. Visit the left child.
		list = searchTreeByDeepness(root.getLeftChild(), currDeepness,
				searchDeepness, list);

		// 2. Visit the right child.
		list = searchTreeByDeepness(root.getRightChild(), currDeepness,
				searchDeepness, list);
		currDeepness--;
		if (currDeepness == searchDeepness) {
			list.add(root);
			return list;
		} else {
			return list;
		}

	}

	/**
	 * @return the left child of the root.
	 */
	public BinaryTreeNode<T> getLeftChildNode() {
		if (this.root != null) {
			return this.root.getLeftChild();
		}

		return null;
	}

	/**
	 * @return the right child of the root.
	 */
	public BinaryTreeNode<T> getRightChildNode() {
		if (this.root != null) {
			return this.root.getRightChild();
		}

		return null;
	}

	/**
	 * Traverses binary tree in pre-order manner.
	 * 
	 * @param root
	 *            - the binary tree to be traversed.
	 */
	private void printPreOrder(BinaryTreeNode<T> root) {
		if (root == null) {
			return;
		}

		// 1. Visit the left child.
		printPreOrder(root.getLeftChild());

		// 2. Visit the root of this subtree.
		System.out.print(root.getValue() + " ");

		// 3. Visit the right child.
		printPreOrder(root.getRightChild());
	}

	/**
	 * Traverses and prints the binary tree in pre-order manner.
	 */
	public void printPreOrder() {
		printPreOrder(this.root);
		System.out.println();
	}
}

