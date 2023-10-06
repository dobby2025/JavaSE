package section10.access2;

import section10.access1.Car;

public class SportsCar extends Car {
	private boolean isOpen;
	
	@Override	// 부모 메서드 재정의
	public void printInfo() {
		System.out.println("model: " + model);
		System.out.println("color: " + color);
		// System.out.println("year: " + year);
		// System.out.println("brand: " + brand);
		System.out.println("isOpen: " + isOpen);
	}


}
