package section11.access2;

public class Drink {
	public String name;			// 음료명
	public String type;			// 음료종류
	public int price;			// 가격
	public double disCountRate;	// 할인율
	
	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("type: " + type);
		System.out.println("price: " + price);
		System.out.println("disCountRate: " + disCountRate);
	}
	
	public void printEvent() {
		
		if(disCountRate == 0.333) {
			System.out.println("2+1 할인 행사중 입니다.");
		} else if(disCountRate == 0.5) {
			System.out.println("1+1 할인 행사중 입니다.");
		} else {
			System.out.println("행사 상품이 아닙니다.");
		}
		
	}

}




