/* 1. Write a Java program to declare variables of all primitive data types and print their
values.

import java.lang.*;

class Assignment1{
	int a;
	char c;
	float f;
	double d;
	
	PremitiveDataTypesAndValues(int a){
		this.a = a;
		System.out.println("constroctor " + a);
	}
	
	
	static void show(PremitiveDataTypesAndValues p){
		
		//System.out.println("in show " + this.a);
		//non-static variable this cannot be referenced from a static context
		System.out.println("in show " + p.a);
	}
	
	public static void main(String [] args){
		PremitiveDataTypesAndValues p =	new PremitiveDataTypesAndValues(10);
		p.a = 20;
		p.show(p);
		
	System.out.println("in main " + p.a);
	System.out.println("in main " + p.c);
	System.out.println("in main " + p.f);
	System.out.println("in main " + p.d);
	}
}*/

//========================================================Q2================================================================================

/*2. Take two numbers (int and double) and perform:
○ Addition
○ Division
○ Type casting result to int

import java.util.Scanner;
class Calculator{

	void add(int a, double b){
		int result = a + ((int)b);
		System.out.println(result);
	}
	
	void division(int a, double b){
		int result = a /((int)b);
		System.out.println(result);
	}
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int a =  10;
		double b =  2.0;
		Calculator calculator = new Calculator();
		calculator.add(a,b);
		calculator.division(a,b);
	}
}*/

//========================================================Q3================================================================================

/*3. Write a program to convert:
○ int → double
○ double → int

class Assignment1{
	int a ;
	double d;

	public static void main(String [] args){
		Assignment1 assignment1 = new Assignment1();
		
		assignment1.a = 10; 
		assignment1.d = 20.00;
		//int to double
		assignment1.d = assignment1.a;
		System.out.println("int to double :- " + assignment1.d);
		
		assignment1.a = ((int)(assignment1.d));
		System.out.println("int to double :- " + assignment1.a);
	}
}*/

//========================================================Q4================================================================================

/*4. Write a program to find ASCII value of a character.

class Assignment1{
	public static void main(String [] args){
		char ch = 'c';
		System.out.println((int)ch);
	}
}*/

//========================================================Q5================================================================================

/*5. Take a character input and print:
next character
privious character
import java.util.Scanner;
class Assignment1{
	public static void main(String [] args){	
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		
		

		System.out.println("The next character of " + ch +" is " + ++ch);
		ch--;
		System.out.println("The previous character of " + ch +" is " + --ch);
		
		scanner.close();
	}
}
*/

//========================================================Q6================================================================================

/*6. Write a program to check whether a number is:
○ Positive
○ Negative
○ Zero
import java.util.Scanner;
class Assignment1{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a > 0){
			System.out.println(a +" is a positive number");
		}else{
			System.out.println(a +" is a negative number");
		}
	}
	
}*/
//========================================================Q7================================================================================

/*7. Write a program to find the largest of three numbers
import java.util.Scanner;
class Assignment1{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number"); 
		int num1 = scanner.nextInt();
		System.out.println("Enter second number");
		int num2 = scanner.nextInt();
		System.out.println("Enter third number");
		int num3 = scanner.nextInt();
		
		if(num1 > num2 && num1 > num3){
			System.out.println(num1 +" is largest number.");
		}else if(num2 > num3){
			System.out.println(num2 +" is largest number.");
		}else{
			System.out.println(num3 +" is largest number.");
		}
		
	}
}*/

//========================================================Q8================================================================================

/*8. Write a program to check whether a year is a leap year
import java.util.Scanner;
class Assignment1{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scanner.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println(year + " is a leap year");
		}else{
			System.out.println(year + " is not a leap year");
		}
	}
}
*/

//========================================================Q9================================================================================

