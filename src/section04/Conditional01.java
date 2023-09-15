package section04;
/*
 * 제어문
 * 	프로그램 실행 흐름을 제어하기 위해 사용되는 명령어.
 * 
 * 조건문
 * 
 * 1. if문
 * 	if(조건식) {
 * 		조건식 true 일 때 실행 명령문
 * 	}
 * 
 *  if(조건식)
 *  	조건식 ture 일 때 실행 명령문(명령문이 하나 일경우 중괄호 생략 가능)
 * 
 */
public class Conditional01 {
	public static void main(String[] args) {
		int num = 71;
		if(num % 2 == 0) {
			System.out.println("num은 짝수 입니다.");
		}
		
		if(num % 2 != 0) {
			System.out.println("num은 홀수 입니다.");
		}
		
		if(num % 2 == 0) 
			System.out.println("num은 짝수 입니다.");
		
		if(num % 2 != 0) 
			System.out.println("num은 홀수 입니다.");
		
	}

}









