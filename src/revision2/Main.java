package revision2;

public class Main {
	
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

	    public static void main(String[] args) {
	        Base base = new Derived();
	        base.show();
	    }
	}

}
