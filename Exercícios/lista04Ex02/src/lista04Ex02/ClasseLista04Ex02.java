package lista04Ex02;

import java.util.Scanner;

public class ClasseLista04Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X, N, somaIn=0, somaOut=0;
		System.out.println("Digite a quantidade de entradas a serem analisadas");
		N = sc.nextInt();
		
		for(int i =0; i< N; i++) {
		System.out.println("Digite o(s) valor(es) desejado(s)");
		X = sc.nextInt();
		
			if (X>=10 && X<=20) {
				somaIn = somaIn +1;
			//	System.out.printf("%d in\n", X);
			}
			else {
			//	System.out.printf("%d out\n", X);
				somaOut = somaOut +1;
			}
			System.out.printf("In: %d\n",somaIn);
			System.out.printf("Out: %d\n",somaOut);
		}
		sc.close();

	}

}
