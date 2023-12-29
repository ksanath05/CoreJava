package methodcall;

public class MethodCallPositiveOrNegetive {
	
	public static void check(int a) {
		
		if (a>=0) {
			System.out.println("The number is Positive");
		
		}
		else
			System.out.println("The number is Negetive");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		check(-10);
		check(10);
		System.out.println("end");

	}

}
