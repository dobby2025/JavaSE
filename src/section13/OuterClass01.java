package section13;
/*
 * 내부 클래스(Inner Class)
 * 	내부클래스는 클래스 안에 만들어진 또 다른 클래스(중첩클래스)이다.
 * 	외부클래스와 밀접한 관계를 가진다.
 * 
 * 
 */
public class OuterClass01 {
	
	public static void main(String[] args) {
		// 객체생성없이 외부클래스를 통해 접근가능
		OuterClass01.InnerClass.info();
		
		// 같은 클래스 안에서는 바로 접근가능
		InnerClass.info();
		
	}
	
	static class InnerClass {
		public static void info() {
			System.out.println("static 내부클래스 입니다.");
		}
	}

}








