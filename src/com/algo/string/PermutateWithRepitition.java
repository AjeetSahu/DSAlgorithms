/**
 * Print all permutations with repetition of characters
 */
package com.algo.string;

/**
 * @author Ajeet
 *
 */
public class PermutateWithRepitition {

	/**
	 * @param args
	 */
	public void permString(String str){
		char[] arr = str.toCharArray();
		char[] arrOriginal = str.toCharArray();
		int len = arr.length;
		aux(arr, len, 0, arrOriginal);
	}
	
	public void aux(char[] arr, int len, int start, char[] arrOriginal){
		if(start > len-1){
			for(int i = 0; i < len; i++){
				System.out.print(arr[i]);
			}
			System.out.print(" ");
			return;
		}
		for(int i = 0; i < len; i++){
			arr[start] = arrOriginal[i];
			aux(arr,len,start+1,arrOriginal);
		}
	}
	
	public static void main(String[] args) {
		PermutateWithRepitition pwrObj = new PermutateWithRepitition();
		pwrObj.permString("ABC");
	}

}
