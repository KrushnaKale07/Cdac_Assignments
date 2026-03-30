/*1. Electricity Bill Calculator
Create a Java program to calculate a household electricity bill.
Requirements
● Accept customer name, consumer number, and units consumed.
● Calculate bill using slab rates such as:
○ First 100 units → Rs. 5 per unit
○ Next 100 units → Rs. 7 per unit
○ Above 200 units → Rs. 10 per unit
● If the bill exceeds Rs. 1500, apply a 5% surcharge.
● Display complete bill details*/

import java.util.Scanner;
class ElectricityBillCalculator{
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Consumer Number: ");
		
		int consumerNumber = sc.nextInt();
		System.out.println("Enter Consumer Name: ");
		
		sc.nextLine();
		String consumerName = sc.nextLine();
		System.out.println("Enter units: ");
		
		int units = sc.nextInt();
		double bill = 0.0;
		
		if(units <= 100){
			bill = units * 5;
		}else if(units > 100 && units <= 200){
			bill = units * 7;
		}else if(units > 200){
			bill = units * 10;
		}else if(units > 1500){
			bill = (units * 7) * 0.05;
		}
		
		System.out.println("Consumer Name : " + consumerName);
		System.out.println("Consumer Number : " + consumerNumber);
		System.out.println("Units consumed : " + units);
		System.out.println("Bill : " + bill);
	}
}