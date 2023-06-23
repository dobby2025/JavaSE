package section17;
/*
 * Lambda 표현식
 * 	람다식(Lambda Expression) 이란 함수를 하나의 식(expression)으로 표현한 것을 말한다.
 * 	함수를 람다식으로 표현하면 메소드 이림이 필요 없기 때문에,
 * 	람다식은 익명 함수(Anonymous Function)의 한 종류라고 볼 수 있다.
 * 
 * 기존 메소드방식
 * 반환타입 메소드명(매개변수, ...) {
 * 		실행코드
 * }
 * 
 * 람다표현식
 * (매개변수,...) -> { 실행문 }
 * 
 * 
 */
public class Lambda01 {
	public static void main(String[] args) {
		// 1. 기존 익명클래스
		MyLambdaFunction mlf = new MyLambdaFunction() {
			
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
		System.out.println(mlf.max(3, 5));
		
		// 2. 람다식을 이용한 익명클래스
		MyLambdaFunction mlf2 = (int a, int b) -> a > b ? a : b;
		System.out.println(mlf2.max(7, 9));
		
	}
}

@FunctionalInterface
interface MyLambdaFunction {
	int max(int a, int b);
}








