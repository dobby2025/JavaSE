package section13;

import section13.access2.Bird;

/*
 * 익명클래스(Anonymous Class)
 * 	이름이 없는 클래스로, 클래스 정의와 동시에 인스턴스를 생성하는 방식이다.
 * 	일회용 클래스
 * 
 */
public class InnerClass04 {
	public static void main(String[] args) {
		
		Bird bird = new Bird() {	// Bird 인터페이스를 상속받은 익명클래스  
			
			@Override
			public void sing() {
				System.out.println("새가 노래를해요~");
			}
			
			@Override
			public void fly() {
				System.out.println("하늘을 날아요~");
			}
		};
		
		bird.sing();
		bird.fly();
		
		
		
		
	}
}




