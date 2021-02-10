package entities;

public class Produtos {
	public  String Name;
	public  double price;
	public  int quantity;
	
	
	public double totalValueInStock() {
		
		return quantity*price;
		
	}

	public void addProducts(int quantity) {
		//int soma = quantity;
		this.quantity += quantity;
		//int AddProducts = soma + quantity;
	}
	
	public void removeProducts(int quantity) {
		//int remove = quantity;
		this.quantity -= quantity;
	//	int RemoveProducts = quantity - remove;
	}

public String toString() {
	return Name
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());		
	}
}