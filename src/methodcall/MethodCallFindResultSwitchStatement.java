package methodcall;

class MethodCallFindResultSwitchStatement {

	public static void check(char grade) {
		switch (grade) {
		case 'A':
			System.out.println("You are the best");
			break;
		case 'B':
			System.out.println("You are very good");
			break;
		case 'C':
			System.out.println("Nice but try harder");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		check('A');
		check('B');
		check('C');
		check('H');
		System.out.println("End");

	}
}
