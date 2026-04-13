package com.cgpc.feb26.sortings;

public class Sorting {

	private static void bubbleSort(int arr[]) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapFlag = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapFlag = true;
					
				}
			}
			if(swapFlag == false) {
				break;
			}
		}
 
	}

	public static void main(String[] args) {

		int arr[] = { 4, 8, 2, 1, 5, 6 };
		System.out.println("Before Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		bubbleSort(arr);
		System.out.println();
		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}
