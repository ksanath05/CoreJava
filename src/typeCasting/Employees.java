package typeCasting;

public class Employees extends Person {
	
	int id;
	double salary;
	String designation;
	
	public Employees(String name, int age, char gender, int id, double salary, String designation) {
		super(name, age, gender);
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}

}
