package com.cgpc.feb26.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LeftHalfPyramid {

	/*
	 * Complete the 'staircase' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void staircase(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (i >= j) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		staircase(n);

		bufferedReader.close();
	}
}