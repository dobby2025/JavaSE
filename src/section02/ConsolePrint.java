package section02;
/*
 * 자바 클래스명 규칙
 * 	1. 클래스명은 통상적으로 대문자로 시작한다.
 * 	2. 유효한 식별자(예:문자, 숫자, 밑줄(_)의 조합)으로 이루어져야 한다.
 * 	3. 공백 포함해서는 안된다.
 * 	4. 예약어를 사용해서는 안된다.
 * 
 * 낙타표기법 consolePrint
 * 스네이크표기법 console_print
 * 
 * 
 * 출력문
 * 	데이터를 화면에 출력하는 방법
 * 
 * System.out.println() : 괄호안 내용 출력 후 행 바꿈
 * System.out.print()	: 괄호안 내용 출력 행 바꿈 X
 * System.out.printf()	: 문자열 서식 문자를 이용해 형식화된 내용 출력 행 바꿈 X
 * 
 * 서식문자
 * 	%d : 정수(10진수)
 * 	%o : 정수(8진수)
 * 	%x : 정수(16진수)
 * 	%f : 실수
 * 	%s : 문자열
 * 	%c : 문자
 * 
 * 
 */
public class ConsolePrint {
	// 자바 프로그램 시작 메인 메서드
	public static void main(String[] args) {
		// print - 줄바꿈 X
		System.out.print("Welcome.");
		
		// println - 줄바꿈 O
		System.out.println("Java World");
		
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 9, 12);
		
		System.out.println("오늘은 " + 9 + "월 " + 12 + "일 입니다." );
		
		System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째.\n", 1, 2.0, "셋");
		
	}

}












