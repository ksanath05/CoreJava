package revision;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		int m=1; int n=2; int o =3;
		
		if(m>n) {
			if(m>o) {
				System.out.println("The largest of the three number is " + m);
			}
		}
		else if (n>o) {
			System.out.println("The largest of the three number is " + n);
		}
		else {
			System.out.println("The largest of the three number is " + o);
		}
	}

}