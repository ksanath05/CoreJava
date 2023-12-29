package revision;

class TableOfANumber {
	public static void table(int a) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		table(2);
		System.out.println("End");

	}

}
