package section15;

public class JavaLang07 {
	public static void main(String[] args) {
		Integer num1 = 10;
		Integer num2 = 1000;
		
		/*
		 * compareTo()
		 * ex) num1.compareTo(num2)
		 * 
		 * 결과가 양수이면 num1 > num2
		 * 결과가 음수이면 num1 < num2
		 * 결과가 0이면 두 수는 같다.
		 * 
		 */
		
		if(num1.compareTo(num2) > 0) {
			System.out.println("num1이 num2 보다 크다.");
		} else if (num1.compareTo(num2) == 0) {
			System.out.println("num1과 num2는 같다.");
		} else {
			System.out.println("num1은 num2 보다 작다.");
		}
		
		String str1 = num1.toString();
		System.out.println(str1);
		
		System.out.println("INT MAX: " + Integer.MAX_VALUE);
		System.out.println("INT MIN: " + Integer.MIN_VALUE);
		
		System.out.println("문자입니까? " + Character.isLetter('A'));
		System.out.println("숫자입니까? " + Character.isDigit('5'));
		System.out.println("공백입니까? " + Character.isWhitespace(' '));
		
		
		String pwd = "abcd1";
		char[] charArray = pwd.toCharArray();
		
		int countLetter = 0;
		int countDigit = 0;
		
		for(char c : charArray) {
			if(Character.isLetter(c)) {
				countLetter++;
			} else if (Character.isDigit(c)) {
				countDigit++;
			}
		}
		
		if(countLetter > 0 && countDigit > 0) {
			System.out.println("사용할 수 있는 PWD!");
		} else {
			System.out.println("영문 숫자 조합으로 PWD 생성 가능합니다.");
		}
		
		
	}

}





