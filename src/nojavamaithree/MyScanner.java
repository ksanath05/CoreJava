
package nojavamaithree;

import java.util.Scanner;

public class MyScanner {


	public static void main(String[] args) {
		System.out.println("Yaav numberdu maggi beku ninge, goobe?");
		Scanner sc= new Scanner(System.in);
		  int number = sc.nextInt();
		  
		for(int x=1; x<=10; x++) {
			System.out.println(number+" * " + x + " = " + number*x);
		}
	}

}
