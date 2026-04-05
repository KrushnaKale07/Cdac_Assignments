/*Question 2: Design a Fleet Management System
Requirements:
● Base class: Vehicle
● Derived classes: Car, Bike
● System should:
	○ Track brand & speed
	○ Store fuel type / mileage
● Use:
	○ Static block → system initialization
	○ Non-static block → object creation log
● Allow:
	○ Updating vehicle speed
● Display vehicle details*/

class Vehicle{
	String brand;
    int speed;
	
	static {
        System.out.println("Fleet Management System Initialized");
    }

    {
        System.out.println("New Vehicle Object Created");
    }

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void updateSpeed(int speed) {
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
	
}

class Car extends Vehicle{
	String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void display() {
        super.display();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("-----------------------");
    }
}

class Bike extends Vehicle{
	
	int mileage;

    Bike(String brand, int speed, int mileage) {
        super(brand, speed);
        this.mileage = mileage;
    }

    void display() {
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("-----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", 120, "Petrol");
		c1.updateSpeed(140);
		c1.display();
		
        Bike b1 = new Bike("Yamaha", 80, 45);
        // Update speed 
        b1.updateSpeed(90);
        // Display details     
        b1.display();
    }
}
