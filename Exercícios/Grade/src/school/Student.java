package school;
import java.util.Scanner;

import school.entities;
public class Student {

	public static void main(String[] args) {
		
		entities Entities = new entities();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("INSERT THE NAME THE STUDENT: ");
		Entities.name = sc.nextLine();
		System.out.println("Inserte the Grade 1: ");
		Entities.grade1=sc.nextDouble();
		System.out.println("Inserte the Grade 2: ");
		Entities.grade2=sc.nextDouble();
		System.out.println("Inserte the Grade 3: ");
		Entities.grade3=sc.nextDouble();
		
		
		if (Entities.media()>=60) {
			System.out.println(Entities.name);
			System.out.println("FINAL GRADE = "+ Entities.media());
			System.out.println("PASS");
						
		}else {
			double dif = 60 - Entities.media();
			System.out.println(Entities.name);
			System.out.println("FINAL GRADE = "+ Entities.media());
			System.out.println("FAILED");
			System.out.println("MISSING "+ dif + " POINTS");
			
		}
		
		
		
		
		sc.close();

	}

}
