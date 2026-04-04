/*13. Bank Account System
Create a class BankAccount:
Requirements:
● Variables: accountNumber, name, balance
● Use:
	○ Default constructor
	○ Parameterized constructor
● Display account details
● Create multiple objects using different constructors*/

class BankAccountSystem{
	double accountNumber;
	String name;
	double balance;
	
	BankAccountSystem(){
		accountNumber = 0.0;
        name = "Not Provided";
        balance = 0.0;
	}
	
	BankAccountSystem(String name, double accountNumber, double balance){
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void acctDetails(){
		 System.out.println("Account Number: " + accountNumber);
        System.out.println("Name          : " + name);
        System.out.println("Balance       : Rs. " + balance);
        System.out.println("-----------------------------");
	}
	
	public static void main(String [] args){
		BankAccountSystem bas1 = new BankAccountSystem();
		BankAccountSystem bas2 = new BankAccountSystem("Raman", 564532, 84245);
		BankAccountSystem bas3 = new BankAccountSystem("Madan", 874523, 74532);
		
		bas1.acctDetails();
		bas2.acctDetails();
		bas3.acctDetails();
		
	}
}