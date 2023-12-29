package typeCasting;

public class MainGovernmentApp {

	public static void main(String[] args) {

		System.out.println("Program started");

		Person p1 = new Person("Keerthi", 25, 'F');
		Students s1 = new Students("Tony", 20, 'M', "USN123IM", 69, "Stark College");
		Employees e1 = new Employees("Arvind", 30, 'M', 100, 700000.5, "Manager");

		Government g = new Government();

		// Generalization
		// g.enrollAdhar(new Person("Keerthi",25,'F')); //yes i can do like this also
		g.enrollAdhar(p1);
		g.enrollAdhar(s1);
		g.enrollAdhar(e1);

		System.out.println("----------");
		// specialization
		//g.awardScholarShip(p1);
		g.awardScholarShip(s1);
		// g.awardScholarShip(e1);

		System.out.println("----------");
		// specialization
		// g.taxPayment(p1);
		// g.taxPayment(s1);
		g.taxPayment(e1);

		System.out.println("Program Ended");
	}
}