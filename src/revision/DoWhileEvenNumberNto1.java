package revision;

 class DoWhileEvenNumberNto1 {
	 
	 public static void check(int a) {
		 do {
			 System.out.println(a);
			a-=2;
		 }
		while(a>=1);
	}

	public static void main(String[] args) {
		check(40);

	}

}
