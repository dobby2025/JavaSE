package section12;

import section12.access1.Dog;
import section12.access1.Animal;
import section12.access1.Cat;

/*
 * 추상클래스(Abstract Class)
 * 	일부 메서드가 구현되지 않은 추상메서드가 존재하는 클래스
 * 	'미완성클래스' 
 * 	abstract 키워드를 사용하여 선언한다.
 * 	객체 생성 불가. 상속 후 추상메서드 오버라이딩 후 사용가능
 * 
 */
public class AbstractClass {
	
	public static void main(String[] args) {
		Dog dog = new Dog("댕댕");
		dog.eat();
		dog.makeSound();
		
		Animal cat = new Cat("야옹");
		cat.eat();
		cat.makeSound();
		
		
	}

}







