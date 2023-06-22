package section15;
/*
 * 래퍼클래스(Wrapper Class)
 * 기본 자료형을 객체로 감싸서 사용할 수 있도록 해주는 클래스
 * Boolean, Character, Byte, Short, Integer, Long, Float, Double
 * 
 */
public class JavaLangClass05 {
	public static void main(String[] args) {
		// 문자열 "12345"를 정수형 int로 변환
		String intStr = "12345";
		int num = Integer.parseInt(intStr);
		System.out.println("num: "+num);
		
		// 기본형처럼 대입 가능
		Integer num2 = 10;
		System.out.println("num2: " + num2);
		
		Integer num3 = 10000;
		/*
		  num2.compareTo()
		  결과가 음수이면 num2 < num3
		  결과가 양수이면 num2 > num3
		  결과가 0이면 num2 == num3
		  
		*/
		System.out.println("compareTo: " + num2.compareTo(num3));
		
		// Integer 값 문자열로 변환
		String strNum = num2.toString();
		System.out.println("strNum: " + num2.toString());
		
	}
}











