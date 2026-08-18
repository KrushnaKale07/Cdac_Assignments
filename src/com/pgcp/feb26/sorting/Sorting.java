package com.pgcp.feb26.sorting;

public class Sorting {

	public static void main(String[] args) {
		int arr [] = { 5, 6, 3, 8, 1 };
		selectionSort(arr);
		System.out.println("Sorted array is: " + java.util.Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
			
		}
	}
}
