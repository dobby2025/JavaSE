package section15;
/*
 * 래퍼클래스(Wrapper Class)
 * 	기본 자료형을 객체로 감싸서 사용할 수 있도록 해주는 클래스
 * 	기본자료형 래퍼클래스 8가지
 * 		- Boolean, Byte, Character, Short, Interger, Long, Float, Double
 */
public class JavaLang06 {
	
	public static void main(String[] args) {
		// 문자열 "12345"를 정수형 int로 변환
		String strNum = "12345";
		int num = Integer.parseInt(strNum);
		
		System.out.println("num: " + num);
		
		Integer num2 = 10;	// 오토박싱
		int num3 = 10;	// 오토언박싱
		// 생성자를 통한 선언은 JDK 1.9부터 사용하지 않는것을 권장
		Integer num4 = new Integer(10);
		Integer num5 = Integer.valueOf(10);	
		
		System.out.println("num2.hashCode(): " + num2.hashCode());
		System.out.println("num4.hashCode(): " + num4.hashCode());
		System.out.println(System.identityHashCode(num2));	
		System.out.println(System.identityHashCode(num3));	
		System.out.println(System.identityHashCode(num4));	
		System.out.println(System.identityHashCode(num5));	
		
		// 실수형 타입 선언
		Double doubleNum = Double.valueOf(3.141592);
		Double dobuleNum2 = Double.parseDouble("3.141592");
		
		// 문자형 타입 선언
		Character ch = Character.valueOf('A');
		
		
		int iNum1 = 10;
		Integer iNum2 = 10;
		
		System.out.println("==========================");
		identityHashCode_KTH(iNum1);
		identityHashCode_KTH(iNum2);
		
		
	}
	
	
	public static void identityHashCode_KTH(Integer num) {	// Integer num = 10;
		System.out.println(System.identityHashCode(num));
	}

}













