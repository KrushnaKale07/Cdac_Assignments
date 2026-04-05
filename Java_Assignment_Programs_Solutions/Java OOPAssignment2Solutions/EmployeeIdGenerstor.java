/*19. Employee ID Generator
Create a class Employee:
Requirements:
● Static variable: counter
● Each employee gets auto-incremented ID
● Use constructor to assign ID
● Display employee details*/

class Employee {
	
	 static int counter = 1000 ;
	 String empName;
	 int empId = 0;
	 
	 Employee(String name){
		 this.empName = name;
		 counter++;
		 this.empId = counter;
	}
	
	 void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name       : " + empName);
        System.out.println("----------------------");
		}
}

public class EmployeeIdGenerstor {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Anita");
        Employee e3 = new Employee("Suresh");

        e1.display();
        e2.display();
        e3.display();
    }
}