/**
 * find diameter of the binary tree.
 */
package com.algo.tree;

/**
 * @author Ajeet
 *
 */
public class DiameterofBinaryTree {

	
	public int diameter(BinaryTreeNode root){
		if(root == null)
			return 0;
		//if Diameter path goes through root
		int d1 = height(root.left) + height(root.right) + 1;
		// If diameter does not go through root of the tree
		int d2 = Math.max(diameter(root.left), diameter(root.right));
		return Math.max(d1, d2);
	}
	
	public int height(BinaryTreeNode root){
		if(root  == null){
			return 0;
		}
		int leftHeight = height(root.getLeft());
		int rightHeight = height(root.getRight());
		 if(leftHeight > rightHeight)
			 return leftHeight + 1; 
		 else
			 return rightHeight + 1;
	}
	
	public static void main(String[] args) {
		DiameterofBinaryTree dbt = new DiameterofBinaryTree();
		BST bst = new BST();
		bst.addNode(19);
		bst.addNode(20);
		bst.addNode(15);
		bst.addNode(25);
		bst.addNode(21);
		bst.addNode(10);
		bst.addNode(50);
		bst.addNode(7);
		bst.addNode(16);
		bst.addNode(23);
		System.out.println(dbt.diameter(bst.root));
	}

}
