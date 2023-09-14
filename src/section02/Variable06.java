package section02;
/*
 * 5. String 형 (문자열)
 * 	문자열 저장할 수 있다.
 * 	참조형 변수
 * 
 * 선언방법
 * 	String 변수명;
 * 
 * 기본형(8가지) - boolean, char, byte, short, int, long, float, double
 * 				실제 값을 저장하고 있다.
 * 참조형 - 기본형을 제외한 모든 객체(클래스 코드로 되어있다.)
 * 		  주소 값을 저장하고 있다.
 * 		  속성(값-변수), 기능(메서드)
 * 
 * 
 */
public class Variable06 {
	
	public static void main(String[] args) {
		// String 변수 선언과 동시에 값 대입하기
		String str = "안녕하세요.";
		System.out.println("str: " + str);
		
		/*
		 * h e l l o
		 * 0 1 2 3 4  => 인덱스번호 
		 */
		String hello = "hello";
		System.out.println("1번 인덱스 문자: " + hello.charAt(1));
		
		System.out.println(System.identityHashCode(hello));
		
	}

}











