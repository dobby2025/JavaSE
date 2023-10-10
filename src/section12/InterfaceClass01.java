package section12;

import section12.access1.Dog;
import section12.access2.Cat;
import section12.access2.HouseCat;
import section12.access2.PersianCat;
import section12.access2.Playable;

/*
 * 인터페이스(Interface)
 * 	추상 메서드의 집합으로, 클래스에서 다중상속과 느슨한 결합을 지원하며,
 * 	클래스의 동작을 정의하고 확장하는데 사용된다.
 * 
 */

public class InterfaceClass01 {
	
	public static void main(String[] args) {
		
		// Cat.PAW = 3;
		
		System.out.println(Cat.PAW);
		
		Cat cat1 = new HouseCat();
		eat(cat1);
		
		HouseCat hCat = (HouseCat) cat1;
		hCat.play();
		
		Playable pCat = hCat;
		pCat.play();
		// pCat.eat();
		
		cat1 = (Cat)pCat;
		
	}
	
	public static void eat(Cat cat) {
		cat.eat();
	}

}












