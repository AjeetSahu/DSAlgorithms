package com.algo.linkedlist;
import java.util.*;

class result{
	int count;
	LLNode node;
	public result(LLNode node, int count){
		this.node = node;
		this.count = count;
	}
}

public class LoopLinkedList {
	
	public result findLoop(MyLinkedList ll){
		HashMap<LLNode,Integer> hm = new HashMap<LLNode,Integer>();
		LLNode temp = ll.header;
		int count = 0;
		while(temp != null){
			if(hm.containsKey(temp)){
				break;
			}
			hm.put(temp, 1);
			count++;
			temp = temp.getNext();
		}
		result robj = new result(temp, count);
		return robj;
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
		ll.makeLoop(4);
		//ll.print();
		LoopLinkedList obj = new LoopLinkedList();
		result robj = obj.findLoop(ll);
		System.out.println(robj.node.getData() + " " + robj.count);
		

	}

}
