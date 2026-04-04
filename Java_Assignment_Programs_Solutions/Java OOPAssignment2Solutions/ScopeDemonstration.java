/*17. Scope Demonstration Program
Create a program:
Requirements:
● Declare variable inside:
	○ Method
	○ Loop
	○ Block
● Try accessing outside scope (show error via comments)
● Print valid usages*/

class ScopeDemonstration{
	
	static{
		int a = 10;
	}
	
	public void display(){
			int b = 20;
			for(int i = 0; i < 10; i++){
				if(i > 5){
					//System.out.println(a); //error: cannot find symbol
					break;
				}
			}
			//System.out.println(i);	//  error: cannot find symbol	
	}
	
	public static void main(String [] args){
		ScopeDemonstration sd = new ScopeDemonstration();
		sd.display();
		System.out.println(sd.b); // error: cannot find symbol
	}	
}