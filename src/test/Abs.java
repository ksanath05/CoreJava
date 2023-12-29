package test;

abstract class abspack {
	void sixpack() {
		System.out.println("I have got sixpack abs");
	}

	abstract void familypack();
}

class Gym extends abspack {

	@Override
	void familypack() {
		System.out.println("I have got family pack");

	}

}

public class Abs {

	public static void main(String[] args) {

		Gym g1 = new Gym();

		g1.sixpack();

		System.out.println("----------------------");

		g1.familypack();

	}

}
