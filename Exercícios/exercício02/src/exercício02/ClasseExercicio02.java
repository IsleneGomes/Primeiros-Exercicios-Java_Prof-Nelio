package exercício02;

public class ClasseExercicio02 {

	public static void main(String[] args) {
		System.out.println("Cálculo da Área do Círculo");
		
		double A1, A2, A3, pi;
		double r1, r2, r3;
		pi = 3.14159;
		r1 = 2.00;
		r2 = 100.64;
		r3 = 150.00;
		A2 = (r2*r2)*pi;
		A3 = (r3*r3)*pi;
		A1 = (r1*r1)*pi;
	
			System.out.printf("O valor da área é: %.4f.\n", A1);
			System.out.printf("O valor da área é: %.4f.\n", A2);
			System.out.printf("O valor da área é: %.4f.\n", A3);

	}

}
