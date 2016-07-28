/**
 * Find the vertical sum of a binary tree.
 */
package com.algo.tree;

import java.util.*;

/**
 * @author Ajeet
 *
 */
public class VerticalSum {

	/**
	 * Finds vertical sum using findSums function and print the sums.
	 */
	
	public void vertSum(BinaryTreeNode root){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		findSums(root, hm, 0);
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
			System.out.print(entry.getValue() + " ");
		}
	}
	
	/**
	 * supporting function - inserts sum a vertical column to Hashmap
	 */
	public void findSums(BinaryTreeNode root, HashMap<Integer, Integer> hm, int index){
		if(root == null){
			return;
		}
		if(hm.containsKey(index)){
			hm.put(index, hm.get(index)+root.getData());
		}
		else{
			hm.put(index, root.getData());
		}
		findSums(root.getLeft(),hm, index-1);
		findSums(root.getRight(),hm, index+1);
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
		bt.addNode(11);
		bt.addNode(12);
		bt.addNode(13);
		bt.addNode(14);
		bt.addNode(15);
		VerticalSum obj = new VerticalSum();
		obj.vertSum(bt.root);
	}

}
