package methodcall;

public class MethodAdd {
	public static void add (int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		add (5, 5);
		System.out.println("end");

	}

}
