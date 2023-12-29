package oops;

public class bookmyshow {
	public static void main(String[] args) {
		System.out.println("Prog Start");
		tickets t1 = new tickets();
         t1.Total_tickets=100;
         t1.viewTicketsAvailable();
         t1.bookingTickets(10);
         
         t1.viewTicketsAvailable();
         
         t1.CancleTickets(5);
         
         t1.viewTicketsAvailable();
         System.out.println("Prog End");
	}

}
