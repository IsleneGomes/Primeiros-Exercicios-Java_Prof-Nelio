package exercicio05;
import java.util.*;
public class ClassExercicio05 {

	public static void main(String[] args) {
		Scanner entr = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int cod1, cod2, qtd1, qtd2;
		float valor1, valor2, valorp1, valorp2, total;
		
		System.out.println("Digite o código da peça 1:");
		cod1 = entr.nextInt();
		System.out.println("Digite a quantidade de peças 1:");
		qtd1 = entr.nextInt();
		System.out.println("Digite o valor da peça 1:");
		valorp1 = entr.nextFloat();
		valor1 = qtd1*valorp1;
		System.out.println("Digite o código da peça 2:");
		cod2 = entr.nextInt();
		System.out.println("Digite a quantidade de peças 2:");
		qtd2 = entr.nextInt();
		System.out.println("Digite o valor da peça 2:");
		valorp2 = entr.nextFloat();
		valor2 = qtd2*valorp2;
		
		total = valor1 + valor2;
		System.out.printf("O valor a pagar é: %.2f.", total);

	}

}
