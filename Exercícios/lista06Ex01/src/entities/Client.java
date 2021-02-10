package entities;

public class Client {

	// digitar os atributos privados
	private int number;
	private String holder;
	private double deposit;
	private double balance;

	// Criar o construtor com 2 atributos
	public Client(int number, String holder) {
		this.number = number;
		this.holder = holder;

	}

	// Criar o construtor com 3 atributos
	public Client(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);

	}

	// Criar o get e set para atributos exceto o set de numer e balance
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account: " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}

}
