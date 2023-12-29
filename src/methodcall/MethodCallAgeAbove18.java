package methodcall;

public class MethodCallAgeAbove18 {

	public static void age(int a) {
		if(a<=18){
		System.out.println("Age is greater than 18");
	}
		else
		System.out.println("Age is less than 18");
			// TODO Auto-generated method stub

}
	public static void main(String[] args) {
		System.out.println("Start");
		age(15);
		age(20);
		System.out.println("end");
	}
	}


