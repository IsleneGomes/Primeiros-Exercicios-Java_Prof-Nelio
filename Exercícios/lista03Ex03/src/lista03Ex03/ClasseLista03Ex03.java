package lista03Ex03;

import java.util.Scanner;

public class ClasseLista03Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int comb = 0, gas = 0, alc = 0, die = 0;
		
		System.out.println("Digite 0, em seguida sua Preferência 1 - Álcool, 2 - Gasolina, 3 - Diesel, 4 - Fim");
		comb = sc.nextInt();
		
		while (comb < 4) {
			comb = sc.nextInt();	
				if (comb == 1) {
					alc = alc + 1;
				}
				else if (comb == 2) {
					gas += 1;
				}
				else if (comb == 3) {
					die += 1;
				}
				else if (comb == 4){
					System.out.println("MUITO OBRIGADO");
					System.out.println("Alcool" + alc);
					System.out.println("Gasolina" + gas);
					System.out.println("Diesel" + die);
				}
				else {
					System.out.println("Opção Inválida");
				
				}
									
		}
		
		
		
	sc.close();	
	}

}
