package lista04Ex04;

import java.util.Scanner;

public class ClasseLista04Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double N, n1, n2, div;
		
		System.out.println("Digite a quantidade de pares a serem analisados");
		N = sc.nextDouble();
		System.out.println("-----------------------------------------------");
		
		for(int i=0; i<N; i++) {
			System.out.println("Digite o numerador");
			n1 = sc.nextDouble();
			
			System.out.println("Digite o denominador");
			n2 = sc.nextDouble();
			
			div = (n1/n2);
			if (n2!=0) {
				System.out.printf("O resultado da divisão de %.1f por %.1f é %.1f\n", n1, n2, div);
				System.out.println("-----------------------------------------------");
			}
			else if (n2==0) {
				System.out.println("Divisão Impossível");
				System.out.println("-----------------------------------------------");
			}
		}
		sc.close();

	}

}
