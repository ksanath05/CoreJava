package revision2;

	
	class Base {
	    public void show() {
	        System.out.println("Base class");
	    }
	}

	class Derived extends Base {
	    public void show() {
	        System.out.println("Derived class");
	    }
	}
	
	public class Main{
		
	    public static void main(String[] args) {
	        Base base = new Derived();
	        base.show();
	    }
	}


