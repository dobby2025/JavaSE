package section07;

public class Car {
	
	static int wheel = 4;
	
	// 객체 속성정의
	String color = "RED";
	String model = "테슬라 Y";
	
	public static void main(String[] args) {
		System.out.println("Car 메인메서드 입니다.");
	}
	
	public static void drive() {
		System.out.println("운전을 해요!");
	}
	
	public void autopilot() {
		System.out.println("자율주행을 해요!");
	}
	


}





