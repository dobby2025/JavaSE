package section05;
/*
 * 2. do ~ while 문
 * 	while문과 비슷하지만, 조건에 상관없이 최초 한번은 무조건 실행된다.
 * 
 * 
 */
public class Loop02 {

	public static void main(String[] args) {
		
		int count = 100;
		do {
			// 반복 실행할 코드 영역
			System.out.println(count);
			count++;
		} while (count < 100);
		
	}
}










