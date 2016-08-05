/**
 * Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that has exactly k distinct characters.
 */
package com.algo.string;

import java.util.*;

/**
 * @author Ajeet
 *
 */
public class SubstrDiffChar {


	public int countSubstrings(String str, int k){
		int count = 0;
		int j;
		int len = str.length();
		String temp = "";
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0; i< len; i++){
			for(j = i; j<len; j++){
				if(hs.size() == k){
					count++;
					System.out.println(temp);
					if(hs.contains(str.charAt(j))){
						temp = temp + str.charAt(j);
					}
					else{
						temp = "";
						j = len;
					}
				}
				else{
					temp = temp + str.charAt(j);
					if(!hs.contains(str.charAt(j))){
						hs.add(str.charAt(j));
					}
				}
			}
			
			if(j == len && hs.size() == k){
				count++;
				System.out.println(temp);
				temp = "";
			}
			hs.clear();
		}
		return count;
	}
	
	public static void main(String[] args) {
		SubstrDiffChar obj = new SubstrDiffChar();
		int result = obj.countSubstrings("ajeet", 2);
		System.out.println(result);
	}

}
