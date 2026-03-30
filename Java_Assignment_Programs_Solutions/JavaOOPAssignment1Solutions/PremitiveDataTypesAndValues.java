import java.lang.*;

class PremitiveDataTypesAndValues{
	int a;
	char c;
	float f;
	double d;
	
	PremitiveDataTypesAndValues(int a){
		this.a = a;
		System.out.println("constroctor " + a);
	}
	
	
	static void show(PremitiveDataTypesAndValues p){
		
		//System.out.println("in show " + this.a);
		//non-static variable this cannot be referenced from a static context
		System.out.println("in show " + p.a);
	}
	
	public static void main(String [] args){
		PremitiveDataTypesAndValues p =	new PremitiveDataTypesAndValues(10);
		p.a = 20;
		p.show(p);
		
	System.out.println("in main " + p.a);
	System.out.println("in main " + p.c);
	System.out.println("in main " + p.f);
	System.out.println("in main " + p.d);
	}
}