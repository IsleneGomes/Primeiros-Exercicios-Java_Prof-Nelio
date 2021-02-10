package temperatura;

import java.util.Scanner;

public class ClasseTemperatura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double C, F;
		
				
		char resp = 'S';
		do {
			System.out.print("Digite e tempertaura em Celsius: ");
			C = sc.nextDouble();
			F=((9*C)/5)+32;
			System.out.printf("A temperatura em Fahrenheit é: %.1f\n", F);
			System.out.print("Deseja continuar (s/n)?: ");
			resp = sc.next().charAt(0);
			System.out.println("-------------------------------------");
		} while (resp=='s' || resp=='S');
				
		sc.close();

	}

}
