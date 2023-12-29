package constructors;

class Rolls {
	String modelName;
	String color;
	int topSpeed;
	int price;

	Rolls(String arg1, String arg2, int arg3, int arg4) {
		modelName = arg1;
		color = arg2;
		topSpeed = arg3;
		price = arg4;

	}

	void yourRoyce() {
		System.out.println("The model of your Royce is: " + modelName);
		System.out.println("The color of your Royce is: " + color);
		System.out.println("The top speed of your Royce is " + topSpeed);
		System.out.println("The price of your Royce is " + price);
	}

}

public class RollsRoyce {

	public static void main(String[] args) {
		Rolls Cullinan = new Rolls("Cullinan", "Black", 180, 275);
		Cullinan.yourRoyce();
		
		System.out.println("------------------------------");


		Rolls Phantom = new Rolls("Phantom", "White", 220, 260);
		Phantom.yourRoyce();
		
		System.out.println("------------------------------");


		Rolls Ghost = new Rolls("Ghost", "Red", 260, 300);
		Ghost.yourRoyce();
		
		System.out.println("------------------------------");


		Rolls Wraith = new Rolls("Wraith", "White", 280, 450);
		Wraith.yourRoyce();
	}

}
