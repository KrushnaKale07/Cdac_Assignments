/*4. Grocery Store Bill Generator
Create a billing system for a small grocery shop.
Requirements
● Accept item names, quantity, and price for multiple items.
● Store item totals in arrays.
● Calculate total bill amount.
● Apply discount:
○ 10% discount if bill is above Rs. 3000
● Print the final bill in proper format.*/

import java.util.Scanner;
class GroceryStoreBillGenerator{
	 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter number of items: ");
    int n = sc.nextInt();
    sc.nextLine();
	
	String[] items = new String[n];
    int[] qty = new int[n];
    double[] price = new double[n];
    double[] total = new double[n];
	
	 double grandTotal = 0;
	 
	 for(int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1));
            
            System.out.println("Enter item name: ");
            items[i] = sc.nextLine();

            System.out.println("Enter quantity: ");
            qty[i] = sc.nextInt();

            System.out.println("Enter price: ");
            price[i] = sc.nextDouble();
            sc.nextLine(); // consume newline

            total[i] = qty[i] * price[i];
            grandTotal += total[i];
        }
		
		double discount = 0;
        if (grandTotal > 3000) {
            discount = grandTotal * 0.10;
        }

        double finalAmount = grandTotal - discount;

        // Bill Output
        System.out.println("\n===== GROCERY BILL =====");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Qty", "Price", "Total");
		
		 for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n",
                    items[i], qty[i], price[i], total[i]);
        }

        System.out.println("-------------------------------");
        System.out.println("Total Amount: Rs. " + grandTotal);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Amount: Rs. " + finalAmount);
    }
}
