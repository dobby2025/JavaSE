package section14;
/*
 * 예외(Exception)
 * 	자바프로그램 구동 중에 나타나는 오류를 말한다.
 * 	문법적으로 문제 없어 보이지만 실제 운영중에 생기는 오류
 * 
 * 예외처리 방법 : try ~ catch
 * 	try {
 * 		실행코드
 * 	} catch(익셉션클래스 매개변수명) {
 * 		예외 발생시 실행코드
 * 	}
 * 	
 * 
 * 
 */
public class ExceptionClass01 {
	
	public static void main(String[] args) {
		
		
		/*
		if(num2 == 0) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
		} else {
			result = num1 / num2;
			System.out.println("result: " + result);
		}
		*/
		
		try {
			int num1 = 10;
			int num2 = 0;
			
			int result = 0;
			
			result = num1 / num2;
			System.out.println("result: " + result);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("에러메시지: " +e.getMessage());
			System.out.println("관리자에게 문의하세요.");
		}
		
		
	}
}








