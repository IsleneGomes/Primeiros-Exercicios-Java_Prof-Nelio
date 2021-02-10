package Capitulo3;

import java.util.Scanner;

import entities.Triangulo;


public class Exemplo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Triangulo x, y;
	x = new Triangulo();
	y = new Triangulo();
	
	System.out.println("Digite os lados do triângulo X: ");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	

	System.out.println("Digite os lados do triângulo Y: ");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	
	double areaX = x.area();
	double areaY = y.area();
	System.out.println("Área do Triângulo X: " + areaX);
	System.out.println("Área do Triângulo Y: " + areaY);
	
	if (areaX > areaY) {
		System.out.println("X é o Triângulo maior");
	}
	
	else  {
		System.out.println("Y é o Triângulo maior");
	}
	sc.close();
	}

}
