/*3. ATM Simulation
Create a simple ATM system.
Requirements
● Show a menu using switch-case:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
● Start with an initial balance.
● Prevent withdrawal if balance is insufficient.
● Continue showing the menu until the user chooses Exit.
*/
import java.util.Scanner;
class ATMSimulation{
	
	double balance = 1000; 
	
	public void menu(int choice, Scanner sc){
		 switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else if (withdraw <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
	}
	
	public static void main(String [] args){
		ATMSimulation atmsSimulation = new ATMSimulation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int choice;
		
		do{
			System.out.println("\n--- Banking Menu ---");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
		
			choice = sc.nextInt();
			atmsSimulation.menu(choice, sc);
			
		}while(choice != 4);
			
		sc.close();
	}
}