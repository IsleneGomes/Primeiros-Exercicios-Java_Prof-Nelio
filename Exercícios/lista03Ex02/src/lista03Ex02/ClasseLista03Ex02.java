package lista03Ex02;

import java.util.Scanner;

public class ClasseLista03Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite o valor de x");
		x = sc.nextInt();
		
		System.out.println("Digite o valor de y");
		y = sc.nextInt();
		
		while ((x != 0) && (y!=0)) {
			if (x >0 && y>0) {
				System.out.println("Primeiro");
				return;
			}
			else if (x >0 && y<0) {
				System.out.println("Quarto");
				return;
			}
			else if (x <0 && y>0) {
				System.out.println("Segundo");
				return;
			}
			else if (x <0 && y<0) {
				System.out.println("Terceiro");
				return;
			}
		
		}
	
		sc.close();
	}

}
