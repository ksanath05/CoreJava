package test;

abstract class Vehicle {

	abstract void startEngine();

}

class Car extends Vehicle {

	@Override
	void startEngine() {
		System.out.println("Inside car class");
		System.out.println("Car engine started");

	}

}

class Bicycle extends Vehicle {

	@Override
	void startEngine() {
		System.out.println("Inside bicycle class");
		System.out.println("Pedal to start the bicycle");

	}

}

public class CarRental {

	public static void main(String[] args) {

		Bicycle b = new Bicycle();
		Car c = new Car();

		c.startEngine();

		System.out.println("-------------------");

		b.startEngine();

	}

}
