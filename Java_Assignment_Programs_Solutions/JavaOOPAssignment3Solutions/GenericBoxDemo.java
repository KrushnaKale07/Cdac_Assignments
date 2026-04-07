/*Create a generic class Box<T> that:

Stores a value Has methods: setValue(T value) getValue()
Then:

Create objects for Integer, String Print values
Add method:

void displayType()
Print type of stored value*/

class Box<T>{
	private T value;
	
	public void setValue(T value){
		this.value = value;
	}
	
	public T getValue(){
		return value;
	}
	
	public void displayType() {
        System.out.println("Type: " + value.getClass().getSimpleName());
    }
}

public class GenericBoxDemo{
	public static void main(String [] args){
		Box<Integer> intBox = new Box<>();
		intBox.setValue(100);
		
		Box<String> strBox = new Box<>();
		strBox.setValue("Hello Brother !");
		
		System.out.println("Integer Value: " + intBox.getValue());
        intBox.displayType();

        System.out.println("\nString Value: " + strBox.getValue());
        strBox.displayType();
		
	}
}