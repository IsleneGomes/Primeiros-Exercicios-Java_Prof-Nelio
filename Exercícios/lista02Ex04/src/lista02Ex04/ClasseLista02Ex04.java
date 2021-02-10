package lista02Ex04;

import java.util.Scanner;

public class ClasseLista02Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hi, hf, dur;
		
		System.out.println("Digite o horário de início do jogo");
		hi = sc.nextInt();
		
		System.out.println("Digite o horário final do jogo");
		hf = sc.nextInt();
		
		
		if (hi < 12 && hf >12) {
			dur = hf - hi;
			System.out.printf("O JOGO DUROU %d HORA(S)", dur);
			
		} 
		else if (hf > 12) {
			hf = hf +12;
			dur = hf - hi;
			System.out.printf("O JOGO DUROU %d HORA(S)", dur);
			
		}
		else if (hf <12) {
			hf = hf + 24;
			dur = hf - hi;
			System.out.printf("O JOGO DUROU %d HORA(S)", dur);
		}
		
			
		
					
		sc.close();

	}

}
