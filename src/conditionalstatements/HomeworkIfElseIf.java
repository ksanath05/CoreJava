package conditionalstatements;

public class HomeworkIfElseIf {

	public static void main(String[] args) {
		
		System.out.println("Homework Started");
		
		int a=1234;
		int b=832;
		int c=285;

		
		
	if (a>b && a>c)
		{
			System.out.println("The highest number among the options is " + a);
		}
		
		else if(b>a && b>c)
		{
			System.out.println("The highest number among the options is " + b);
		}

		else 
		{
			System.out.println("The highest number among the options is " + c);

		}

			System.out.println("Homework ended");



	}

}

