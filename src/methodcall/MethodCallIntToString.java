package methodcall;

public class MethodCallIntToString {
	
	public static void age(int a) {
		if(a>=18) {
			System.out.println("You are eligible to vote");
		}
		else
			System.out.println("You are not eligible to vote");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		age(22);
		age(15);
		System.out.println("end");
	}

}
