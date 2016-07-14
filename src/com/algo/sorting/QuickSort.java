package com.algo.sorting;

import java.util.Scanner;

public class QuickSort {
	
	public void quickSort(int[]arr, int start, int end){
		if(start < end){
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex-1);
			quickSort(arr, pIndex+1, end);
		}
	}
	
	public int partition(int[]arr, int start, int end){
		int pIndex = start;
		int pivot = end;
		for(int i=start; i<end; i++){
			if(arr[i] <= arr[pivot]){
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = arr[pivot];
		arr[pivot] = arr[pIndex];
		arr[pIndex] = temp;
		return pIndex;
	}
	

	public void popuplate(int[] arr){
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void print(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		QuickSort qs = new QuickSort();
		qs.popuplate(arr);
		qs.quickSort(arr, 0, 9);
		qs.print(arr);
	}

}
