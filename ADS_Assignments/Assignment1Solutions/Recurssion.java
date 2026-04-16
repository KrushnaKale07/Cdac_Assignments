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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter a number to find factorial.");
		int result = factorial(scanner.nextInt());
		System.out.println(result);

	}

}
