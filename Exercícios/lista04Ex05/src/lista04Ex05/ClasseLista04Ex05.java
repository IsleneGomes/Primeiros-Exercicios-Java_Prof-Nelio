package lista04Ex05;

import java.util.Scanner;

public class ClasseLista04Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X, fat = 1;
		
		
		System.out.println("Digite o valor de X");
		X = sc.nextInt();
		
		if (X>=0) {
		for (int i=1; i<=X; i++) {
			fat *=i; 
			
		}
		
		
		if (X==0) {
			fat = 1;
			
		}
		System.out.println("Resultado: " +fat);
		System.out.println("----------------------------------");
		}
		else {
			System.out.println("Digite valores positivos");
		}
		sc.close();
	}

}
