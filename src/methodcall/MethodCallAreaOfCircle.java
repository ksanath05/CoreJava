package methodcall;

public class MethodCallAreaOfCircle {
	
	public static void Area(int a) {
		double p=3.141592653;
		System.out.println("Area of circle is " + a*a*p +"m2");
		
	}

	public static void main(String[] args) {
		System.out.println("start");
		Area(5);
		System.out.println("end");
	}

}
