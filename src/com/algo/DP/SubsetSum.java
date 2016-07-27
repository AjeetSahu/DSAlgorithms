/**
 * Given an array of non negative numbers and a total,
 * find if there is subset of numbers in this array which adds up to given total.
 */
package com.algo.DP;

/**
 * @author Ajeet
 *
 */
public class SubsetSum {

	/**
	 * @param args
	 */
	/*public boolean findSubSet(int[] arr, int sum){
		boolean[][] matrix = new boolean[arr.length+1][sum+1];
		for(int i = 0; i < arr.length+1; i++){
			for(int j = 0; j < sum +1; j++){
				if(j == 0){
					matrix[i][j] = true;
					continue;
				}
				
				
			}
		}
		return false;
	}*/
	
	public boolean subsetSum(int input[], int total) {

        boolean T[][] = new boolean[input.length + 1][total + 1];
        for (int i = 0; i <= input.length; i++) {
            T[i][0] = true;
        }

        for (int i = 1; i <= input.length; i++) {
            for (int j = 1; j <= total; j++) {
                if (j - input[i - 1] >= 0) {
                    T[i][j] = T[i - 1][j] || T[i - 1][j - input[i - 1]];
                } else {
                    T[i][j] = T[i-1][j];
                }
            }
        }
        return T[input.length][total];

}
	
	public static void main(String[] args) {
		int[] arr = {2,3,7,8};
		SubsetSum  obj = new SubsetSum();
		System.out.println(obj.subsetSum(arr, 9));

	}

}
