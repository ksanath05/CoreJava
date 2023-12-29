package nojavamaithree;

 class BiggerOf3Numbers {
	 
	 public static int biggest(int a, int b, int c) {
		int max= (a>b)?((a>c)?a:c):((b>c)?b:c);
				return max;
	}

	public static void main(String[] args) {
		System.out.println("Start");
		int myAns = biggest(12, 34, 56);
		System.out.println("biggest of 3 numbers is " +myAns);
		System.out.println("End");
	}

}
