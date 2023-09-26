package section08;

public class Method02 {
	
	public static void main(String[] args) {
		
		printName("도라에몽"); // printName 호출
		
		String name = "짱구";
		printName(name);
		
	}
	
	// 2. 인자 O, 리턴 X  -> 매개변수 값을 받아 실행하는 메서드
	// 	                   매개변수도 지역변수 이다.
	public static void printName(String name) {	// String name = "도라에몽";
		System.out.println("이름: " + name);
	}
}





