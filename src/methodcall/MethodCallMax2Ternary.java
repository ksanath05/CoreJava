package methodcall;

class MethodCallMax2Ternary {

	public static void max(int a, int b) {
		int max = (a > b) ? a : b;
		System.out.println("The maximum value is " + max);
		
	}

	public static void main(String[] args) {
		System.out.println("Start");
		max(10, 20);
		max(333, 222);
		System.out.println("End");

	}

}
