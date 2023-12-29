package methodcall;

public class MethodCallEvenNumbers {

	public static void even() {
		
		for (int x=2; x<=10; x+=2) {
			System.out.println(x);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		even();
		System.out.println("end");

	}

}
