package exercicio06;
import java.util.*;
public class ClasseExercicio06 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		 float A, B, C;
		 double AreaTr, AreaCir, AreaTra, AreaQua, AreaRet, pi;
		 pi = 3.4159;
		 
		 System.out.println("Digite o valor de A");
		 A = ent.nextFloat();
		 System.out.println("Digite o valor de B");
		 B = ent.nextFloat();
		 System.out.println("Digite o valor de C");
		 C = ent.nextFloat();
		 
		 AreaTr = A*C/2;
		 AreaCir = C*C*pi;
		 AreaTra = (A+B)*C/2;
		 AreaQua = B*B;
		 AreaRet = A*B;
		 
		 System.out.printf("TRIANGULO: %.3f.\n", AreaTr);
		 System.out.printf("CIRCULO: %.3f.\n", AreaCir);
		 System.out.printf("TRAPEZIO: %.3f.\n", AreaTra);
		 System.out.printf("QUADRADO:%.3f.\n", AreaQua);
		 System.out.printf("RETANGULO: %.3f.\n", AreaRet);
	}

}
