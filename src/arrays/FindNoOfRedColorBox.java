package arrays;

public class FindNoOfRedColorBox {

	public static void main(String[] args) {
		int [] num = {10, 20, 30, 40, 50, 80};
		
		int sum=0;
		
		for(int i=0; i<=num.length-1; i++) {
			sum+=num[i];
			
		}
		
		System.out.println("Sum of all elements is " +sum);

	}

}