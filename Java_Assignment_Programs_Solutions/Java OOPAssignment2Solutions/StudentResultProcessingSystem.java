/*2. Student Result Processing System
Create a program for a school to manage a student’s marks.
Requirements
● Accept student name, roll number, and marks in 5 subjects.
● Calculate total, average, percentage.
● Display grade using conditions:
○ 90 and above → A
○ 75 to 89 → B
○ 60 to 74 → C
○ 40 to 59 → D
○ Below 40 → Fail*/

import java.util.Scanner;
class StudentResultProcessingSystem{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks of five subjects");
		float sub1 = scanner.nextFloat();
		float sub2 = scanner.nextFloat();
		float sub3 = scanner.nextFloat();
		float sub4 = scanner.nextFloat();
		float sub5 = scanner.nextFloat();
		
		float total = sub1 + sub2 + sub3 + sub4 + sub5;
		float average = total / 5;
		float percentage = (total/500)*100;
	
		if(percentage >=90){
			System.out.println("You got " + total + " out of 500 " + "and your persent is "+ percentage + "% so the Grade is A ");
		}else if(percentage < 90 && average >=75 ){
			System.out.println("You got " + total + " out of 500 " + "and your persent is "+ percentage + "% so the Grade is B ");
		}else if(percentage <75 && average >= 60 ){
			System.out.println("You got " + total + " out of 500 " + "and your persent is "+ percentage + "% so the Grade is C ");
		}else if(percentage <60 && average >=40 ){
			System.out.println("You got " + total + " out of 500 " + "and your persent is "+ percentage + "% so the Grade is D ");
		}else{
			System.out.println("You got " + total + " out of 500 " + "and your persent is "+ percentage + "% so the Grade is Fail ");
		}
		String status = (percentage >= 40) ? "Promoted" : "Not Promoted";
		System.out.println("Status: " + status);
	}
}
