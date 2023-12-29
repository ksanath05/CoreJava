package methodcall;

class MethodCallPositiveNegativeIfElse {

	public static void check(int a) {
		if (a >= 0) {
			System.out.println("The given number is Positive");
		} else
			System.out.println("The number is Negative");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		check(10);
		check(-5);
		check(639);
		check(-5632);
		System.out.println("End");

	}

}
