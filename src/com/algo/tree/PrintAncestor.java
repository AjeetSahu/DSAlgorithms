/**
 * print all the ancestors of a given node in binary tree.
 */
package com.algo.tree;

/**
 * @author Ajeet
 *
 */
public class PrintAncestor {

	public boolean printAnce(BinaryTreeNode root, int data){
		if(root == null){
			return false;
		}
		if(root.getData() == data){
			System.out.print(root.getData() + " ");
			return true;
		}
		if(printAnce(root.getLeft(), data) || printAnce(root.getRight(), data)){
			System.out.print(root.getData() + " ");
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
		PrintAncestor obj = new PrintAncestor();
		obj.printAnce(bt.root, 5);
	}

}
