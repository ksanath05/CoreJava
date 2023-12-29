package arrays;

public class ToFindNoOfOccurences {

	public static void main(String[] args) {
int[]  numbers = {10,30,40,20,10,40,60,20,60,80,50,20,10,20,70};
		
		int count =0;
		int element = 45;   //for any element our code will work
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]== element) {
				count++;
			}
		}
		System.out.println("The number of times element is Occuring "+count);
		//or
		System.out.println(element+ " is occured "+ count +"  number of times");
		
	}


	}

