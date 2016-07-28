/**
 * find height of the binary tree iteratively
 */
package com.algo.tree;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author Ajeet
 *
 */
public class IterativeHeight {

	/**
	 * BinaryTreeNode object
	 */
	public int findHeight(BinaryTreeNode root){
		if(root == null){
			return 0;
		}
		int height = 1;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.remove();
			if(temp != null){
				if(temp.getLeft() != null){
					q.add(temp.getLeft());
				}
				if(temp.getRight() != null){
					q.add(temp.getRight());
				}
			}
			else{
				if(!q.isEmpty()){
					q.add(null);
					height++;
				}
			}
		}
		return height;
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
		IterativeHeight obj = new IterativeHeight();
		int height = obj.findHeight(bt.root);
		System.out.println("Height of binary tree is " + height);

	}

}
