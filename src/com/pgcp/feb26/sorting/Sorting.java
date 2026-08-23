package com.pgcp.feb26.sorting;

public class Sorting {

	public static void main(String[] args) {
		int arr [] = { 5, 6, 3, 8, 1 };
//		selectionSort(arr);
//		System.out.println("Selection Sorted array is: " + java.util.Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Bubble Sorted array is: " + java.util.Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		for(int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					
				}
			}
			
		}
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
