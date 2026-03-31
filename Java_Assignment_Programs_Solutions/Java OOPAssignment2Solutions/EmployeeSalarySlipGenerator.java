/*5. Employee Salary Slip Generator
Create a Java program to generate salary slips for employees.
Requirements
● Accept employee name, ID, basic salary
● Calculate:
○ HRA = 20% of basic salary
○ DA = 10% of basic salary
○ PF = 8% of basic salary
● Calculate net salary.
● Display a formatted salary slip.*/

import java.util.Scanner;
class EmployeeSalarySlipGenerator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee name : ");
		String empName = sc.nextLine();
		System.out.print("Enter employee id : ");
		String empId = sc.nextLine();
		System.out.print("Enter employee basic salary : ");
		double basicSalary = sc.nextDouble();
		
		double hra = (basicSalary * 0.2);
		double da = basicSalary * 0.1;
		double pf = basicSalary * 0.08;

		double netSalary = basicSalary + hra + da + pf;
		
		System.out.println("\n====== SALARY SLIP ======");
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee ID   : " + empId);
        System.out.println("--------------------------");
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("PF (8%)       : " + pf);
        System.out.println("--------------------------");
        System.out.println("Net Salary    : " + netSalary);
        System.out.println("==========================");
    }		
}