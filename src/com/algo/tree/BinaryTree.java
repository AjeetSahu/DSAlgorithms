/**
 * Binary tree class
 */
package com.algo.tree;

import java.util.*;

/**
 * @author Ajeet
 *
 */
public class BinaryTree {
	BinaryTreeNode root = null;
	
	public void addNode(int data){
		BinaryTreeNode node = new BinaryTreeNode(data);
		if(root == null){
			root = node;
			return;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			if(temp.getLeft() == null){
				temp.setLeft(node);
				return;
			}
			else{
				q.offer(temp.getLeft());
			}
			if(temp.getRight() == null){
				temp.setRight(node);
				return;
			}
			else{
				q.offer(temp.getRight());
			}
		}
	}
	
	public void inOrderTraversal(BinaryTreeNode root){
		if(root != null){
			inOrderTraversal(root.getLeft());
			System.out.println(root.getData());
			inOrderTraversal(root.getRight());
		}
	}
	
	public static void main(String args[]){
		BinaryTree bt = new BinaryTree();
		bt.addNode(1);
		bt.addNode(2);
		bt.addNode(3);
		bt.addNode(4);
		bt.addNode(5);
		bt.addNode(6);
		bt.addNode(7);
		bt.addNode(8);
		bt.inOrderTraversal(bt.root);
	}
}
