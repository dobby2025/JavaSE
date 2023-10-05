package section10;

public class Coffee {
	public String bean;		// 원두
	
	public Coffee(String bean) {
		this.bean = bean;
	}
	
	public void printInfo() {
		System.out.println("bean: " + bean);
	}
}
