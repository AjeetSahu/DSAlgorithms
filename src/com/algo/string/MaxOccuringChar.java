/**
 * 
 */
package com.algo.string;

/**
 * @author Ajeet
 *
 */
public class MaxOccuringChar {

	/**
	 * @param args
	 */
	public char findMax(String str){
		int[] arr = new int[256];
		int max = 0, index = 0;
		for(int i = 0; i < str.length(); i++){
			arr[(int)str.charAt(i)] = arr[(int) str.charAt(i)] + 1;
		}
		for(int i = 0; i < 256; i++){
			if(arr[i] > max){
				max = arr[i];
				index = i;
			}
		}
		return (char)index;
	}
	
	public static void main(String[] args) {
		MaxOccuringChar mocObj = new MaxOccuringChar();
		char c = mocObj.findMax("ccccccccccdddddddddddddddddddddddddddddddd");
		System.out.println(c);
	}

}
