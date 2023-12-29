package constructors;

class Calc {

	int x;
	double y;
	long a;

	Calc(int arg1) {
		x = arg1;
		System.out.println("The sum of the number is " + x);
	}

	Calc(int arg1, double arg2) {
		x = arg1;
		y = arg2;
		System.out.println("The sum of the numbers is " + (x + y));
	}

	Calc(int arg1, double arg2, long arg3) {
		x = arg1;
		y = arg2;
		a = arg3;
		System.out.println("The sum of the numbers is " + (x + y + a));
	}
}

public class Calculator {

	public static void main(String[] args) {

		Calc c1 = new Calc(50);

		Calc c2 = new Calc(40, 4.50);

		Calc c3 = new Calc(80, 22.49, 9842);

	}

}
