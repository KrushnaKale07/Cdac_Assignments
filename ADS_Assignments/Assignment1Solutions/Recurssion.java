package com.cgpc.feb26.recurssion;

import java.util.Scanner;

public class Recurssion {

	private static int factorial(int n) {
		int r;
		if (n == 0)
			return 1;

		r = n * factorial(n - 1);
		return r;
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.err.println("Enter a number to find factorial.");
		// int result = factorial(scanner.nextInt());
		// System.out.println(result);

		System.out.println("Enter a number to find using recursive binary search.");
		int key = scanner.nextInt();
		int arr[] = { 44, 55, 22, 11, 88, 99, 77, 33 };
		Arrays.sort(arr);

		int index = recursiveBinarySearch(arr, 0, arr.length - 1, key);
		if (index != -1) {
			System.out.println("Key found at : " + index);
		} else {
			System.out.println("Key not found.");
		}
	}

}
