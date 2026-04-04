/*8. Expression Evaluator
Create a program:
Requirements:
● Take 3 numbers
● Perform:
	○ (a + b) * c
	○ a > b && b > c
	○ a % b
● Show results with explanation*/

import java.util.Scanner;
class ExpressionEvaluator{
	public static void main(String[] main){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("enter third number");
		int c = sc.nextInt();
		
		int exp1 = (a + b) * c;
		boolean exp2 = a > b && b > c;
		int exp3 = a % b;
		
		 System.out.println("\n--- Results ---");

        System.out.println("(a + b) * c = " + exp1 +
                "  -> First (a+b), then multiply by c");

        System.out.println("a > b && b > c = " + exp2+
                "  -> Checks if a is greater than b AND b is greater than c");

        System.out.println("a % b = " + exp3 +
                "  -> Remainder when a is divided by b");

        sc.close();
	}
}