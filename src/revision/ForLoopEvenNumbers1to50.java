package revision;

 class ForLoopEvenNumbers1to50 {
	 
	 public static void even(int a) {
		 for(int i=a; i<=50; i++) {
			 if(i%2==0) {
			 System.out.println(i);
			 }
		 }
	}

	public static void main(String[] args) {
		even(15);

	}

}
