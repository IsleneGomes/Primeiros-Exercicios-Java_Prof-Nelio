package lista04Ex07;

import java.util.Scanner;

public class ClasseLista04Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, i, q, c;
		
		System.out.println("Digite o número");
		N = sc.nextInt();
		
		for(i=1; i<=N; i++) {
			q = i*i;
			c=i*i*i;
			System.out.printf("%d %d %d\n",i, q,c);
		}
		
		
		
		sc.close();

	}

}
