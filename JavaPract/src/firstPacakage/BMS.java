package firstPacakage;

import java.util.List;

import net.bytebuddy.implementation.ToStringMethod;

public class BMS {

	public static void main(String[] args) {
		int no_of_Tickits = 8;
		
		/* PVRMovies ticket= PVRMovies.booktickets();
		 System.out.println("Ticket id is "+ticket);
		  System.out.println("your ticket status is ");*/
		 
		for (int i = 1; i <= no_of_Tickits; i++) {
			PVRMovies ticket = PVRMovies.booktickets();
			System.out.println("Ticket id  of ticketNo-" + i + " is " + ticket);
		}
	}

}

class PVRMovies {
	private static String ticketStatus;
	private static PVRMovies ticket;

	private PVRMovies() {
		// System.out.println("Welcome to PVR");

	}

	public static PVRMovies booktickets() {
		ticket = new PVRMovies();
		ticketStatus = "Confirmed";
		return ticket;
	}
}
