package lista05Ex02;

import java.util.Scanner;
import aplication.entities;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		entities Entities = new entities();
		
		System.out.println("Name: ");
		Entities.Name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		Entities.GrossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		Entities.Tax = sc.nextDouble();
		
		System.out.println("Employee: " + Entities.toString());
		
		System.out.println("Which percentage to increase salary?");
		Entities.percentage = sc.nextDouble();
		
		System.out.println("Update data: " + Entities.toString());
		
		
		
		
		sc.close();

	}

}
