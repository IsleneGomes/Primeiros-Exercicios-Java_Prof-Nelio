package lista02Ex08;

import java.util.Locale;
import java.util.Scanner;

public class ClasseLista02Ex008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double salario, base;
		
		System.out.println("Digite o salário: ");
		salario = sc.nextDouble();
		
		if (salario >= 0 && salario <= 2000) {
			System.out.println("Isento");
		}
		else if (salario <= 3000) {
			base = (salario - 2000) * 0.08;
			System.out.println("R$: "+ base);
			
			}
		else if (salario <= 4500) {
			base = (salario - 3000)*0.18 + 1000.00*0.08;	
			System.out.println("R$: "+ base);
		}
		else {
			base = (salario - 4500)*0.28 + 1500.00*0.18 + 1000.00*0.08;	
			System.out.println("R$: "+ base);
		}
		
sc.close();
	}

}
