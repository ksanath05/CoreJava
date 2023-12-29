package oops;

class Graph{
	
	double xaxis;
	double yaxis;
	
	void display() {
		System.out.println( "X value is "+xaxis);
		System.out.println( "Y value is "+yaxis);
	}		
}

public class RunnerGraph {

	public static void main(String[] args) {
		Graph g1 = new Graph();
		Graph g2 = new Graph();	
		g1.xaxis= 4.5;
		g2.yaxis = 3.7;
		
		g1.display();
		g2.display();		
	}
}
