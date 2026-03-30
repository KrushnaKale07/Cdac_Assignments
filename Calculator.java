import java.util.Scanner;
class Calculator{

	void add(int a, double b){
		int result = a + ((int)b);
		System.out.println(result);
	}
	
	void division(int a, double b){
		int result = a /((int)b);
		System.out.println(result);
	}
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int a =  10;
		double b =  2.0;
		Calculator calculator = new Calculator();
		calculator.add(a,b);
		calculator.division(a,b);
	}
}