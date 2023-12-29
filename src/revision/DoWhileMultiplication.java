package revision;

class DoWhileMultiplication {

	public static void multi(int a) {

		int x = 1;
		do {
			System.out.println(a + " * " + x + " = " + a * x);
			x++;
		} while (x <= 10);
	}

	public static void main(String[] args) {
		multi(5);
	}
}
