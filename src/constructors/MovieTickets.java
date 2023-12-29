package constructors;

class Tickets {
	int total_tickets;

	void viewAvailableTickets() {
		System.out.println("The total availabale tickets is " + total_tickets);
	}

	void bookTickets(int x) {
		if (x < total_tickets) {
			total_tickets -= x;
			System.out.println("Successfully booked " + x + " tickets.");
		} else if (x > total_tickets) {
			System.out.println("Your booking request exceeds the available tickets for this show. Please modify");
		} else {
			System.out.println("Sorry. No more tickets are available for this show");
		}
	}

	void cancelTickets(int y) {
		total_tickets += y;
		System.out.println("Your booking has been cancelled");
	}
}

public class MovieTickets {

	public static void main(String[] args) {

		Tickets t1 = new Tickets();

		t1.total_tickets = 70;

		t1.viewAvailableTickets();

		t1.bookTickets(80);

		t1.bookTickets(20);

		t1.bookTickets(48);

		System.out.println("-------------------");

		t1.viewAvailableTickets();

		t1.bookTickets(15);

		t1.cancelTickets(15);

		t1.cancelTickets(25);

		t1.bookTickets(8);

		t1.cancelTickets(23);

		System.out.println("--------------------");

		t1.viewAvailableTickets();

	}

}
