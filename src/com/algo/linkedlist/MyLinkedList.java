package com.algo.linkedlist;

public class MyLinkedList {

	public LLNode header;
	
	public MyLinkedList(){
		header = null;
	}
	
	public void addNodeFront(int data){
		LLNode node = new LLNode(data);
		node.setNext(header);
		header = node;
	}
	
	public void addNodeEnd(int data){
		LLNode node = new LLNode(data);
		if(header == null){
			header = node;
		}
		else{
			LLNode temp = header;
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
	}
	
	public void addNodeAfter(int value, int data){
		LLNode node = new LLNode(data);
		if(header == null){
			header = node;
		}
		else{
			LLNode temp = header;
			while(temp.getNext()!= null && temp.getData() != value){
				temp = temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
	}
	
	public void deleteNodeFront(){
		if(header == null){
			System.out.println("List is empty");
		}
		else{
			header = header.getNext();
		}
	}
	
	public void deleteNodeEnd(){
		if(header == null){
			System.out.println("List is empty");
		}
		else{
			LLNode temp = header;
			LLNode prev = null;
			while(temp.getNext() != null){
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(null);
		}
	}
	
	public void deleteNode(int data){
		if(header == null){
			System.out.println("List is empty");
		}
		else{
			LLNode temp = header;
			LLNode prev = header;
			while(temp.getData() != data){
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(temp.getNext());			
		}
	}
	
	public void makeLoop(int data){			
		LLNode temp = header;
		LLNode dataNode = null;
		while(temp.getNext() != null){
			if(temp.getData() == data){
				dataNode = temp;
			}
			temp = temp.getNext();
		}
		temp.setNext(dataNode);
	}
	
	public void print(){
		LLNode temp = header;
		while(temp != null){
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.addNodeFront(10);
		ll.addNodeFront(9);
		ll.addNodeFront(7);
		ll.addNodeAfter(7, 8);
		ll.addNodeEnd(11);
		//ll.makeLoop(9);
		//ll.deleteNode(10);
		//ll.deleteNodeFront();
		//ll.deleteNodeEnd();
		ll.print();
	}
}
