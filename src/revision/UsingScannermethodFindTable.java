package revision;

import java.util.Scanner;

public class UsingScannermethodFindTable {

	public static void main(String[] args) {
		System.out.println("Enter the number you want to find Table");
		Scanner sc= new Scanner(System.in);
	  int number = sc.nextInt();
	  
	  for(int i=1; i<=10; i++) {
		  System.out.println(number+" * "+i+" = "+  number*i);
	  }

	}

}