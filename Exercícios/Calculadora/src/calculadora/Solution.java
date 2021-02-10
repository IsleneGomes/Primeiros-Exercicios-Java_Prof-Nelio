package calculadora;

import java.util.Scanner;


public class Solution {

	
		public static int calculadoraAdicaoSubtracao(int numero, int outroNumero, String operacao) {
		    // Write your code here
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("Digite um número: ");
		        numero = sc.nextInt();
		        System.out.println("Digite um o outro número: ");
		        outroNumero = sc.nextInt();
		        System.out.println("Digite a operação (+ = soma, - =subtração): ");
		        operacao = sc.nextLine();
		        
		        if (operacao == "+"){
		         int soma = numero + outroNumero;
		            System.out.printf("A soma é:%d ", soma);
		        }
		        else if (operacao == "-"){
		            int diferenca = numero - outroNumero;
		            System.out.printf("A diferença é:%d ", diferenca);
		            }
		        
		        else {
		        System.out.println("Operação Inválida");
		        sc.close();
		        }
				return outroNumero;   
		    }

	}


