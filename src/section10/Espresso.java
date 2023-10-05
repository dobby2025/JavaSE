package section10;

public class Espresso extends Coffee {
	
	public String brand;

	public Espresso(String bean) {
		super(bean);
		this.brand = "스타벅스";
	}
	
	public void brew() {
		System.out.println(super.bean + "산 원두 에스프레소");
	}
	
	@Override	// 어노테이션(annotation) - 클래스, 메서드, 필드 등 추가적인 메타정보 제공
	public void printInfo() {
		super.printInfo();
		System.out.println("brand: " + brand);
	}
	
}




