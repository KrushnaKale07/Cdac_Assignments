/*14. Salary Conversion System
Create a program:
Requirements:
● Take the salary as double
● Convert it into:
	○ int (explicit casting)
	○ float (implicit casting)
● Show the precision loss clearly*/

import java.util.Scanner;
class SalaryConversionSystem{
	
	double salary;
	
	public static void main(String [] args){
		
		SalaryConversionSystem scs = new SalaryConversionSystem();
		Scanner sc = new Scanner(System.in);
		scs.salary = sc.nextDouble();
		
		int salary1 = (int) scs.salary;
		//float salary2 = scs.salary; // We can not convert double to float(implicit casting).
										//It is explicit casting (narrowing conversion) because double is larger than float.
		
		System.out.println("After doing int (explicit casting) : " + salary1 );
		System.out.println("After doing float (implicit casting) : " + salary2);
		
	}
}

