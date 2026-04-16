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
	private static int recursiveBinarySearch(int[] arr, int left, int right, int key) {
		int mid = (left + right) / 2;

		int index;

		if (right < left) {
			return -1;
		}

		if (key == arr[mid]) {
			return mid;
		}

		if (key < arr[mid]) {
			index = recursiveBinarySearch(arr, left, mid - 1, key);
		} else {
			index = recursiveBinarySearch(arr, mid + 1, right, key);
		}

		return index;
	}
	
	private static int linearSearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		System.out.println("Enter a number to find");
		int key = scan.nextInt();
		
		//int result = binarySearch(arr, key);
		//int result = linearSearch(arr, key);
		int result = recursiveBinarySearch(arr, 0, arr.length - 1, key);
		if (result != -1) {
			System.out.println("Number is found at : " + result);
		} else {
			System.out.println("Please enter valid number :");
		}

	}

}
