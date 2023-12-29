package methodcall;

public class MethodCallEvenOrOdd {
	
	public static void check(int a) {
		if (a%2==0) {
			System.out.println("The given number is even");
		}
		else
			System.out.println("The given number is Odd");
	}

	public static void main(String[] args) {
		System.out.println("start");
		check(5);
		check(4);
		System.out.println("end");
			
	}

}
