package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de quartos a serem alugados: ");
		int n =sc.nextInt();
		
		Rent[] vect = new Rent[10];
		
		for(var i=0; i<n; i++) {
			System.out.println("----------------------");
			System.out.print("Insert the name: ");
			sc.nextLine();
			String name = sc.nextLine();
						
			System.out.print("Insert the Email: ");
			String email = sc.nextLine();
						
			System.out.print("Insert the number of room: ");
			int number = sc.nextInt();
			System.out.println("----------------------");
			vect [number] = new Rent(name, email, number);
			
			System.out.printf("Rent #: %d\nName: %s\nEmail: %s\nRoom: %d", i, name, email, number);
			System.out.println();
		}
		
		System.out.println("++++++++++++++++++++++");
		System.out.println("Busy Rooms:");
		for(var i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
				}			
			}
		sc.close();
		
	}

}
