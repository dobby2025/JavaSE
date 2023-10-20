package section17;
/*
 * 람다표현식(Lambda)
 * 	익명 함수를 정의할 수 있는 간결한 방법을 제공한다.
 * 	주로 함수형 인터페이스와 함께 사용된다.
 * 	
 * 	JAVA 8 이상 지원
 * 
 * 람다표현식 사용방법
 * 	(매개변수) -> 코드영역
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
		
		
		// 2. 람다식을 이용한 익명함수
		MyLambdaFunction mlf2 = (int a, int b) -> a > b ? a: b;
		System.out.println(mlf2.max(7, 9));
	}
}

@FunctionalInterface
interface MyLambdaFunction {
	int max(int a, int b);
}
















