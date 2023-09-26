package section08;

public class Method05 {
	public static void main(String[] args) {
		
		String name = getName();
		
		System.out.println("name: " + name);
		
		System.out.println("getName() : " + getName());
		
	}
	
	// 6. 인자 X, 리턴 O -> 메서드 실행하여 연산결과 값 반환
	public static String getName() {
		String name = "홍길동";
		
		return name;
	}

}



