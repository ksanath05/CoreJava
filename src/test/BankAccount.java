package test;

public class BankAccount {

	private double balance = 50000;

	void deposit(double x) {
		System.out.println("The amount " + x + " deposited successfully");
		balance += x;
	}

	void withdraw(double y) {
		if (y > balance) {
			System.out.println("Insufficient balance");
		} else {
			System.out.println("Amount " + y + " withdrawn successfully");
			balance -= y;
		}
	}

	void getBalance() {
		System.out.println("The available balance is " + balance);
	}

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(5000);
		b.getBalance();

		System.out.println("--------------------");

		b.withdraw(8500);
		b.getBalance();

		System.out.println("--------------------");

		b.withdraw(55000);
		b.getBalance();

		System.out.println("--------------------");

		b.withdraw(45000);
		b.getBalance();

		System.out.println("--------------------");
	}
}