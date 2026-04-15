package com.cgpc.feb26.searching;

import java.util.Scanner;

public class SearchingDemo {

	private static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;

		while (right >= left) {
			mid = (left + right) / 2;

			if (key == arr[mid]) {
				return mid;
			}
			if (key > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		System.out.println("Enter a number to find");
		int key = scan.nextInt();
		int result = binarySearch(arr, key);

		if (result != -1) {
			System.out.println("Number is found at : " + result);
		} else {
			System.out.println("Please enter valid number :");
		}

	}

}
