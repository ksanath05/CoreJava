package typeCasting;

public class Students extends Person {

	String usn;
	double marks;
	String collegename;

	public Students(String name, int age, char gender, String usn, double marks, String collegename) {
		super(name, age, gender);
		this.usn = usn;
		this.marks = marks;
		this.collegename = collegename;
	}

}
