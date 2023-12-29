package nojavamaithree;

 class MethodCall {
	 
	 public static void table(int a) {
		
		 for (int i=1; i<=20; i++)
			 System.out.println(a + " * " + i + " = " + a*i);
	}

	public static void main(String[] args) {
		System.out.println("Start the table I say");
		table(12);
System.out.println("End the table I say");

System.out.println("Once more");
table(100);
System.out.println("Saaku saaku show madidu");
	}

}
