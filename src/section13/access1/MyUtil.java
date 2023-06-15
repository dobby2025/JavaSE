package section13.access1;

public class MyUtil {
	public String str1 = "일반멤버 변수";
	public static String str2 = "static멤버 변수"; 
	
	public class HelloPrinter {
		public void printHello() {
			System.out.println("내부 클래스 HelloPrinter 입니다.");
			System.out.println(str1);	// 1. 가능? 가능
			System.out.println(str2);	// 2. 가능? 가능
		}
	}
	
	public static class Calculater {
		public void calc(int a, int b) {
			System.out.println("전달 받은 두 정수의 합: "+ (a + b));
//			System.out.println(str1);	// 3. 가능? 불가능
			System.out.println(str2);	// 4. 가능? 가능
		}
		
	}

}
