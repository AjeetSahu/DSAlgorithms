/**
 * 
 */
package com.algo.string;

/**
 * @author Ajeet
 *
 */
public class PermutateString {

	/**
	 * @param args
	 */
	public void permString(String str){
		char[] arr = str.toCharArray();
		int len = arr.length;
		aux(arr, len, 0);
	}
	public void aux(char[] arr, int len, int start){
		if(start == len-1){
			for(int i = 0; i < len; i++){
				System.out.print(arr[i]);
			}
			System.out.print(" ");
			return;
		}
		for(int i = start; i < len; i++){
			char temp = arr[start];
			arr[start] = arr[i];
			arr[i] = temp;
			aux(arr,len,start+1);
			temp = arr[start];
			arr[start] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		PermutateString psObj = new PermutateString();
		psObj.permString("AB");
		
	}

}
