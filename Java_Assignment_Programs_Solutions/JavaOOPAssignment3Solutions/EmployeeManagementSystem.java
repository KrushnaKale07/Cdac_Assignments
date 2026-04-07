import java.util.*;
class Employee{
	
	String name;
	double salary;
	
	Employee(){}
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
        System.out.println(name + ":" + (int)salary);
    }
}

class EmployeeManagementSystem{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> employees = new ArrayList<>();
		int n = 7;
		for (int i = 0; i < n; i++) {
            String name = sc.next();
            double salary = sc.nextDouble();

            employees.add(new Employee(name, salary));
        }
		
		System.out.println("Employee List:");
        for (Employee e : employees) {
            e.display();
        }
	}

}