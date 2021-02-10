package lista05Ex01;

import java.util.Scanner;
import aplications.entities;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		entities Entities = new entities();
		System.out.println("Enter rectangle width and height: ");
		Entities.widht = sc.nextDouble();
		Entities.height = sc.nextDouble();
		
				
		System.out.println("AREA: "+ Entities.Area());
		System.out.println("PERIMETER: " + Entities.Perimeter());
		System.out.println("DIAGONAL: " + Entities.Diagonal());
		
		sc.close();

	}

}