/*9. Create a simple calculator using switch:
○ Input: two numbers + operator
○ Perform: +, -, *, /

import java.util.Scanner;
class Assignment1{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = scanner.nextDouble();
		System.out.println("Enter second number");
		double num2 = scanner.nextDouble();
		System.out.println("Choose a number to perform operation. 1: Addition, 2: substraction, 3: Multiplication, 4: Division");	
		int operation = scanner.nextInt();
		
		switch(operation) {
			case 1:
				double add = num1 + num2;
				System.out.println("The addition of " + num1 +","+ num2 +" is : " + add);
				break;
			case 2:
				double substraction =  num1 - num2;
				System.out.println("The substraction of " + num1 +","+ num2 +" is : " +substraction);
				break;
			case 3:
				double multiplication =  num1 * num2;
				System.out.println("The multiplication of " + num1 +","+ num2 +" is : " +multiplication);
				break;
			case 4:
				double division = num1 / num2;
				System.out.println("The division of " + num1 +","+ num2 +" is : " +division);
				break;
			default:
				System.out.println("Please choose valid number to perform operation");
		}
	}
}*/

//========================================================Q10================================================================================

/*10. Write a program to check whether a character is:
● Vowel or consonant

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a chyaracter");
		char ch = scanner.next().charAt(0);
		if((ch < 91 && ch > 64) || (ch < 123 && ch > 96) ){
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				System.out.println("Character is a Vowel" );
			}else{
				System.out.println("Character is a consonant" );
			}
		}else{
			System.out.println("Character is not a Vowel nor consonant" );
		}
	}
}
*/

//========================================================Q11================================================================================

/*11. Print numbers from 1 to 50 using:
● for loop
● while loop
class Assignment1{
	public static void main(String[] args){
		int num = 1;
		System.out.println("Using while loop");
		while(num < 51){
			if(num<49){
				System.out.print(num+",");
				num++;
			}else{
				num++;
				System.out.print(num+".");
				break;
			}
			
		}
		System.out.println();
		num = 1;
		System.out.println("Using for loop");
		for(int i = num; i < 51; i++){
			if(i<49){
				System.out.print(i+",");
			}else{
				i++;
				System.out.print(i+".");
				break;
			}
		}
		
	}
}*/

//========================================================Q12================================================================================
/*12. Write a program to print sum of first N natural numbers.


import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i <=num ; i++){
			sum+=i;
		}
		System.out.println("Sum : " + sum );
	}
}
*/
//========================================================Q13================================================================================
/*13. Write a program to print multiplication table of a number


import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();
		
		for(int i = 1; i <=10 ; i++){
			System.out.println(num * i);
		}
	}
}
*/

//========================================================Q14================================================================================

/*14. Write a program to reverse a number

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();
		int digit = 0;
		int reverse = 0;
		while(num != 0){
			digit = num%10; 
			num = num/10; 
			reverse = reverse*10 + digit; 
		}
		System.out.println(reverse);
	}
} */

//========================================================Q15================================================================================

/*15. Write a program to count digits in a number

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();
		int count = 0;
		while(num != 0){ 
			num = num/10; 
			count++;
		}
		System.out.println(count);
	}
}
*/
//========================================================Q16================================================================================
/*16. Write a program to check whether a number is palindrome.

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();
		int copy = num;
		int reverse = 0;
		int digit = 0;
		
		while(num != 0){
			digit = num%10; 
			num = num/10; 
			reverse = reverse*10 + digit; 
		}
		
		if(reverse == copy){
			System.out.println(copy +" is a palindrome number"); 
		}else{
			System.out.println(copy +" is not a palindrome number");
		}
		
	}
}*/

//========================================================Q17================================================================================
/*17. Write a program to find factorial of a number.

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();
		int fact = 1;
		
		for(int i =1; i <=num; i++){
				fact *= i;
		}
		System.out.println(fact);
	}
}*/

//========================================================Q18================================================================================
/*
18. Write a program to print Fibonacci series up to N terms.
import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = scanner.nextInt();
		int num2 = 1;
		int num3 = 0;
		
		for(int i = 1; i <= num1; i++){
			int temp = num2;
			num2 = num2 + num3;
			num3 = temp;
			if(num2>= 0){
				System.out.print(num2+",");
			}else{
				break;
			}
		}
	}	
}	*/

//========================================================Q19================================================================================
/*19. Print:
*
**
***
**** 

class Assignment1{
	public static void main(String [] args){
			for(int i = 1; i <= 4; i++){
				for(int j = 1; j <= i; j++){
					System.out.print("*");
				}
				System.out.println();
			}
	}
}*/

//========================================================Q20================================================================================

