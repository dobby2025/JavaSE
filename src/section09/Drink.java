package section09;

public class Drink {
	public String name;
	public int price;
	public String type;
	
	// static 초기화 블럭
	static {
		System.out.println("Drink static 초기화 블럭!");
	}
	
	// 초기화 블럭
	{
		System.out.println("Drink 초기화 블럭!");
		this.name = "카페라떼";
		this.price = 6000;
		this.type = "Coffee";
	}
	
	public Drink() {
		System.out.println("Drink 생성자");
		this.name = "아메리카노";
		this.price = 4000;
		this.type = "Coffee";
	}

}


