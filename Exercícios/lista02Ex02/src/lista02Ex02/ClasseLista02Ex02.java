package lista02Ex02;

import java.util.Scanner;

public class ClasseLista02Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		if (n%2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
	}

}
