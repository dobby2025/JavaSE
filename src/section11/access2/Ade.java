package section11.access2;

public class Ade extends Drink {
	
	private boolean isZero;
	
	public Ade() {
		name = "코카콜라";
		type = "탄산음료";
		price = 1900;
		disCountRate = 0.333;
		isZero = true;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("isZero: " + isZero);
	}

	public boolean isZero() {
		return isZero;
	}

	public void setZero(boolean isZero) {
		this.isZero = isZero;
	}
}



