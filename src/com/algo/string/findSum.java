/**
 * Given a string containing alphanumeric characters, calculate sum of all numbers present in the string.
 */
package com.algo.string;
import java.util.*;
/**
 * @author Ajeet
 *
 */
public class findSum {

	/**
	 * 
	 */
	public static int extractSum(String str){
		int sum = 0;
		int len = str.length();
		String temp = "0" ;
		for(int i = 0; i < len; i++){
			if(Character.isDigit(str.charAt(i))){
				temp = temp.concat(str.substring(i,i+1));
			}
			else{
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum + Integer.parseInt(temp);
	}
	
	public static void main(String[] args) {
		System.out.println(extractSum("123abc"));

	}

}
