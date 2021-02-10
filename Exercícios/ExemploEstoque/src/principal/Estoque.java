package principal;

import java.util.Scanner;

import entities.Produtos;

public class Estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	Produtos produto = new Produtos();
		System.out.println("Enter the name of the product:");
		produto.Name = sc.nextLine();
		System.out.println("Enter the price of the product:");
		produto.price = sc.nextDouble();
		System.out.println("Enter the quantity of the product:");
		produto.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + produto);
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		System.out.println();
		System.out.println("Update data: " + produto);
		
		
		System.out.println("Enter the number of products to be removed from stock:");
		int remove = sc.nextInt();
		produto.removeProducts(remove);
		System.out.println();
		System.out.println("Update data: " + produto);
		
		sc.close();

	}

}
