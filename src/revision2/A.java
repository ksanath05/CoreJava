package revision2;

 class A {

		    void print() {
		        System.out.println("A");
		    }
		}

		class B extends A {
		    void print() {
		        System.out.println("B");
		    }
		
		    public static void main(String[] args) {
		        A obj = new B();
		        obj.print();
		    }
		}