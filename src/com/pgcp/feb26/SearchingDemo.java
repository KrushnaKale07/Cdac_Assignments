	package com.pgcp.feb26;

public class SearchingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30,50,70,90,30};
		int key = 30;
//		System.out.println(key + " is persent and is found at index : "+ linearSearch(arr1, key));
		linearSearch(arr1, key);

	}

	private static int linearSearch(int[] arr1, int key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] == key) {
				System.out.println(key + " is persent and is found at index : "+ i);

				//return i;
			}
		}
		return 0;
	}

}
