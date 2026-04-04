/*10. Restaurant Order Management System
Create a program for restaurant management.
Requirements
● Display a food menu with price list.
● Let the user order multiple items.
● Use loop and switch-case for repeated ordering.
● Calculate total amount
● Add GST of 50%
● Print final bill */

import java.util.Scanner;
class RestaurantOrderManagementSystem{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

        int choice;
        double total = 0;
        char more;
			
		do{
			System.out.println("\n--- MENU ---");
            System.out.println("1. Pizza  - Rs. 200");
            System.out.println("2. Burger - Rs. 100");
            System.out.println("3. Pasta  - Rs. 150");
            System.out.println("4. Coffee - Rs. 50");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
			
			switch(choice){
				case 1:
						total+= 200;
						System.out.println("Pizza added.");
						break;
				case 2: 
						total+= 100;
						System.out.println("Burger added.");
						break;
				case 3: 
						total+= 150;
						System.out.println("Pasta added.");
						break;
				case 4: 
						total+= 50;
						System.out.println("Coffee added.");
						break;
				 default:
                    System.out.println("Invalid choice!");		
			}
			System.out.print("Do you want to order more? (y/n): ");
            more = sc.next().charAt(0);
		}while(more == 'Y'|| more == 'y' );
		
		double gst = total * 0.50;
        double finalBill = total + gst;
		
		System.out.println("\n===== FINAL BILL =====");
        System.out.println("Total Amount : Rs. " + total);
        System.out.println("GST (50%)    : Rs. " + gst);
        System.out.println("Final Bill   : Rs. " + finalBill);
        System.out.println("======================");

        sc.close();
	}
}