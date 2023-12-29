package methodcall;

class MethodCallMax3Ternary {

	public static void max3(int a, int b, int c) {
		int max1 = (a > b) ? a : b;
		int max2 = (max1 > c) ? max1 : c;
		System.out.println("The maximum value is " + max2);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		max3(11, 22, 33);
		max3(214, 518, 433);
		max3(2345, 2121, 1167);
		System.out.println("End");

	}

}

