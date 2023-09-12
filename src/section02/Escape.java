package section02;
/*
 * 이스케이프(Escape) 문자 
 * 	특정한 문자나 문자열을 특별한 용도로 해석하도록 하는 문자.
 * 
 * 	\\ : 역슬래시 자체를 나타낸다.  
 * 	\" : 쌍따옴표를 나타낸다.
 * 	\' : 작은따옴표를 나타낸다.
 * 	\n : 새 줄(줄 바꿈)을 나타낸다.
 * 	\t : 탭 문자를 나타낸다.
 * 	\r : 캐리지 리턴을 나타낸다.
 * 	\b : 백스페이스를 나타낸다.
 * 
 */

public class Escape {
	public static void main(String[] args) {
		
		System.out.println("\"Hello, World!\""); 	// "Hello, World!"
		
		System.out.println("안녕하세요.\n이것은 줄 바꿈입니다.\n탭 간격: \t1\t2\t3");
	}
}
