package aplication;

public class entities {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	public double percentage;
	
	
	public double NetSalary() {
		double NetSalary = GrossSalary - Tax;
		return NetSalary;
	}
	
	public double IncreaseSalary() {
		double IncreaseSalary = (GrossSalary - Tax)+(GrossSalary)*percentage/100;
		return IncreaseSalary;
	}
	public String toString() {
		return Name + String.format(" ; R$ %.2f.", IncreaseSalary());
		
	}
}
