/**
 * find height of the binary tree recursively
 */
package com.algo.tree;

/**
 * @author Ajeet
 *
 */


public class recursiveHeight {

	/**
	 * Finds height of a given binary tree
	 * @ params
	 * root of binary tree
	 */
	public int findHeight(BinaryTreeNode root){
		if(root == null){
			return 0;
		}
		int left = findHeight(root.getLeft());
		int right = findHeight(root.getRight());
		return Math.max(left+1, right+1);
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
		bt.inOrderTraversal(bt.root);
		recursiveHeight obj = new recursiveHeight();
		int height = obj.findHeight(bt.root);
		System.out.println("Height of binary tree is " + height);
	}

}
