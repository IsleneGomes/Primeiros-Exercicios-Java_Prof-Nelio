package lista02Ex01;

import java.util.Scanner;

public class ClasseLista02Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número:");
		n = sc.nextInt();
		
		if (n< 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
	}

}
