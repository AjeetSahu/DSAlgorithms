/**
 * Given a tree with special property where leaves are represented with 'L' and internal nodes are represented
 * with 'I'.  Also assume the tree has either 0 or 2 children. Given preorder traversal of this tree, construct
 * the tree.
 */
package com.algo.tree;

/**
 * @author Ajeet
 *
 */
public class SpecialTree {

	/**
	 * @param args
	 */
	public void constructTree(char[] preOrder){
		int len = preOrder.length;
		constTree(preOrder, len);
	}
	
	public BinaryTreeNode constTree(char[] preOrder, int i){
		if(preOrder == null){
			return null;
		}
		if(preOrder.length == i){
			return null;
		}
		BinaryTreeNode node = new BinaryTreeNode(preOrder[i]);
		if(node.getData() == 'L'){
			return node;
		}
		else{
			i++;
			node.setLeft(constTree(preOrder, i));
			i++;
			node.setRight(constTree(preOrder, i));
		}
		return node;
	}
	
	public static void main(String[] args) {
		

	}

}
