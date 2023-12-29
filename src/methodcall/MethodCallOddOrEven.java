package methodcall;

class MethodCallOddOrEven {

	public static void check(int a) {
		if (a % 2 != 0) {
			System.out.println("The given number is Odd");
		} else
			System.out.println("The given number is Even");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		check(4444);
		check(333);
		check(22);
		check(1);
		System.out.println("End");

	}

}
