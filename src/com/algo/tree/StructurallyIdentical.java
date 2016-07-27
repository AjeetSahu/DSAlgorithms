/**
 * find if given two binary trees are identical.
 */
package com.algo.tree;
/**
 * @author Ajeet
 *
 */
public class StructurallyIdentical {
	
	/**
	 * @params
	 */	
	public boolean structurallyIdentical(BinaryTreeNode root1, BinaryTreeNode root2){
		
		if(root1 == null && root2 == null){
			return true;
		}
		else if((root1 == null && root2 != null) || (root1 != null && root2 == null)){
			return false;
		}
		return(structurallyIdentical(root1.getLeft(), root2.getLeft()) && structurallyIdentical(root1.getRight(),root2.getRight()));
		
		
	}
	
	public static void main(String[] args) {
		
		BinaryTree bt1 = new BinaryTree();
		bt1.addNode(19);
		bt1.addNode(20);
		bt1.addNode(15);
		bt1.addNode(25);
		bt1.addNode(22);
		bt1.addNode(10);
		bt1.addNode(50);
		bt1.addNode(7);
		bt1.addNode(16);
		bt1.addNode(23);
		bt1.addNode(5);
		BinaryTree bt2 = new BinaryTree();
		bt2.addNode(19);
		bt2.addNode(20);
		bt2.addNode(15);
		bt2.addNode(25);
		bt2.addNode(7);
		bt2.addNode(16);
		bt2.addNode(23);
		bt2.addNode(5);
		bt2.addNode(22);
		bt2.addNode(10);
		bt2.addNode(50);
		
		StructurallyIdentical sti = new StructurallyIdentical();
		boolean value = sti.structurallyIdentical(bt1.root, bt2.root);
		System.out.println(value);
	}

}
