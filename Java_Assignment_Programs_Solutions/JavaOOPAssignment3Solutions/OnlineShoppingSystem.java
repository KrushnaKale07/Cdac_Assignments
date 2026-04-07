import java.util.*;

public class OnlineShoppingSystem {

    public static void processOrder(int quantity, double[] prices, int index) {
        try {
            // Check invalid quantity
            if (quantity <= 0) {
                throw new ArithmeticException();
            }

            // Access product price
            double unitPrice = prices[index];

            // Calculate total
            double total = quantity * unitPrice;

            System.out.println("Total Price: " + total);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();      // e.g., 0
        int n = sc.nextInt();             // number of products

        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        int index = sc.nextInt();         // product index

        processOrder(quantity, prices, index);
    }
}