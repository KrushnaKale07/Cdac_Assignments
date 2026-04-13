/*3. Recursive String Reversal 
Problem Description:
Given a string, write a recursive function to reverse it. 
You are not allowed to use loops or builtin reverse functions. 

Hint:
Think about reducing the problem size by removing one character at a time and solving the 
smaller problem. 
Example:
Input: "recursion"
Output: "noisrucer"
Requirements:
1. Base case: when the string becomes empty or has one character. 
2. Recursive step: process the remaining substring*/
package com.pgcp.ads.assignment1;

public class RecursiveStringReversal {

	private static String reverseString(String str) {

		 if (str == null || str.length() <= 1) {
	            return str;
	        }
		 
		 return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String str = "recursion";
		System.out.println("Reverse string of " + str + " is " + reverseString(str));
	}
}
