package typeCasting;

class Grandmother{
	int x=10;
	void love() {
		System.out.println("Granny love");
	}
}

class Mother extends Grandmother{
      int y =20;
      void  care() {
    	  System.out.println("Mothers caring and Scoldings");
      }
}

class Daughter extends Mother{
	int z=30;
	void  crazy() {
		System.out.println("Crazy Naughty daughter");
	}
}

public class GravityRunner {

	public static void main(String[] args) {
		
		Grandmother g1 = new Mother(); //Upcasting
		System.out.println(g1.x);
		g1.love();
		//subclass properties are hidden
		//System.out.println(g1.y);
		//g1.care();
     
		Mother m1 = (Mother)g1; //Downcasting
		System.out.println(m1.x);
		m1.love();
		System.out.println(m1.y);
		m1.care();
		System.out.println("----------");
		
		
		Mother m2 = new Daughter(); //upcasting
		System.out.println(m2.y);
		m2.care();
		
		Daughter d1 = (Daughter)m2;  //downcasting
		System.out.println(d1.x);
		d1.love();
		System.out.println(d1.y);
		d1.care();
		System.out.println("----------");
		
		Grandmother g2 = new Daughter(); //upcasting
		System.out.println(g2.x);
		g2.love();
		
		Daughter d2 = (Daughter) g2; //downcasting
		System.out.println(d2.x);
		d2.love();
		System.out.println(d2.y);
		d2.care();
		System.out.println(d2.z);
		d2.crazy();
		
	}

}