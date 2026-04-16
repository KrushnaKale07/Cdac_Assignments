/*Q4.Optimized Bubble Sort 
Problem Description:
Modify the Bubble Sort algorithm to improve its efficiency by stopping early if the array is 
already sorted. 
Requirements:
 If no swaps happen in a pass, terminate early*/

package com.pgcp.ads.assignment2;

import java.util.Arrays;

public class OptimizedBubbleSort {

	private static void bubbleSort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped) {
				System.out.println("Array is already sorted. Stopping early.");
				break;
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int[] arr = { 7, 2, 5, 4 };
		bubbleSort(arr);
	}
}