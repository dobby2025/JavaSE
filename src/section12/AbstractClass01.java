package section12;

import section12.access1.Game;
import section12.access1.SuperMario;

/*
 * 추상클래스(Abstract Class)
 * 	구현되지 않은 추상메소드가 존재하는 클래스.
 *  미완성 클래스
 *  'abstract' 키워드를 사용하여 선언된다.
 * 
 * 추상메소드
 * 	메소드의 선언부만 있고, 실제 구현되지 않은 메소드.
 * 	상속받은 하위클래스에서 구현이 이루어진다. (오버라이딩)
 *  'abstract' 키워드를 사용하여 선언된다.
 * 
 * 
 */
public class AbstractClass01 {
	public static void main(String[] args) {
		Game game1 = new SuperMario();
		game1.title = "슈퍼마리오";
		game1.genre = "adventure";
		game1.price = 50000;
		game1.console = "닌텐도 스위치";
		game1.setPlayer(2);
		
		game1.getInfo();
		
		
	}

}












