package whileloop;

public class Sumofevenintegers {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=20) {
			if(i%2==0) {
				sum= sum+i;
			}
			i++;
		}
		System.out.println("sum of all even numbers between 1 to 20 is " + sum);
	}

}
