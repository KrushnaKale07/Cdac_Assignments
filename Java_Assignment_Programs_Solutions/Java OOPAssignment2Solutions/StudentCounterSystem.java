/*12. Student Counter System
Create a class Student:
Requirements:
● Instance variables: name, rollNo
● Static variable: totalStudents
● Increment totalStudents every time object is created
● Display total number of students
Bonus: Add a static method to display count*/

class StudentCounterSystem{
	
	String name;
	int rollNo;
	static int totalStudents = 0;
	
	
	StudentCounterSystem(String name,int rollNo){
		this.name = name;
		this.rollNo = rollNo;
		totalStudents++;
	}
	
	public void display(){
		System.out.println("Name: " + name + ", Roll No: " + rollNo);
		
	}
	
	static void showTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
	
	public static void main(String [] args){

		StudentCounterSystem stud1 = new StudentCounterSystem("Karan", 101);
		StudentCounterSystem stud2 = new StudentCounterSystem("Raman", 102);
		StudentCounterSystem stud3 = new StudentCounterSystem("Madan", 103);
		
		stud1.display();
        stud2.display();
        stud3.display();
		
		StudentCounterSystem.showTotalStudents();
	}
}