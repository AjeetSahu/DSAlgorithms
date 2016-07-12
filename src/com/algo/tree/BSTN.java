package com.algo.tree;

public class BSTN {
	int data;
	BSTN left;
	BSTN right;
	public BSTN(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public void setData(int data){
		this.data = data;
		}
	public int getData(){
		return data;
	}
	public void setLeft(BSTN node){
		this.left = node;
	}
	public BSTN getLeft(){
		return left;
	}
	public void setRight(BSTN node){
		this.right = node;
	}
	public BSTN getRight(){
		return right;
	}
	
}
