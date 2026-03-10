//============================================================================
// Name        : Krushna Kale
// Author      : Krushna
// Version     :
// Copyright   : Your copyright notice
// Description : Student Data
//============================================================================
#include <iostream>
#include <string>
using namespace std;

class Student {

private:
	string name;
	int rollNumber;
	float marks;
	char grade;

public:

	Student() {
	}

	Student(string name, int rollNumber, float marks, char grade) :
			name(name), rollNumber(rollNumber), marks(marks), grade(grade) {

	}

	char getGrade() const {
		return grade;
	}

	void setGrade(char grade) {
		this->grade = grade;
	}

	float getMarks() const {
		return marks;
	}

	void setMarks(float marks) {
		this->marks = marks;
	}

	const string& getName() const {
		return name;
	}

	void setName(const string &name) {
		this->name = name;
	}

	int getRollNumber() const {
		return rollNumber;
	}

	void setRollNumber(int rollNumber) {
		this->rollNumber = rollNumber;
	}

	void display() {
		cout << "\n--- Student Information ---\n";
		cout << "Name: " << name << endl;
		cout << "Roll Number: " << rollNumber << endl;
		cout << "Marks: " << marks << endl;
		cout << "Grade: " << grade << endl;
	}
	;

	int calculateGrade(int marks) {

		if (marks <= 100 && marks >= 90) {
			grade = 'A';
			cout << "Your grade is : " << grade << endl;
		} else if (marks <= 89 && marks >= 80) {
			grade = 'B';
			cout << "Your grade is : " << grade << endl;

		} else if (marks <= 79 && marks >= 70) {
			grade = 'C';
			cout << "Your grade is : " << grade << endl;

		} else if (marks <= 69 && marks >= 60) {
			grade = 'D';
			cout << "Your grade is : " << grade << endl;
		} else if (marks < 60) {
			grade = 'E';
			cout << "Your grade is : " << grade << endl;
		}

		cout << "Grade Calculated Successfully!\n";
	}
	;

};

//int main() {
//
//	Student student1;
//	string name;
//	int rollNumber;
//	float marks;
//	int choice;
//
////	cout << "Enter Name: ";
////	getline(cin, name);
////	cout << "Enter Roll Number: ";
////	cin >> rollNumber;
////	cout << "Enter Marks: ";
////	cin >> marks;
//
//	do {
//		cout << "\n===== MENU =====\n";
//		cout << "1. To enter your Information\n";
//		cout << "2. Display Information\n";
//		cout << "3. Calculate Grade\n";
//		cout << "4. Exit\n";
//		cout << "Enter your choice: ";
//		cin >> choice;
//
//		switch (choice) {
//		case 1:
//			cout << "Enter Name: ";
//			cin.ignore();
//			getline(cin, name);
//			cout << "Enter Roll Number: ";
//			cin >> rollNumber;
//			cout << "Enter Marks: ";
//			cin >> marks;
//
//			student1.setName(name);
//			student1.setRollNumber(rollNumber);
//			student1.setMarks(marks);
//
////			Student student1(name, rollNumber, marks, calculateGrade(marks));
//			break;
//
//		case 2:
//			student1.display();
//			break;
//
//		case 3:
//			student1.calculateGrade(marks);
//			break;
//
//		case 4:
//			cout << "Exiting program...\n";
//			break;
//
//		default:
//			cout << "Invalid choice!\n";
//		}
//
//	} while (choice != 4);
//
//	return 0;
//
//}
