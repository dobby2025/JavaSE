package section02;
/*
 * 1. 논리형(boolean)
 * 	true 또는 false 두가지 값을 가지는 기본 자료형
 * 	1byte
 * 
 * 선언방법
 * 	boolean 변수명;
 * 
 */
public class Variable01 {
	public static void main(String[] args) {
		// 논리형 변수 선언하기
		boolean isBool;
		// 선언한 변수에 값 대입하기
		isBool = true;
		
		System.out.println("논리형 변수에 저장된 값: " + isBool);
		
		// 논리형 변수 값 변경하기
		isBool = false;
		
		// 조건문에 논리형변수 사용하기
		if(isBool) {
			System.out.println("isBool값은 true 입니다.");
		} else {
			System.out.println("isBool값은 false 입니다.");
		}
		
	}
}










