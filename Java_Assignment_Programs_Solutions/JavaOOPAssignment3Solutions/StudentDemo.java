/*Create a class Student with:

id name marks

Then:

Store 5 students in ArrayList Sort them based on marks (descending) Print sorted list 

Requirements: Use Collections.sort() Use Comparator (not Comparable) 
Collections.sort(list, (a, b) -> b.marks - a.marks);
*/

import java.util.*;
class Student{

	int id;
	String name;
	int marks;
	
		Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
	
	void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

class StudentDemo{
	public static void main(String [] args){
		Student student1 = new Student(101,"Kiran", 88);
		Student student2 = new Student(102,"Ankita", 45);
		Student student3 = new Student(103,"Rohan", 61);
		Student student4 = new Student(104,"Manan", 75);
		Student student5 = new Student(105,"Rajesh",91);
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		Collections.sort(students, (a, b) -> b.marks - a.marks);

        // Display sorted list
        System.out.println("Sorted Students (by marks descending):");
        for (Student s : students) {
            s.display();
        }
		
	}
}