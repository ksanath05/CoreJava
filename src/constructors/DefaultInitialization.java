package constructors;


	
	//default initialization
	class Demo{
		int x;
		double y;
		String str;
		boolean b;
	}


	public class DefaultInitialization {

		public static void main(String[] args) {
			Demo d = new Demo();
			System.out.println(d.x  + " "+ d.y+ "  "+ d.str+ "  "+ d.b); 
			                  //0           0.0        null       false
		}
		
		
	}

