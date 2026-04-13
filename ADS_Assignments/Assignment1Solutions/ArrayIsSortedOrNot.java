/*4. Check if an Array is Sorted 
Problem Description:
Given an integer array, determine whether it is sorted in ascending order using recursion. 
Instead of checking the whole array at once, compare elements step by step recursively. 
Approach Hint:
 1 Compare the current element with the next one. 
 2 Then recursively check the rest of the array. 
Example:
Input: [2, 4, 6, 8] → Output: true
Input: [3, 5, 2, 9] → Output: false
Requirements:
 1 Do not use loops. 
 2 Use an index parameter to track position.*/

package com.pgcp.ads.assignment1;

public class ArrayIsSortedOrNot {

	public static void main(String[] args) {
		int arr1[] = { 2, 4, 6, 8 };
		int arr2[] = { 3, 5, 2, 9 };

		System.out.println(isSorted(arr1, 0));
		System.out.println(isSorted(arr2, 0));

	}

	private static boolean isSorted(int[] arr, int index) {
		if (index == arr.length-1) {
			return true;
		}

		if (arr[index] > arr[index + 1]) {
			return false;
		}

		return isSorted(arr, index + 1);

	}

}
