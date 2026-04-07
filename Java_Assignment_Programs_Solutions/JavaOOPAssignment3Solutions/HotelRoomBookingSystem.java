import java.util.*;
class RoomNotAvailableException extends Exception {
    public RoomNotAvailableException(String msg) {
        super(msg);
    }
}

class InvalidBookingException extends Exception {
    public InvalidBookingException(String msg) {
        super(msg);
    }
}

class Room{
	int roomId;
	String roomType;
	double price;
	boolean isAvailable;
	
	Room() {
        this(0, "Unknown", 0.0, true);
    }
	
	Room(int roomId, String roomType, double price, boolean isAvailable){
		this.roomId = roomId;
		this.roomType = roomType;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	
	void bookRoom() throws RoomNotAvailableException{
		if(!isAvailable){
			throw new RoomNotAvailableException("Rooom " + roomId + "is not available!");
		}
		isAvailable = false;
		System.out.println("Room " + roomId + " booked successfully.");
	}
	
	void cancleRoom() throws InvalidBookingException{
		if(isAvailable){
			throw new InvalidBookingException("Room " + roomId + " is already free!");
		}
		isAvailable = true;
		System.out.println("Room " + roomId + " booking cancelled.");
	}
	
	void display() {
        System.out.println(roomId + " | " + roomType + " | Rs." + price + " | Available: " + isAvailable);
    }
}

class LuxuryRoom extends Room{
	String amenities;
	
	LuxuryRoom(){}
	LuxuryRoom(int roomId, double price, String amenities){
		super(roomId, "Luxury", price, true);
		this.amenities = amenities;
	}
	
	void bookRoom() throws RoomNotAvailableException {
        super.bookRoom();
        System.out.println("Free amenities: " + amenities);
    }
	
}

class EconomyRoom extends Room{
	 boolean freeWiFi;
	
	EconomyRoom(){}
	EconomyRoom(int roomId, double price,  boolean freeWiFi){
		super(roomId, "Economy", price, true);
		this.freeWiFi = freeWiFi;
	}
	
	void bookRoom() throws RoomNotAvailableException {
        super.bookRoom();
        System.out.println("Free WiFi: " + freeWiFi);
    }
}

class Customer{
	int customerId;
	String name;
	String email;
	
	Customer(){}
	Customer(int customerId, String name, String email){
		this.customerId = customerId;
		this.name = name;
		this.email = email;
	}
	
	void bookRoom(Room room, Map<Customer, Room> bookings) throws Exception{
		room.bookRoom();
		bookings.put(this, room);
	}
	
	void cancleRoom(Map<Customer, Room> bookings) throws Exception{
		if(!bookings.containsKey(this)){
			throw new InvalidBookingException("No booking found");
		}
		Room room = bookings.get(this);
		room.cancleRoom();
		bookings.remove(this);
	}
	
	//@Override
    public String toString() {
        return name + " (" + customerId + ")";
    }
}

public class HotelRoomBookingSystem{
	public static void main(String [] args){
		List<Room> rooms = new ArrayList<>();
		rooms.add(new LuxuryRoom(101, 5000, "Pool, Spa"));
		rooms.add(new EconomyRoom(102, 2000, true));
		
		Map<Customer, Room> bookings = new HashMap<>();
		
		Customer c1 = new Customer(1, "Rahul", "rahul@gmail.com");
		
		try{
			System.out.println("Available Rooms:");
			for(Room r : rooms){
				r.display();
			}
			
			c1.bookRoom(rooms.get(0), bookings);
			
			c1.bookRoom(rooms.get(0), bookings);
			
		}catch(RoomNotAvailableException e){
			System.out.println("Error: " + e.getMessage());
		}catch(InvalidBookingException e){
			System.out.println("Error: " + e.getMessage());
		}catch(Exception e){
			System.out.println("General Error: " + e.getMessage());
		}
	}
}