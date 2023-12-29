package methodcall;

public class MethodcallFactor {
	
	public static void fact(int a) {
		
		int fact=1;
		for(int i=a; i>=1; i--) {
		
			fact = fact * i;
	}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		int a=5;
		System.out.println(" Fatorial of " + a + " is ");
		fact(a);
	}

}
