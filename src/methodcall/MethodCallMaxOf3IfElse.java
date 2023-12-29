package methodcall;

class MethodCallMaxOf3IfElse {

	public static void Max(int a, int b, int c) {
		if (a > b && b > c) {
			System.out.println("The max in the given number is " + a);
		} else if (a < c && b < c) {
			System.out.println("The max in the given number is " + c);
		}
		else
			System.out.println("The max in the given number is " + b);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		Max(3333, 2222, 111);
		Max(853, 924, 743);
		Max(22, 58, 96);
		System.out.println("End");
	}
}
