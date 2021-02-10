package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Cambio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many dollars will be bought?: ");
		double amount = sc.nextDouble();
		
		System.out.println("Price of dollar today: ");
		double dollarPrice = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		
		System.out.printf("Amount to be paid in reais: %.2f\n", result);
		
				
		sc.close();

	}

}
