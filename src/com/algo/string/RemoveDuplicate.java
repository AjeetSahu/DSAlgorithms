/**
 * Remove all duplicates from a given string
 */
package com.algo.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Ajeet
 *
 */
public class RemoveDuplicate {

	/**
	 * @param args
	 */
	public String rmDuplicate(String str){
		String result = "";
		HashSet<Character> hs = new HashSet<Character>();
		for(int i = 0; i < str.length(); i++){
			if(!hs.contains(str.charAt(i))){
				hs.add(str.charAt(i));
			}
		}
		Iterator<Character> ite = hs.iterator();
		while(ite.hasNext()){
			result = result + ite.next();
		}
		return result;
	}
	
	public static void main(String[] args) {
		RemoveDuplicate rmObj = new RemoveDuplicate();
		System.out.println(rmObj.rmDuplicate("dfdsfds"));

	}

}
