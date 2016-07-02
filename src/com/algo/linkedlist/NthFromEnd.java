package com.algo.linkedlist;

// Problem: given a linked list find nth node from the end.
public class NthFromEnd {
	
	public static LLNode nthNode(LLNode head, int n){
		LLNode temp1 = head, temp2 = head;
		for(int i = 0; i < n-1; i++){
			temp2 = temp2.getNext();
		}
		while(temp2.getNext()!= null){
			temp1 = temp1.getNext();
			temp2 = temp2.getNext();
		}
		return temp1;
	}
	
	// recursive solution 
	public static int count = 0;
	public static LLNode nthRecursive(LLNode head, int n){
		if(head != null){
			nthRecursive(head.getNext(), n);
			count++;
			if(count == n){
				System.out.println(head.getData());
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.addNodeFront(14);
		ll.addNodeFront(12);
		ll.addNodeFront(10);
		ll.addNodeFront(9);
		ll.addNodeFront(7);
		ll.addNodeAfter(7, 8);
		ll.addNodeEnd(11);
		ll.print();
		//LLNode node = nthNode(ll.header, 8);
		LLNode node = nthRecursive(ll.header, 8);
		System.out.println("nth node from end is");
		//System.out.println(node);
	}
}
