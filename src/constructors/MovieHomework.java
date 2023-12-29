package constructors;

public class MovieHomework {

	String moviename;
	int budget;
	double rating;

	public MovieHomework(String moviename, int budget, double rating) {

		this.moviename = moviename;
		this.budget = budget;
		this.rating = rating;
	}

	void MovieDetails() {
		System.out.println("The name of the movie is " + moviename);
		System.out.println(moviename + " was made with the budget of " + budget + "Cr");
		System.out.println("The movie " + moviename + " received a rating of " + rating + " from audiences");
	}

}
