/*9. Daily Expense Tracker
Create a program to track a person’s daily expenses.
Requirements
● Accept expenses for 7 days in an array.
● Calculate:
○ total weekly expense
○ average expense
○ highest expense
○ lowest expense
● Display the day on which the highest expense occurred.*/

import java.util.*;

public class DailyExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] expenses = new double[7];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int maxDayIndex = 0;

        // Input expenses
        System.out.println("Enter expenses for 7 days:");
        for (int i = 0; i < 7; i++) {
            System.out.print(days[i] + ": ");
            expenses[i] = sc.nextDouble();

            total += expenses[i];

            if (expenses[i] > max) {
                max = expenses[i];
                maxDayIndex = i;
            }

            if (expenses[i] < min) {
                min = expenses[i];
            }
        }

        double average = total / 7;

        // Output
        System.out.println("\n----- Weekly Expense Report -----");
        System.out.println("Total Expense   : Rs. " + total);
        System.out.println("Average Expense : Rs. " + average);
        System.out.println("Highest Expense : Rs. " + max);
        System.out.println("Lowest Expense  : Rs. " + min);
        System.out.println("Highest on      : " + days[maxDayIndex]);
    }
}
