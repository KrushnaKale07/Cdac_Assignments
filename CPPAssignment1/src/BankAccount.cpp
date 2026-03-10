//============================================================================
// Name        : Krushna Kale
// Author      : Krushna
// Version     :
// Copyright   : Your copyright notice
// Description : Banking Transactions.
//============================================================================
#include <iostream>
#include <string>

using namespace std;

class BankAccount {

private:
	int accountNumber;
	string accountHolderName;
	double balance = 0;

public:
	const string& getAccountHolderName() const {
		return accountHolderName;
	}

	void setAccountHolderName(const string &accountHolderName) {
		this->accountHolderName = accountHolderName;
	}

	int getAccountNumber() const {
		return accountNumber;
	}

	void setAccountNumber(int accountNumber) {
		this->accountNumber = accountNumber;
	}

	double getBalance() const {
		return balance;
	}

	void setBalance(double balance) {
		this->balance = balance;
	}

	double deposite(double amount) {
		balance += amount;
		return balance;

	}

	double withdraw(double amount) {

		if (balance > amount) {
			balance -= amount;
			return balance;
		} else {
			return 0;
		}
	}

	void displayAccountDetails() {

		cout << "Your account number is : " << accountNumber << endl;
		cout << "Your account holder name is : " << accountHolderName << endl;
		cout << "Your account balance is : " << balance << endl;
	}
//	double checkBalance(int accountNumber) {
//	if(accountNumber == this->accountHolderName) {
//			return balance;
//		}else{
//			return 0;
//		}
//	}
};

int main() {

	int choice;
	int accountNumber;
	double amount;
	double remaining;
	double originalBalance;
	string accountHolderName;

	BankAccount bankAccount;

	do {
		cout << "\n===== MENU =====\n";
		cout << "1. To enter your Information\n";
		cout << "2. To Deposit money into an existing account\n";
		cout << "3. Withdraw money from an existing account.\n";
		cout << "4. Display the account details\n";
		cout << "5. Exit\n";
		cout << "Enter your choice: ";
		cin >> choice;

		switch (choice) {
		case 1:
			cout << "Enter account number: ";
			cin >> accountNumber;
			cout << "Enter your name: ";
			cin >> accountHolderName;

			bankAccount.setAccountNumber(accountNumber);
			bankAccount.setAccountHolderName(accountHolderName);
			break;

		case 2:
			cout << "Enter amount to deposite" << endl;
			cin >> amount;
			remaining = bankAccount.deposite(amount);
			cout<< "You have successfully deposite amount and your balance is : "
									<< remaining << endl;
			bankAccount.displayAccountDetails();
			break;

		case 3:

			cout << "Enter amount to withdrew" << endl;
			cin >> amount;
			remaining = bankAccount.withdraw(amount);
			if (remaining > 0) {
				cout
						<< "You have successfully withdraw amount and your remaining balance is : "
						<< remaining << endl;
				bankAccount.displayAccountDetails();
			} else {
				cout << "Insufficient balance please check details" << endl;
//				originalBalance = bankAccount.checkBalance(accountNumber);
//				if(originalBalance > 0){
//
//				}
			}
			break;

		case 4:
			bankAccount.displayAccountDetails();
			break;

		case 5:
			cout << "Exiting program...\n";
			break;

		default:
			cout << "Invalid choice!\n";
		}

	} while (choice != 5);
}
