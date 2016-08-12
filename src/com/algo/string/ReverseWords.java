/**
 * Reverse words in a given string
 */
package com.algo.string;

/**
 * @author Ajeet
 *
 */
public class ReverseWords {

	/**
	 * @param args
	 */
	public String reverseString(String str){
		String result = "";
		String[] arr = str.split("\\s");
		int beg = 0, end = arr.length-1;
		while(beg < end){
			String temp = arr[beg];
			arr[beg] = arr[end];
			arr[end] = temp;
			beg++;
			end--;
		}
		for(int i = 0; i < arr.length; i++){
			result = result + arr[i] + " ";
		}
		return result.substring(0, result.length()-1);
	}
	
	public static void main(String[] args) {
		ReverseWords Obj = new ReverseWords();
		String ans = Obj.reverseString("i like this program very much");
		System.out.println(ans);
	}

}
