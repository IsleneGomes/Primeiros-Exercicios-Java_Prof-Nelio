package aplications;

public class entities {

	public double height;
	public double widht;
	
	
	public double Area() {
		double Area = height*widht;
		return Area;
	}
	public double Perimeter() {
		double Perimeter = 2*height + 2*widht;
		return Perimeter;
	}
	
	public double Diagonal() {
		double Diagonal = Math.sqrt(height*height + widht*widht);
		return Diagonal;
	}
	
	

}
