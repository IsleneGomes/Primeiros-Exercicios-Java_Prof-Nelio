package lista04Ex01;

import java.util.Scanner;

public class ClasseLista04Ex01 {

	public static void main(String[] args) {
		int N,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de referência");
		N = sc.nextInt();

		for (i=0; i < N && N<=1000; i+=2) {
			int j = i +1; // j necessário para lançar o +1 pois se fizxer isso com o i ele entende que é incremento e não valor ímpar
			System.out.println("Valores pares: "+ i ); //imprime números pares
			System.out.println("Valores ímpares: "+ j ); //imprime números ímpares
		}
		sc.close();
	}

}
