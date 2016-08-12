/**
 * 
 */
package com.algo.string;

/**
 * @author Ajeet
 *
 */
public class ExtractPalindrome {

	/**
	 * @param args
	 */
	
	public String findPalindrome(String str){
		char[] arr = str.toCharArray();
		int len = arr.length;
		int beg = 0; 
		int end = len-1;
		int count = 0;
		while(beg <= end){
			char c = arr[beg];
			int position = findOccurance(arr, beg, end);
			if(position == -1){
				for(int i = beg; i < len-1; i++){
					arr[i] = arr[i+1];
				}
				end--;						  
				count++;
			}
			else{                             //Swap with end char
				char temp = arr[end];
				arr[end] = arr[position];
				arr[position] = temp;
				beg++;
				end--;
			}
		}
		String ans = "";		//String.valueOf(arr);
		for(int i = 0; i < arr.length - count; i++){
			ans = ans + arr[i];
		}
		return ans;
	}
	
	public int findOccurance(char[] arr, int beg, int end){
		for(int i = beg+1; i <= end; i++){
			if(arr[i] == arr[beg])
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		ExtractPalindrome fpObj = new ExtractPalindrome();
		String ans = fpObj.findPalindrome("abc");
		System.out.println(ans);
	}

}
