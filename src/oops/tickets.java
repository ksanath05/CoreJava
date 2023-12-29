package oops;

public class tickets {
	//states /attributes
		int Total_tickets;    
			
		//behaviour
		//print number of tickets available
		void viewTicketsAvailable() {
			System.out.println("Total Tickets available : "+ Total_tickets);
		}
		
		//booking n tickets ,if available
		void bookingTickets(int n) {
			if(n < Total_tickets) {
				Total_tickets = (Total_tickets-n);
				      //also   Total_tickets -= n;
				System.out.println("Booked "+ n+ "  Tickets Successfully");
			}else {
				System.out.println("Booking Failed,Tickets not available for booking for ths show");
			}
		}
			
		//Canceling m tickets
		void CancleTickets(int m) {
			Total_tickets = Total_tickets+ m;
			   //also Total_tickets+=m;
			System.out.println("Canceled "+ m+ " Tickets successfully");
		}

}
