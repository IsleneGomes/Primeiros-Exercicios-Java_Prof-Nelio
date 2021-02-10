package lista04Ex06;

import java.util.Scanner;

public class ClasseLista04Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, rest;
		System.out.println("Digite um número");
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			rest = N%i;
			if(rest == 0) {
				System.out.printf("Os divisores de %d é: %d \n", N, i);
			}
		}
		
		sc.close();

	}

}
