package section14;
/*
 * Exception 종류
 * 	1. Checked Exception
 * 		메서드 호출시 예외처리 하지 않을경우 컴파일 에러 발행.
 * 	2. UnChecked Exception
 * 		메서드 호출시 예외처리 하지 않아도 컴파일 에러 발생하지 않는다.
 * 
 */
public class ExceptionClass04 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);	// 1초 대기 (1000밀리세컨즈)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}











