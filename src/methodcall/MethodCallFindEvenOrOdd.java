package methodcall;

public class MethodCallFindEvenOrOdd {
	
	public static void check(int a) {
		if(a%2==0) {
			System.out.println("The given number is Even");
		}
		else
			System.out.println("The given number is Odd");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		check(88);
		check(113);
		System.out.println("end");

	}

}
