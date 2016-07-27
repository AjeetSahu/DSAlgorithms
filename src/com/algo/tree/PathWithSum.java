/**
 * Given a sum check whether there exists a path from root to any of the nodes.
 */
package com.algo.tree;

/**
 * @author Ajeet
 *
 */
public class PathWithSum {

	/**
	 * checks all paths of the given binary tree recursively, subtracting value of the node from given sum before hopping
	 * to left and right child of the node.
	 */
	public boolean checkPath(BinaryTreeNode root, int sum){
		if(root == null){
			return false;
		}
		if(root.getLeft() == null && root.getRight() == null && root.getData() == sum){
			return true;
		}
		if(checkPath(root.getLeft(), sum-root.getData()) || checkPath(root.getRight(), sum-root.getData())){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.addNode(1);
		bt.addNode(2);
		bt.addNode(3);
		bt.addNode(4);
		bt.addNode(5);
		bt.addNode(6);
		bt.addNode(7);
		bt.addNode(8);
		bt.addNode(9);
		bt.addNode(10);

	}

}
