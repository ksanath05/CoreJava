package constructors;

class Benz{
	
	int x;
	double y;
	
	//Constructor of a class are execute/called --
	          //--at the time of Object creation
	 Benz(){     //Constructor
		System.out.println("Inside Constructor");
		 
	  }	
}

public class Constructors {
	public static void main(String[] args) {
		
        Benz b1 = new Benz();   //Inside Constructor
        
        Benz b2 = new Benz();   //Inside Constructor
	}

}