/*20. Print:
1
12
123
1234

class Assignment1{
	public static void main(String [] args){
		int num = 1;
			for(int i = 1; i <= 4; i++){
				for(int j = 1; j <= i; j++){
					System.out.print(num);
					num++;
				}
				num = 1;
				System.out.println();
			}
	}
}
*/

//========================================================Q21================================================================================
/*21. Print:
****
***
**
* 

class Assignment1{
	public static void main(String [] args){
			for(int i = 1; i <= 4; i++){
				for(int j = 4; j >= i; j--){
					System.out.print("*");
				}
				System.out.println();
			}
	}
}

*/

//========================================================Q22================================================================================
/*22. Write a program to check whether a number is prime.

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = scanner.nextInt();
		int count = 0;
		
		for(int i = 2; i <= num1; i++){
			if(num1 % i == 0){
				count++;
			}
		}
		
		if(count == 1){
			System.out.println(num1 + " is a prime number.");
		}else{
			System.out.println(num1 + " is not a prime number.");
		}
	}
}
*/
//========================================================Q23================================================================================
/*
23. Write a program to find sum of even and odd numbers separately (1 to N).

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = scanner.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 1; i <= num1; i++){
			if(i % 2 == 0){
				evenSum+=i;
			}else{
				oddSum+=i;
			}
		}
		System.out.println("The  sum of even numbers is : " + evenSum);
		System.out.println("The sum of odd numbers is : " + oddSum);
	}
}*/

//========================================================Q24================================================================================
/*24. Write a program to find largest digit in a number.

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = scanner.nextInt();
		int digit = 0;
		int largest = 0;
		while(num1 != 0){
			digit = num1%10;
			if(digit > largest){
				largest = digit;
			}
			num1 = num1 / 10;
		}
		System.out.println("The largest digit in a number is : "+ largest);
	}
}*/

//========================================================Q25================================================================================

/*25. Write a program to swap two numbers:
● With third variable
● Without third variable

//● With third variable
import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number");
		int num2 = scanner.nextInt();
		System.out.println("Before swapping");
		System.out.println("The num1 number is " + num1);
		System.out.println("The num2 number is " + num2);
		
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping");
		System.out.println("The num1 number is " + num1);
		System.out.println("The num2 number is " + num2);
	}
}

//● Without third variable

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number");
		int num2 = scanner.nextInt();
		System.out.println("Before swapping");
		System.out.println("The num1 number is " + num1);
		System.out.println("The num2 number is " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After swapping");
		System.out.println("The num1 number is " + num1);
		System.out.println("The num2 number is " + num2);
		
	}
}*/

//========================================================Q26================================================================================

/*26. Write a program to check whether a number is Armstrong.

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scanner.nextInt();
		int digit = 0;
		int copy = num1;
		int num2 = 0;
		while(num1 != 0){
			digit = num1 % 10;
			num2 = num2 + (digit * digit * digit);
			num1 = num1 / 10;
		}
		
		if(num2  == copy){
			System.out.println(copy + " is a Armstrong number");
		}else{
			System.out.println(copy + " is not a Armstrong number");
		
	}
}}*/

//========================================================Q27================================================================================
/*
27. Take marks of 5 subjects and:
● Calculate total
● Calculate percentage
● Print grade (A/B/C/Fail)

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks of five subjects");
		float sub1 = scanner.nextFloat();
		float sub2 = scanner.nextFloat();
		float sub3 = scanner.nextFloat();
		float sub4 = scanner.nextFloat();
		float sub5 = scanner.nextFloat();
		
		float sumOfMarks = sub1 + sub2 + sub3 + sub4 + sub5;
		float average = sumOfMarks / 5;
	
		if(average > 90){
			System.out.println("You got " + sumOfMarks + " out of 500 " + "and your persent is "+ average + "% so the Grade is A ");
		}else if(average <= 90 && average >75 ){
			System.out.println("You got " + sumOfMarks + " out of 500 " + "and your persent is "+ average + "% so the Grade is B ");
		}else if(average <=75 && average > 50 ){
			System.out.println("You got " + sumOfMarks + " out of 500 " + "and your persent is "+ average + "% so the Grade is C ");
		}else if(average <=50 && average > 35 ){
			System.out.println("You got " + sumOfMarks + " out of 500 " + "and your persent is "+ average + "% so the Grade is D ");
		}else{
			System.out.println("You got " + sumOfMarks + " out of 500 " + "and your persent is "+ average + "% so the Grade is Fail ");
		}
	}
}*/

