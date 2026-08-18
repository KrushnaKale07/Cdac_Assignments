package com.pgcp.feb26;

public class SortindDemo {
	
	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
	}
	
	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
 		int n = arr.length;
		for (int i = 0; i < arr.length -1 ; i++) {
			int minIndex = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
	}

	public static void main(String[] args) {
		int [] arr = {5,2,9,1,6};
		
		System.out.println("Before Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("After Sorting");
		//bubbleSort(arr);
		//insertionSort(arr);
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	
}
