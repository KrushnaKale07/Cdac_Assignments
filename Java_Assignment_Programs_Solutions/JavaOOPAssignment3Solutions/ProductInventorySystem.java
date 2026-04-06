/*Question 5: Design a Product Inventory System
Requirements:
Each product has:
● Product ID, name
● Price, quantity
System should:
● Store multiple products
● Calculate total inventory value
● Update stock quantity
Support:
● Use constructor for initialization
● Use method overloading for price update (discount / direct update)
Display:
● Product details and stock value*/

import java.util.*;
class Product{
	int productId;
	String name;
	double price;
	int quantity;
	
	Product(int productId, String name, double price, int quantity){
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	void updateQuantity(int qty) {
        this.quantity = qty;
    }
	
	void updatePrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Price updated directly.");
    }
	
	void updatePrice(double discount, boolean isDiscount) {
        if (isDiscount) {
            this.price = this.price - (this.price * discount / 100);
            System.out.println("Price updated with discount.");
        }
    }
	
	double getStockValue() {
        return price * quantity;
    }
	
	void display() {
        System.out.println("\n--- Product Details ---");
        System.out.println("ID       : " + productId);
        System.out.println("Name     : " + name);
        System.out.println("Price    : Rs. " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Value    : Rs. " + getStockValue());
    }
	
}

class ProductInventorySystem{
	public static void main(String [] args){
		Product p1 = new Product(101, "Laptop", 50000, 5);
        Product p2 = new Product(102, "Mobile", 20000, 10);

        // Store products
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);

        // Update operations
        p1.updateQuantity(7);
        p1.updatePrice(10, true);   // 10% discount

        p2.updatePrice(18000);      // direct update

        // Calculate total inventory value
        double totalValue = 0;
        for (Product p : products) {
            totalValue += p.getStockValue();
        }

        // Display all products
        for (Product p : products) {
            p.display();
        }

        System.out.println("\nTotal Inventory Value: Rs. " + totalValue);
	}
}