package com.algo.linkedlist;

public class LLNode {
	private int data;
	private LLNode next;
	
	public LLNode(int data){
		this.data = data;
		next = null;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setNext(LLNode next){
		this.next = next;
	}
	
	public LLNode getNext(){
		return next;
	}
}
