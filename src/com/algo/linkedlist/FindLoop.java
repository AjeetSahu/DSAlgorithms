package com.algo.linkedlist;

public class FindLoop {
	
	public static boolean isCircular(LLNode head){
		if(head == null){
			return false; 
		}
		LLNode slowPtr = head;
		LLNode fastPtr = head;
		while(fastPtr.getNext() != null && fastPtr != null){
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if(slowPtr == fastPtr){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.addNodeFront(10);
		ll.addNodeFront(9);
		ll.addNodeFront(7);
		ll.addNodeAfter(7, 8);
		ll.addNodeEnd(11);
		ll.makeLoop(9);
		boolean result = isCircular(ll.header);
		System.out.println(result);
	}

}
