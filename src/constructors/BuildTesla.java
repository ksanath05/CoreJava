package constructors;

class Tesla {
	String color;
	String version;
	int range;
	int price;
	String modelName;

	public Tesla(String modelName, String color, String version, int range, int price) {

		this.color = color;
		this.version = version;
		this.range = range;
		this.price = price;
		this.modelName = modelName;
	}

	void cardetails() {
		System.out.println("The model of the car is: " + modelName);
		System.out.println("The color of the car is: " + color);
		System.out.println("The version of the car is: " + version + " version");
		System.out.println("The WLTP range of the car is: " + range + " kms");
		System.out.println("The price of the car is: $" + price + "k");
	}
}

public class BuildTesla {

	public static void main(String[] args) {

		Tesla ModelS = new Tesla("Model S", "Red", "Plaid", 600, 120);
		ModelS.cardetails();

		System.out.println("----------------------------------------");

		Tesla Model3 = new Tesla("Model 3", "Blue", "Standard Range", 540, 65);
		Model3.cardetails();

		System.out.println("----------------------------------------");

		Tesla ModelX = new Tesla("Model X", "White", "Performance", 400, 125);
		ModelX.cardetails();

		System.out.println("----------------------------------------");

		Tesla ModelY = new Tesla("Model Y", "Grey", "Long Range", 650, 110);
		ModelY.cardetails();
	}

}
