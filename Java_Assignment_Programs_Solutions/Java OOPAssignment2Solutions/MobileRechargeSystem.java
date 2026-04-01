/*7. Mobile Recharge System
Create a recharge application for prepaid mobile users.
Requirements
● Ask for mobile number and recharge amount.
● Show recharge plans using switch-case.
● Example:
○ Rs. 199 → 28 days validity
○ Rs. 399 → 56 days validity
○ Rs. 599 → 84 days validity
● Print recharge confirmation with plan details.*/

import java.util.*;
import java.util.Scanner;
class MobileRechargeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.println("\nAvailable Plans:");
        System.out.println("1. Rs. 199 → 28 days");
        System.out.println("2. Rs. 399 → 56 days");
        System.out.println("3. Rs. 599 → 84 days");

        System.out.print("Enter recharge amount: ");
        int amount = sc.nextInt();

        String validity = "";

        // Switch-case for plans
        switch (amount) {
            case 199:
                validity = "28 days";
                break;

            case 399:
                validity = "56 days";
                break;

            case 599:
                validity = "84 days";
                break;

            default:
                System.out.println("Invalid recharge amount!");
                return;
        }

        // Output
        System.out.println("\n Recharge Successful!");
        System.out.println("Mobile Number : " + mobile);
        System.out.println("Plan Amount   : Rs. " + amount);
        System.out.println("Validity      : " + validity);
        System.out.println("Thank you for recharging!");

        sc.close();
    }
}