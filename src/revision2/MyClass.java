package revision2;

 class MyClass implements MyInterface {
	 public void show() {
	        System.out.println("MyClass");
	    }

	public static void main(String[] args) {
		  MyInterface obj = new MyClass();
	        obj.show();
	 

	}

}
