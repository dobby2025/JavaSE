package section02;
/*
 * 2. 문자형(char)
 * 	문자 한글자 저장가능한 변수
 * 	2byte
 * 	세계 각 나라의 문자를 숫자(0~65535)로 매핑해둔 국제 표준 규약이다.
 * 	각 문자는 1~2byte의 크기를 가지고 있다.
 * 
 * 선언방법
 * 	char 변수명;
 * 
 */

public class Variable02 {
	public static void main(String[] args) {
		// char 형 변수 선언 및 대입하기
		char ch1 = 'A';
		System.out.println("char 형 변수에 저장된 문자: " + ch1);
		
		char ch2, ch3;
		ch2 = '金';
		ch3 = '쀍';
		System.out.println("ch2 저장된 문자: " + ch2);
		System.out.println("ch3 저장된 문자: " + ch3);
		
		int num = ch1;	// char ch1 변수를 int 정수형 변수에 저장
		System.out.println("대문자 A에 해당하는 숫자 코드: " + num);
		
		char ch4 = 66;
		System.out.println("숫자 66에 해당하는 문자 코드: " + ch4);
		
		
	}
}







