package com.algo.sorting;
import java.util.*;
public class InsertionSort {
	
	
	public void insertionSort(int[] a){
		int i,j,temp;
		for(i=1; i<a.length; i++){
			for(j=i; j>0; j--){
				if(a[j] < a[j-1] ){
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		InsertionSort is = new InsertionSort();
		is.insertionSort(a);
		
		for(int i=0; i<10; i++){
			System.out.print(a[i] + " ");
		}
	}

}
