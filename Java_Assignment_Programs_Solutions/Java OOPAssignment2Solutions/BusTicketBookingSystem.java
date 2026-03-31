/*6. Bus Ticket Booking System
Create a program for booking bus seats.
Requirements
● Assume a bus has 10 seats.
● Use an array to mark seats as booked or available.
● Show a menu:
1. View Available Seats
2. Book a Seat
3. Cancel a Seat
4. Exit
● Do not allow double booking*/

import java.util.Scanner;
class BusTicketBookingSystem{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int seats[] = new int[10];
		int choice;
		
		do{
			System.out.println("\n--- Bus Ticket Booking System ---");
			System.out.println("1. View Available Seats");
			System.out.println("2. Book a Seat");
			System.out.println("3. Cancel a Seat");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			
			choice = sc.nextInt();
			switch (choice) {
                case 1:
                    System.out.print("View Available Seats: ");
					for(int i = 0; i < seats.length; i++){
						if (seats[i] == 0)
                            System.out.println("Seat " + (i + 1) + " : Available");
                        else
                            System.out.println("Seat " + (i + 1) + " : Booked");

					}
                    break;
				case 2:
					System.out.print("Enter seat number to book (1-10): ");
                    int bookSeat = sc.nextInt();
					if (bookSeat < 1 || bookSeat > 10) {
                        System.out.println("Invalid seat number!");
                    }else if(seats[bookSeat-1] == 1){
						System.out.println("Seat already booked!");
					}else{
						seats[bookSeat - 1] = 1;
                        System.out.println("Seat " + bookSeat + " booked successfully");
					}
					break;
					
				case 3:
					 System.out.print("Enter seat number to cancel (1-10): ");
                    int cancelSeat = sc.nextInt();
					if (cancelSeat < 1 || cancelSeat > 10) {
                        System.out.println("Invalid seat number!");
                    }else if (seats[cancelSeat - 1] == 0) {
                        System.out.println("Seat is already available!");
                    } else {
                        seats[cancelSeat - 1] = 0;
                        System.out.println("Seat " + cancelSeat + " cancelled successfully");
                    }
					break;
				
				case 4:
                    System.out.println("Thank you! Exiting...");
                    break;
				default:
                    System.out.println("Invalid choice! Try again.");
			}
			
		}while(choice != 4);
			
		sc.close();
		
	}
}