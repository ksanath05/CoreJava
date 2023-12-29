package revision;

 class TryingWhileMultiplication {
	 
	public static void check(int x) {
		
		int a=1;
		
		while(a<=10) {
			System.out.println(x+" * "+ a + " = "+ x*a);
			a++;
		}

	}

	public static void main(String[] args) {
		check(9);

	}

}
