package whileloop;

public class WhileFactorOf3 {

	public static void main(String[] args) {
		int n = 3;
		int copy = n;
		int fact = 1;
		while (n >= 1) {

			fact = fact * n;
			n--;
		}
		System.out.println(" The factorial of " + copy + " is " + fact);

	}

}
