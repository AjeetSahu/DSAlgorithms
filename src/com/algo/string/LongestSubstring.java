package com.algo.string;
import java.util.*;

//problem
/*
	Given a string, find the length of the longest substring without repeating characters.
*/
public class LongestSubstring {
	
	public static int nonRepeatingSubstring(String str){
		int length = str.length();
		char[] arr = new char[length];
		arr = str.toCharArray();
		int i = 0, j = 0, result = 0; 
		Set<Character> set = new HashSet<Character>(); 
		while(i < length && j < length){
			if(!set.contains(arr[j])){
				set.add(arr[j]);
				j++;
				result = Math.max(result, (j-i));
			}
			else{
				set.remove(arr[i]);
				i++;
			}
		}
		return result;
	}
	
	public static int subString(String str){
		
		int length = str.length();
		char[] arr = new char[length];
		arr = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int i = 0, j = 0, result = 0;
		while(i < length && j < length){
			if(hm.containsKey(arr[j])){
				int position = hm.get(arr[j]);
				i = Math.max(position + 1, i);
				hm.put(arr[j], j);
			}
			else{
				hm.put(arr[j], j);
			}
			result = Math.max(result, (j-i+1));
			j++;
		}
		return result;
	}

	public static void main(String[] args) {
		int ans = nonRepeatingSubstring("abcabcbb");
		System.out.println(ans);
		ans = subString("abba");
		System.out.println(ans);
	}

}
