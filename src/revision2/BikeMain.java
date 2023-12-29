package revision2;

import java.util.Scanner;

public class BikeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the bike name");
		String bike = sc.nextLine();
		
		System.out.println("Enter the bhp");
		Double bhp = sc.nextDouble();
		
		System.out.println("Enter the cost of the bike");
		int cost = sc.nextInt();
		
		System.out.println("Enter the color of your bike");
		String color = sc.next();
		
		BikeScanner b1 = new BikeScanner (bike, bhp, cost, color);
		
		b1.details();

	}

}
