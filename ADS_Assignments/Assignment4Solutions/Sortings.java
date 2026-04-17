package com.pgcp.ads.assignment4;

import java.util.Scanner;

public class Sortings {

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("After sorting using bubble sort.");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length -1; i++) {
			int j, temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j+1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of array.");
		int length = scan.nextInt();
		int arr[] = new int[length];
		System.out.print("Please enter the element of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		//bubbleSort(arr);
		insertionSort(arr);
	}
}
