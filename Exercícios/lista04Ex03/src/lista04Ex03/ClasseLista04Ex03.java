package lista04Ex03;

import java.util.Scanner;

public class ClasseLista04Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N, media=0, n1=0, n2=0, n3=0, p1, p2,p3;
		
		System.out.println("Digite a quantidade de casos a ser analisados");
		N=sc.nextInt();
		
		System.out.println("------A seguir digite os Pesos------");
		System.out.println("Digite o peso da primeira nota");
		p1=sc.nextDouble();
		System.out.println("Digite o peso da segunda nota");
		p2=sc.nextDouble();
		System.out.println("Digite o peso da terceira nota");
		p3=sc.nextDouble();
		
		System.out.println("------A seguir digite as Notas------");
		for (int i=0; i<N; i++) {
			System.out.println("Digite a primeira nota");
			n1=sc.nextDouble();
			
			System.out.println("Digite a segunda nota");
			n2=sc.nextDouble();
			
			System.out.println("Digite a terceira nota");
			n3=sc.nextDouble();
			
			media = ((n1*p1) + (n2*p2) + (n3*p3))/(p1+p2+p3);
			System.out.printf("Média: %.1f\n", media);
			System.out.println("--------------Fim---------------");
		}
		sc.close();
		

	}

}
