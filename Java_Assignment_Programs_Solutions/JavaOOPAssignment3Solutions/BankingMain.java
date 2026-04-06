/*Question 3: Design a Banking System
Requirements:
Each account has:
● Account number, holder name
● Balance
System should:
● Store multiple accounts
● Deposit & withdraw money
● Prevent withdrawal if balance is insufficient
● Track total number of accounts
Support:
● Overloaded methods for deposit (cash / online)
Display:
● Account details with updated balance*/

import java.util.ArrayList;
class BankingSystem{
	
	int accountNumber;
	String holderName;
	double balance;
	static int totalAccounts = 0;
	
	BankingSystem(int accountNumber, String holderName, double balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		totalAccounts++;
	}
	
	public void withdraw(double amount){
		if(balance > amount){
			balance -= amount;
			System.out.println(amount +" is debited and your current account balance is : "+ balance);
		}else{
			System.out.println("Insufficient balance !");
		}
	}
	
	void deposit(double amount) {
        balance += amount;
        System.out.println(holderName + amount +" is deposited and your current account balance is : "+ balance);
    }
	
	public void deposit(double amount, String mode){
		balance = balance + amount;
		System.out.println(amount +" is deposited " + mode + " and your current account balance is : "+ balance);
	}
	void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No : " + accountNumber);
        System.out.println("Name       : " + holderName);
        System.out.println("Balance    : Rs. " + balance);
    }
	
}

class BankingMain{
	
	public static void main(String [] args){
		BankingSystem bs1 = new BankingSystem(75215622, "Raman", 1000);
		BankingSystem bs2 = new BankingSystem(45145612, "Karan", 2000);

		ArrayList<BankingSystem> bankAccounts = new ArrayList<>();
		bankAccounts.add(bs1);
		bankAccounts.add(bs2);
		
		bs1.deposit(2000);
		bs1.deposit(1500, "Online");       // overloaded
		bs1.withdraw(1000);
		
		bs2.withdraw(1000);
		
		for (BankingSystem bs : bankAccounts) {
				bs.display();
			}

		System.out.println("\nTotal Accounts : " + BankingSystem.totalAccounts);
	}
}