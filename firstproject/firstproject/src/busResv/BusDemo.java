package busResv;
import java.util.Scanner;
import java.util.ArrayList ;
public class BusDemo {
 public static void main(String[] args) {
	 ArrayList<Bus> buses = new ArrayList<Bus>() ;
	 ArrayList<Booking> bookings = new ArrayList<Booking>() ;
	 buses.add(new Bus(1 , true , 2)) ;
	 buses.add(new Bus(2 , false , 5)) ;
	 buses.add(new Bus(3 , true , 5)) ;
	 buses.add(new Bus(4 , false , 8)) ;
	 
	 int userOpt = 1 ;
	 Scanner scanner = new Scanner(System.in) ;
	 
	 for( Bus b : buses ) {
		 b.displayBusInfo();
		 
	 }
	while(userOpt == 1 ) {
		System.out.print("Enter 1 to book and 2 to Exit ");
		userOpt = scanner.nextInt();
		if ( userOpt == 1) {
			Booking booking = new Booking() ;
			if ( booking.isAvailable(bookings ,buses)) {
				bookings.add(booking);
				System.out.print("Your booking is confirmed ");
				
			}
			else {
				System.out.print("Sorry . bus is full . try another bus or date ");
			}
		}
	}
	 
	 
 }
}
