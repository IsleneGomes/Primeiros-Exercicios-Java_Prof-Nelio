package lista02Ex06;

import java.util.Locale;
import java.util.Scanner;

public class ClasseLista02Ex06 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	float n;
	
	System.out.println("Digite o número: ");
	n = sc.nextFloat();
	
	if (n < 0) {
		System.out.println("Fora do Intervalo");
	}
	else if (n > 0) {
		if ( n>75 && n<= 100) {
			System.out.println("Intervalo (75, 100]");
		}
		else if ( n>50 && n<= 75) {
			System.out.println("Intervalo (50, 75]");
		}
		else if ( n>25 && n<= 50) {
			System.out.println("Intervalo (25, 50]");
		}
		else if ( n>=0 && n<= 25) {
			System.out.println("Intervalo [0, 25]");
		}
	}
	
	
		
	}	
}