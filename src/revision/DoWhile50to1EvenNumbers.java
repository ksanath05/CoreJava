package revision;

class DoWhile50to1EvenNumbers {

	public static void multi(int a) {
		do {
			System.out.println(a);
			a -= 2;
		} while (a >= 1);

	}

	public static void main(String[] args) {
		multi(50);
	}

}
