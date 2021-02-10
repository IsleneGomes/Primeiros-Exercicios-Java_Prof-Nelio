package lista03Ex01;

import java.util.Scanner;

public class ClasseLista03Ex01 {

	public static void main(String[] args) {
		
		int senha = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha");
		senha = sc.nextInt();
		
		while (senha!=2002) {
			System.out.println("Senha Incorreta");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
sc.close();
	}
	
}
