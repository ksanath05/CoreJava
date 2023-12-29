package oops;
	
class GPS{
	
	String direction;
	double longitude;
	double latitude;
	
	void displayLocation() {
	System.out.println(direction +" "+longitude+" "+ latitude);
	}
}


public class MainGPS {

	public static void main(String[] args) {
		
		GPS g1 = new GPS(); //object 1
		g1.displayLocation();
		g1.direction= "Middle East";
		g1.longitude=46.764;
		g1.latitude=20.790;
		g1.displayLocation();
		
		System.out.println("-------------------");
	
		GPS g2 = new GPS();  //object 2
		g2.displayLocation();
		g2.direction= "North";
		g2.longitude=721.74;
		g2.latitude=317.90;
		g2.displayLocation();
		
	}

}