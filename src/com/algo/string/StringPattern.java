/**
 * Check if string follows order of characters defined by a pattern or not
 * string = "engineers rock"
   pattern = "er";
   Output: true
   Explanation: All 'e' in the input string are before all 'r'.
 */
package com.algo.string;
import java.util.*;
/**
 * @author Ajeet
 *
 */
public class StringPattern {

	/**
	 * @param args
	 */
	public boolean hasPattern(String str, String pattern){
		if(str == null){
			return false;
		}
		if(pattern == null){
			return true;
		}
		int current = 1;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0; i < pattern.length(); i++){
			hm.put(pattern.charAt(i), i+1);
		}
		for(int i = 0; i < str.length(); i++){
			if(hm.containsKey(str.charAt(i))){
				if(hm.get(str.charAt(i)) == current){
					continue;
				}
				else if(hm.get(str.charAt(i)) > current){
					current = hm.get(str.charAt(i));
				}
				else{
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		StringPattern spObj = new StringPattern();
		boolean result = spObj.hasPattern("assaasfsfscdffd", "abcd");
		System.out.println(result);
	}

}
