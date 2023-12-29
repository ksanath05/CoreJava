package constructors;

class Royce {
	String modelName;
	String color;
	int topSpeed;
	int price;

	public Royce(String modelName, String color, int topSpeed, int price) {
		super();
		this.modelName = modelName;
		this.color = color;
		this.topSpeed = topSpeed;
		this.price = price;
	}

	void yourRoyce() {
		System.out.println("Your Rolls-Royce model is " + modelName);
		System.out.println("The color of your Rolls-Royce " + modelName + " is " + color);
		System.out.println("Your Rolls-Royce " + modelName + " has a top speed of " + topSpeed +"km/h");
		System.out.println("Your Rolls-Royce " + modelName + " price is USD " + price + "000");

	}

}

public class RR {

	public static void main(String[] args) {

		Royce Ghost = new Royce("Ghost", "Red", 260, 300);
		Ghost.yourRoyce();

		System.out.println("------------------------------");

		Royce Wraith = new Royce("Wraith", "White", 280, 450);
		Ghost.yourRoyce();

		System.out.println("------------------------------");

		Royce Phantom = new Royce("Phantom", "Blue", 260, 400);
		Ghost.yourRoyce();

		System.out.println("------------------------------");

		Royce Cullinan = new Royce("Cullinan", "Black", 270, 370);
		Ghost.yourRoyce();

		System.out.println("-------------------------------");

	}

}
