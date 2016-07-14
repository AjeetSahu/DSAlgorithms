package com.algo.linkedlist;

public class ReverseLinkedList {
	// reverse a linked list non recursive
	public void reverseLL(LLNode head){
		if(head == null)
			return;
		LLNode curr = head;
		LLNode next = null, prev = null;
		while(curr != null){
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	// reverse a linked list recursive
	public void recurReverse(LLNode curr, LLNode head){
		if(curr == null){
			return;
		}
		
		LLNode next = curr.getNext();
		
		if(next == null){
			head = curr;
			return;
		}
		recurReverse(next, head);
		next.setNext(curr);
		curr.setNext(null);
	}
	
	public void printLL(LLNode head){
		LLNode temp = head;
		while(temp != null){
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.addNodeFront(9);
		ll.addNodeFront(8);
		ll.addNodeFront(7);
		ll.addNodeFront(6);
		ll.addNodeFront(5);
		ll.addNodeFront(4);
		ll.addNodeFront(3);
		ll.addNodeFront(2);
		ll.addNodeFront(1);
		ReverseLinkedList rll = new ReverseLinkedList();
		rll.printLL(ll.head);
		//rll.recurReverse(ll.header, ll.header);
		rll.reverseLL(ll.head);
		rll.printLL(ll.head);
	}

}
