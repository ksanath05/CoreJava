package typeCasting;

public class Government {

	// Operation class

	// Generalization
	void enrollAdhar(Person p) {
		// person p = new Student(); //person p = new Employee();
		System.out.println(p.name + "  Is Enrolled for Adhar card");

	}

	// Specialization
	void awardScholarShip(Students s) {
		if (s.marks >= 70.0) {
			System.out.println(s.name + " Student is Getting Scholarship");
		} else {
			System.out.println(s.name + " student is not getting Scholarship");
		}

	}

	// Specialization
	void taxPayment(Employees e) {
		if (e.salary <= 700000) {
			System.out.println(e.name + " employee doesn't have to make tax payment");
		} else {
			System.out.println(e.name + "  Employee has to make Tax payment");
		}
	}
}
