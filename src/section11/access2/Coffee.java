package section11.access2;

public class Coffee extends Drink {
	
	private boolean isDecaf;
	
	public Coffee() {
		name = "빽다방 황금라떼";
		type = "Coffee";
		price = 2600;
		disCountRate = 0.5;
		isDecaf = false;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("isDecaf: " + isDecaf);
	}

	
	public boolean isDecaf() {
		return isDecaf;
	}

	public void setDecaf(boolean isDecaf) {
		this.isDecaf = isDecaf;
	}
	
	

}



