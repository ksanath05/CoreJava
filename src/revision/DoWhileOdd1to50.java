package revision;

 class DoWhileOdd1to50 {
	 
	 public static void odd(int x) {
		 do {
			 System.out.println(x);
			 x+=2;
		 }
		while(x<=50);
	}

	public static void main(String[] args) {
		odd(1);

	}

}
