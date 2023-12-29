package methodcall;

public class MethodCallSumAndProduct {
	
	public static void Sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void product(int x, int y) {
		System.out.println(x*y);
		
	}
	public static void main(String[] args) {
		System.out.println("Start");
		Sum(10,10);
		product(10,10);
		System.out.println("end");
	}

}
