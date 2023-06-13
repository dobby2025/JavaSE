package section12;

import section12.access2.Cat;
import section12.access2.HouseCat;
import section12.access2.PersianCat;
import section12.access2.Playable;

/*
 * 인터페이스(interface)
 * 	추상화된 타입을 정의하는데 사용되는 개념
 * 	추상메소드와 상수로만 이루어져 있다.
 * 	다중 상속이 가능하다.
 *  'implements' 키워드로 상속 가능
 *  
 *  객체의 구조(뼈대)를 만드는 역할을 한다.
 * 
 */
public class InterfaceClass01 {
	public static void main(String[] args) {
		PersianCat pCat = new PersianCat();
		
		pCat.name = "프린센스";
		pCat.eat();
		System.out.println(pCat.PAW);
		// pCat.PAW = 2;	// 인터페이스 상수 변경불가
		
		Cat hCat = new HouseCat("나비");	// 다형성
		
		hCat.eat();
//		System.out.println(hCat.name);
		HouseCat hCat2 = (HouseCat) hCat;
		
		System.out.println(hCat2.name);
		
		if(hCat instanceof PersianCat ) {
			System.out.println("페르시안 고양이 입니다.");
		} else if (hCat instanceof HouseCat) {
			System.out.println("집고양이 입니다.");
		}
		
		Playable hCat3 = hCat2;
		hCat3.play();
		
	}
}






