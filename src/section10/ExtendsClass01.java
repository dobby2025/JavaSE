package section10;
/*
 * 상속(Extends)
 * 	부모클래스(슈퍼클래스, 상위클래스)와 자식클래스(서브클래스, 하위클래스)가 있으며
 * 	자식클래스는 부모클래스를 상속받아 그 부모의 멤버(변수, 메서드) 사용이 가능하다.
 * 
 * 상속방법
 * 	class 서브클래스명 extends 슈퍼클래스
 * 
 * 
 * super 키워드
 * 	부모클래스의 멤버를 참조하는 키워드
 * 
 * super() 
 * 	부모클래스의 생성자를 의미한다.
 * 
 */

public class ExtendsClass01 {
	public static void main(String[] args) {
		
		Coffee coffee = new Coffee("콜롬비아");
		coffee.printInfo();

		System.out.println("=======================");
		
		Espresso espresso = new Espresso("브라질");
		espresso.printInfo();
		espresso.brew();
	
		
		
	}

}




