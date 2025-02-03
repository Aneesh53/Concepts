package encapsulation;

public class CarsandBrands {
	int year;
	String brand;
	
	public CarsandBrands() {
		this.year=2006;
		this.brand="Kia";
	}
	public CarsandBrands(int year,String brand) {
		this.year=year;
		this.brand=brand;
	}
	public void display() {
		System.out.println("The brand name of the car is: " +brand+ " The year of the release is: "+year);
	}
	public static void main(String[] args) {
		CarsandBrands car1= new CarsandBrands();
		car1.display();
		CarsandBrands car2=new CarsandBrands(2024,"Defender");
		car2.display();
	}

}
