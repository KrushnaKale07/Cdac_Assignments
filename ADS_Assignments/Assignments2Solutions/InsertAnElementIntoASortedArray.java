/*Q2. Insert an Element into a Sorted Array 
Problem Description:
Given a sorted array, insert a new element into its correct position using the logic of Insertion 
Sort. 
Example:
Input: [1, 3, 5, 7], insert 4
Output: [1, 3, 4, 5, 7]
Requirements:
 Do not use extra sorting. 
 Shift elements as needed*/

package com.pgcp.ads.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAnElementIntoASortedArray {

	public static int[] insertAnElement(int[] arr, int n, int key) {
		int i = n - 1;

		while (i >= 0 && arr[i] > key) {
			arr[i + 1] = arr[i];
			i--;
		}

		arr[i + 1] = key;

		return arr;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5]; 
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;

		int n = 4; // current size
		int key = scan.nextInt();

		insertAnElement(arr, n, key);

		System.out.println(Arrays.toString(arr));
	}

}
