/**
 * Print all the duplicates in the input string 
 */
package com.algo.string;
import java.util.*;
/**
 * @author Ajeet
 *
 */
public class PrintDuplicate {

	/**
	 * @param args
	 */
	public void printDupli(String str){
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++){
			if(!hm.containsKey(str.charAt(i))){
				hm.put(str.charAt(i), 1);
			}
			else{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue() > 1){
				System.out.println("Key " + entry.getKey() + " and value " + entry.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		PrintDuplicate obj = new PrintDuplicate();
		obj.printDupli("ajeet sahu");

	}

}
