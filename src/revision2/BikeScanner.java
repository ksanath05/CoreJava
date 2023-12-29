package revision2;

public class BikeScanner {

	String bike;
	double bhp;
	int cost;
	String color;
	
	BikeScanner (String arg1, double arg2, int arg3, String arg4) {
		
		bike = arg1;
		bhp = arg2;
		cost = arg3;
		color = arg4;
	}
	
	void details() {
		
		System.out.println("Your bike name is "+ bike);
		System.out.println(bike+"'s power is "+bhp);
		System.out.println(bike+"'s cost is "+cost);
		System.out.println("The color of the bike is "+ color);
	}
}
