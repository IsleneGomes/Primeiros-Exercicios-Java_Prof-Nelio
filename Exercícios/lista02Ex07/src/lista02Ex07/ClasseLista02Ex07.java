package lista02Ex07;

import java.util.Scanner;

public class ClasseLista02Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float x,y;
		
		System.out.println("Digite o valor de x");
		x = sc.nextFloat();
		
		System.out.println("Digite o valor de y");
		y = sc.nextFloat();
		
		if (x== 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x== 0) {
			System.out.println("Eixo Y");
		}
		else if (y== 0) {
			System.out.println("Eixo X");
		}
		else if (x!= 0 && y!= 0) {
			if (x>0 && y >0) {
				System.out.println("Q1");
			}
			else if (x>0 && y <0) {
				System.out.println("Q4");
			}
			else if (x<0 && y >0) {
				System.out.println("Q2");
			}
			else if (x<0 && y <0) {
				System.out.println("Q3");
			}
		}
		else {
			System.out.println("Error");
		}
		
		sc.close();
	}

}
