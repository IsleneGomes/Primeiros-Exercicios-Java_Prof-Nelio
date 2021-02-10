package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Account {

	public static void main(String[] args) {
		// Importar o Locale e Scanner
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		// Importar a Classe Client
		Client client;

		// Entrar com número da conta e nome do titular
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		// Fazer a pergunta se quer ou não fazer depósito inicial
		System.out.println("Is there na initial deposit (y/n)?: ");
		char DecisionDeposit = sc.next().charAt(0);

		// Aplicar a condição para o deposito inicial
		if (DecisionDeposit == 'y') {
			System.out.println("Enter a deposit value: ");
			double inicialDeposit = sc.nextDouble();
			// dar entrada para o construtor com 3 parâmetros caso sim
			client = new Client(number, holder, inicialDeposit);
		} else {
			// dar entrada para o construtor com 2 parâmetros caso não
			client = new Client(number, holder);
		}
		// Imprimir a situação da conta

		System.out.println();
		System.out.println("Account data:");
		System.out.println(client);

		// Entrar com o valor do depósito
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		// fazer a ligação entre atributo deposit da classe Client e o depositValue
		client.deposit(depositValue);
		// Imprimir a situação da conta
		System.out.println("Update account data:");
		System.out.println(client);

		System.out.println();
		// Entrar com o valor da retirada
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		// fazer a ligação entre atributo withdraw da classe Client e o withdrawValue
		client.withdraw(withdrawValue);
		// Imprimir a situação da conta
		System.out.println("Update account data:");
		System.out.println(client);

		sc.close();
	}

}
