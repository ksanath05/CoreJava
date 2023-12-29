package revision2;

import java.util.Scanner;


 class Car {
	
	String carname;
	String color;
	int cost;
	int power;
	double mileage;
	
	public Car(String arg1, String arg2, int arg3, int arg4, double arg5 ){
		
		carname = arg1;
		color = arg2;
		cost = arg3;
		power = arg4;
		mileage = arg5;		
	}
	
	void cardetails() {
		
		System.out.println("The name of the car is "+ carname + ". It's of "+ color +" color. It costs "+ cost +" Euros. It has a total power putput of "+ power+ " bhp. It gives a mileage of "+ mileage + " per litre");
	}
	
}



public class CarScanner {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter the name of the car");
		String carname = sc.nextLine();
		
		System.out.println("Enter the color of the car");
		String color = sc.nextLine();
		
		System.out.println("Enter the cost of the car");
		int cost = sc.nextInt();
		
		System.out.println("Enter the power of the car in bhp");
		int power = sc.nextInt();
		
		System.out.println("Enter the mileage of the car");
		double mileage = sc.nextDouble();

	
	Car c1 = new Car(carname, color, cost, power, mileage);
	
	c1.cardetails();

}
}
