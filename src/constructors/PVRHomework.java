package constructors;

import java.util.Scanner;

public class PVRHomework {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter the movie name");
		String moviename = sc.nextLine();
		
		System.out.println("Please specify the budget");
		int budget = sc.nextInt();
		
		System.out.println("Please rate the movie on a scale 1 to 10");
		double rating = sc.nextDouble();
		
		
	    MovieHomework m1 = new MovieHomework(moviename, budget, rating);
	
	    m1.MovieDetails();

	}

}
