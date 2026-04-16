/*Q3.Selection Sort in Descending Order 
Problem Description:
Modify the Selection Sort algorithm to sort an array in descending order. 
. 
Example:
Input: [3, 5, 1, 2]
Output: [5, 3, 2, 1]*/
package com.pgcp.ads.assignment2;

import java.util.Arrays;

public class SelectionSortInDescendingOrder {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 1, 2 };
		System.out.println("Input : : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Output : " + Arrays.toString(arr));
	}

}
