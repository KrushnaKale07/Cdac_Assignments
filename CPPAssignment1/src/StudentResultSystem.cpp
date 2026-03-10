//============================================================================
// Name        : Krushna Kale
// Author      : Krushna
// Version     :
// Copyright   : Your copyright notice
// Description : Student Result System.
//============================================================================
#include <iostream>
#include <string>

using namespace std;

class Student{

	protected:
		int rollNo;

		Student(int rollNo) : rollNo(rollNo){}

		virtual void display(){
			cout << "your roll number is : " << rollNo << endl;
		}
};

class Result : public Student{

	double marks;

	Result(int rollNo, double marks) : rollNo(rollNo), marks(marks){

	}
}

int main(){

}
