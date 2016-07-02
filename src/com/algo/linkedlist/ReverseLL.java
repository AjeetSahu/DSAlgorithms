package com.algo.linkedlist;

public class ReverseLL {

	public static void reverseLinkedList(LLNode current, LLNode head){
		if(current == null){
			return;
		}
		LLNode next = current.getNext();
		if(next == null){
			head = current;
			return;
		}
		reverseLinkedList(next, head);
		next.setNext(current);
		current.setNext(null);
	}
	
	public static LLNode reverseIterative(LLNode head){
		LLNode temp = head;
		LLNode previous = null;
		LLNode next;
		while(temp != null){
			next = temp.getNext();
			temp.setNext(previous);
			previous = temp;
			temp = next;
		}
		head = previous;
		return head;
	}
	
	public static void main(String[] args) {
		
		

	}

}
