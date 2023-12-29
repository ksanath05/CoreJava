package corejava;

public class homework {
    public static void main(String[] args) {
		int x= -1;
		int y = x-- - x-- - --x + ++x - x++ + --x;
		
		System.out.println("The value of X is" + x);
		System.out.println("The value of Y is" + y);
	}
}