//========================================================Q28================================================================================

/*28. Take user age and:
● Check eligibility for voting

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		
		if(age >= 18){
			System.out.println("You are eligible to vote");
		}else{
			System.out.println("You are not eligible to vote");
		}
	}
}*/
//========================================================Q29================================================================================

/*29. Create a menu-driven program:
1. Add
2. Subtract
3. Exit

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 1.Add 2.Subtract");
		int operation = scanner.nextInt();
		System.out.println("Enter your num1");
		float num1 = scanner.nextInt();
		float num2 = scanner.nextInt();
		
		switch(operation){
			case 1:
				System.out.println(num1 + num2);
				break;
			case 2:
				System.out.println(num1 - num2);
				break;
			default:
				System.out.println("Enter valid operation numberr");
		}		
	}
}*/

//========================================================Q30================================================================================

/*30. Take a number and print its table until user stops (use loop)

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println("Table of " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended.");
    }
}*/

//========================================================Q31================================================================================
/*31. Fix the error:
int x;
System.out.println(x);

class Assignment1{
	public static void main(String[] args) {
	
		int x;
		x = 10;
		System.out.println(x);
	}
}*/

//========================================================Q32================================================================================

/*32. Fix:
if(x = 10){
System.out.println("Hello");
}

class Assignment1{
	public static void main(String[] args) {
		int x;
		x = 10;
		if(x == 10){
			System.out.println("Hello");
		}
	}
}
*/
//========================================================Q33================================================================================
/*33. Fix infinite loop:
while(i < 10){
System.out.println(i);
}

class Assignment1{
	public static void main(String[] args) {
		while(i < 10){
		System.out.println(i);
		i++;
	}
}
*/
//========================================================Q34================================================================================

/*34. Print all prime numbers between 1 to 100

class Assignment1{
	public static void main(String[] args){
		int count = 0;
		for(int i = 1; i <= 100; i++){
			for(int j = 1; j <= i; j++){
				if(i % j == 0){
					count++;
				}
			}
			if(count == 2){
					System.out.println(i + " is a prime number.");
			}
			count = 0;
		}
	}
}*/

//========================================================Q35================================================================================

/*35. Find GCD of two numbers.

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		int greatest = 0;
		for(int i = 1; i <= num1 && i <= num2; i++){
			if(num1 % i == 0 && num2 % i == 0){
				greatest = i;
			}
		}
		System.out.println("The GCD of " + num1+", " + num2 + " is : " + greatest);
		
	}
}*/

//========================================================Q36================================================================================
/*36. Find LCM of two numbers.
import java.util.Scanner;
class Assignment1{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		int lcm = 0;
		int greatest = 0;
		for(int i = 1; i <= num1 && i <= num2; i++){
			if(num1 % i == 0 && num2 % i == 0){
				greatest = i;
			}
		}
		System.out.println("The GCD of " + num1+", " + num2 + " is : " + greatest);
		lcm = (num1 * num2 / greatest);
		
		System.out.println("The LCM of " + num1+", " + num2 + " is : " + lcm);
		
	}
}*/
//========================================================Q37================================================================================
/*37. Check whether a number is perfect number

import java.util.Scanner;
class Assignment1{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		int copy = num1;
		int sum = 0;
		
		for(int i = 1; i < num1; i++){
			if(num1 % i == 0){
				sum += i;
			}
		}
		
		if(sum == copy){
			System.out.println("The " + num1+" is a perfect number.");
		}else{
			System.out.println("The " + num1+" is not a perfect number.");
		}
	}
}*/
//========================================================Q38================================================================================
/*38. Create a number guessing game.*/

import java.util.Scanner;
import java.util.Random;
class Assignment1{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int number = rand.nextInt(100) +1;
		int guess;
		int attempts = 0;
		
		System.out.println("Guess the number between 1 and 100!");
		
		do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println(" Correct! You guessed it in " + attempts + " attempts.");
            }

        } while (guess != number);
	}
}