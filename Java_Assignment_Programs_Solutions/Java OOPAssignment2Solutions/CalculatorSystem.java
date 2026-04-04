/*11. Calculator System (Overloaded Methods)
Create a Java program for a calculator:
Requirements:
● Create methods named calculate
● Overload them for:
○ int + int
○ double + double
○ int + int + int
● Call all methods from main
● Display results clearly*/

class CalculatorSystem{

	public void calculate(int num1, int num2){
		System.out.print("The output of int + int is :");
		System.out.println(num1+num2);
	}
	
	public void calculate(double num1, double num2){
		System.out.print("The output of double + double is : ");
		System.out.println(num1+num2);
	}
	
	public void calculate(int num1, int num2, int num3){
		System.out.print("The output of int + int + int is : " );
		System.out.println(num1+num2+num3);
	}
	
	public static void main(String [] args){
		CalculatorSystem cs = new CalculatorSystem();
		cs.calculate(10,20);
		cs.calculate(10.00,20.10);
		cs.calculate(1,2);
	}
	
}