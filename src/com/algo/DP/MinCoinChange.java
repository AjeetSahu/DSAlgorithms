/**
 * 
 */
package com.algo.DP;

/**
 * @author Ajeet
 *
 */
public class MinCoinChange {

	/**
	 * @param args
	 */
	public static void minCoin(int[] coins, int sum){
		int[][] matrix = new int[coins.length +1 ][sum+1];
		for(int i = 0; i <= sum; i++){
			matrix[0][i] = Integer.MAX_VALUE;
		}
		for(int i = 0; i <= coins.length; i++){
			matrix[i][0] = 0;
		}
		
		for(int i = 1; i <= coins.length; i++){
			for(int j = 1; j <= sum; j++){
				if(coins[i-1] < j ){
					matrix[i][j] = matrix[i-1][j];
				}
				else{
					matrix[i][j] = Math.min(matrix[i-1][j], matrix[i][j-coins[i]] +1);
				}
			}
		}
		
		System.out.println(matrix[coins.length+1][sum+1]);
	}
	
	public static void main(String[] args) {
		int[] coins = {1, 5, 6,8};
		int sum = 11;
		minCoin(coins, sum);
	}

}
