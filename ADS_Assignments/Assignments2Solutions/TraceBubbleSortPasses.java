/*Q1. Trace Bubble Sort Passes 
Problem Description:
Given an array, print the array after each pass of Bubble Sort. 
Example:
Input: [4, 3, 2]
Output: 
Pass 1: [3, 2, 4]
Pass 2: [2, 3, 4]*/

import java.util.Arrays;

public class TraceBubbleSortPasses {

	private static void taceBubbleSrtPasses(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2 };

		taceBubbleSrtPasses(arr);
	}

}
