package com.pgcp.feb26.sorting;

public class Sorting {

	public static void main(String[] args) {
		int arr [] = { 5, 6, 3, 8, 1 };
//		selectionSort(arr);
//		System.out.println("Selection Sorted array is: " + java.util.Arrays.toString(arr));
//		bubbleSort(arr);
//		impBbbleSort(arr);
		insertionSort(arr);
		System.out.println("Bubble Sorted array is: " + java.util.Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;	
			
		}
	}

	private static void impBbbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
			
		}
		
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
