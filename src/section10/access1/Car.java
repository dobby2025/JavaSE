package section10.access1;

public class Car {
	// Car 객체 속성
	public String model;
	protected String color;
	String year;
	private String brand;
	
	public void printInfo() {
		System.out.println("model: " + model);
		System.out.println("color: " + color);
		System.out.println("year: " + year);
		System.out.println("brand: " + brand);
	}
}


