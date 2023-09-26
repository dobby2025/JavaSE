package section07;
/*
 * 변수(Variable)
 * 	데이터를 저장하고 조작하는데 사용되는 식별자로서의 이름을 가진
 * 	메모리 위치 입니다.
 * 
 * 변수 선언 및 초기화
 * 	자료형(Type) 변수명 = 값 또는 참조값;
 * 
 * 	1. 타입의 따른 변수
 * 	 	기본형 - 예약어 되었있다, 소문자 시작, 직접 값을 저장하고 있다.
 * 			8가지 - byte, boolean, short, char, int, long, float, double
 * 		참조형 - 기본형 외 나머지 전부!!! 참조(주소)값을 가지고 있다. 
 * 				일반적으로 대문자로 시작
 * 			ex) String, Math
 * 	2. 선언 위치에 따른 변수
 * 		전역변수 - 클래스안에 선언된 변수(멤버변수)
 * 				 초기화 하지 않으면 default 값이 들어간다.
 * 				  boolean - false
 * 				  정수형 - 0
 * 				  실수형 - 0.0d
 * 				  참조형 - null
 * 
 * 		지역변수 - 메서드 또는 생성자 안에 선언된 변수
 * 				 메서드 종료시 같이 소멸된다.
 * 				 매개변수도 지역변수이다. 
 * 				 지역변수는 반드시 초기화를 해줘야 한다. 
 * 			
 * 
 * 	 
 */


public class Var01 {
	
	// 전역변수 (클래스 내부 선언된 변수)
	static int globalVar = 10;
	static int globalVar2;
	static double globalVar3;
	static boolean globalVar4;
	static String globalVar5;
	
	public static void localMethod() {
		// 지역변수 선언
		int localVar = 20;
		System.out.println("전역변수 호출하기 : " + globalVar);
		System.out.println("지역변수 호출하기 : " + localVar);
	}
	
	public static void localMethod2() {
		System.out.println("전역변수 호출하기 : " + globalVar);
		// System.out.println("지역변수 호출하기 : " + localVar);
	}
	
	public static void localMethod3() {
		int localVar = 0; 
		String str = null;
		
		System.out.println("전역변수 호출하기 : " + globalVar2);
		System.out.println("전역변수 호출하기 : " + globalVar3);
		System.out.println("전역변수 호출하기 : " + globalVar4);
		System.out.println("전역변수 호출하기 : " + globalVar5);
		// System.out.println("지역변수 호출하기 : " + localVar);
		
	}
	
	public static void main(String[] args) {
		
		localMethod3();
	}
	
	
	
	
}




