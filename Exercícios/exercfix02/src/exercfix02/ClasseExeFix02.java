package exercfix02;

import java.util.Scanner;

public class ClasseExeFix02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min,  dif;
		double valor;
		
		System.out.println("Digite os minutos utilizados");
		min = sc.nextInt();
		
		if (min > 100) {
			dif = min -100;
			valor = 50 + dif*2.00;
			System.out.printf("O valor a ser pago é: R$ %.2f.", valor);
		}
		else
			System.out.println("O valor a ser pago é: R$ 50,00");
		
sc.close();
	}

}
