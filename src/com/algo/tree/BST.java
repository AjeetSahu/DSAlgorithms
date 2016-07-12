
package com.algo.tree;
import java.util.*;


public class BST {
	BinaryTreeNode root = null;
	
	public void addNode(int data){
		BinaryTreeNode temp = root;
		BinaryTreeNode prev = null;
		if(root == null){
			root = new BinaryTreeNode(data);
			return;
		}
		else{
			while(true){
				if(data < temp.getData()){
					prev = temp;
					temp = temp.getLeft();
					if(temp == null){
						prev.setLeft(new BinaryTreeNode(data));
						return;
					}
				}
				else{
					prev = temp;
					temp = temp.getRight();
					if(temp == null){
						prev.setRight(new BinaryTreeNode(data));
						return;
					}
				}
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
	
	public void preOrderTraversal(BinaryTreeNode root){
		if(root != null){
		System.out.println(root.getData());
		preOrderTraversal(root.getLeft());
		preOrderTraversal(root.getRight());
		}
	}
	
	
	public void postOrderTraversal(BinaryTreeNode root){
		if(root != null){
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.println(root.getData());
		}
	}
	
	public void levelOrderTraversal(BinaryTreeNode root){
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>(); 
		q.add(root);
		while(!q.isEmpty()){
			System.out.println(q.peek().getData());
			if(q.peek().getLeft() != null)
			q.add(q.peek().getLeft());
			if(q.peek().getRight() != null)
			q.add(q.peek().getRight());
			q.poll();
		}
	}
	
	
	
	// Main Method 
	public static void main(String args[]){
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
		bst.inOrderTraversal(bst.root);
	}
}
