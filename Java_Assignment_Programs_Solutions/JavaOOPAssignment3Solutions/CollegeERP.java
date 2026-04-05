/*Question 1: Design a College ERP (Student Module)
Requirements:
● Each student has:
	○ Roll number, name
	○ Marks in multiple subjects
	○ Contact details (phone, email)
● System should:
	○ Store multiple students
	○ Calculate total & average marks
	○ Track total students admitted
● Support:
	○ Flexible average calculation
● Display formatted student report*/

import java.util.*;
class Student{
	int rollNO;
	String name;
	String phone;
	String email;
	double marks[] = new double[5];
	double total;
	double avarage;
	static int totalStudents = 0;
	
	Student(int rollNo, String name, String phone, String email, double[] marks) {
		 this.rollNO = rollNO;
		 this.name = name;
		 /*for(int i = 0; i < 5; i++){
			this.marks[i] = marks[i];
		 }*/
		 this.marks = marks;
		 this.phone = phone;
		 this.email = email;
		 totalStudents++;
	}
	
	double calculateTotal() {
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum;
    }
	
	double calculateAverage() {
        return calculateTotal() / marks.length;
    }
	
	void displayReport() {
        System.out.println("\n===== Student Report =====");
        System.out.println("Roll No : " + rollNO);
        System.out.println("Name    : " + name);
        System.out.println("Phone   : " + phone);
        System.out.println("Email   : " + email);

        System.out.print("Marks   : ");
        for (double m : marks) {
            System.out.print(m + " ");
        }

        System.out.println("\nTotal   : " + calculateTotal());
        System.out.println("Average : " + calculateAverage());
        System.out.println("==========================");
    }
}

class CollegeERP{
	
	public static void main(String [] args){
		Student s1 = new Student(1, "Rahul", "9876543210", "rahul@mail.com",
                new double[]{80, 75, 90});

        Student s2 = new Student(2, "Anita", "9123456780", "anita@mail.com",
                new double[]{60, 70, 65, 85}); 

        Student s3 = new Student(3, "Suresh", "9988776655", "suresh@mail.com",
                new double[]{88, 92, 79});

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (Student s : students) {
            s.displayReport();
        }

        System.out.println("\nTotal Students Admitted: " + Student.totalStudents);
	}
		
		
	}