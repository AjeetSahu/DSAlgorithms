/**
 * Given a bag which can only take certain weight W.
 * Given list of items with their weights and price. 
 * How do you fill this bag to maximize value of items in the bag.
 */
package com.algo.DP;

/**
 * @author Ajeet
 *
 */
public class Knapsack01 {

	/**
	 * @param args
	 */
	
	public int knapSackSol(int val[], int wt[], int W ){
		int[][] matrix = new int[val.length+1][W+1];
		for(int i = 0; i <= val.length; i++){
			for(int j = 0; j <= W; j++){
				if(i == 0 || j == 0){
					matrix[i][j] = 0;
					continue;
				}
				if(wt[i-1] > j){
					matrix[i][j] = matrix[i-1][j];
				}
				else{
					matrix[i][j] = Math.max(matrix[i-1][j], val[i-1] + matrix[i-1][j-wt[i-1]]);
				}
			}
		}
		return matrix[val.length][W];
	}
	
	public static void main(String[] args) {
		
		int[] wt = {1,3,4,7};
		int[] val = {1,4,5,7};
		int W = 7;
		Knapsack01 obj = new Knapsack01();
		int ans = obj.knapSackSol(val, wt, W);
		System.out.println(ans);
	}
	
}
