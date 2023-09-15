package section03;
/*
 * 6. 비트 연산자
 * 	2진수로 표현된 두 비트 연산자
 * 
 *  & : 대응되는 비트가 모두 1이면 1을 반환(비트 And 연산자)
 *  | : 대응되는 비트중 하나라도 1이면 1을 반환(비트 Or 연산자)
 *  ^ : 대응되는 비트가 서로 다르면 1을 반환(비트 XOR(Exclusive Or) 연산자)
 *  ~ : 대응되는 비트가 1이면 0으로, 0이면 1로 반전(비트 Not 연산자)
 * 
 */
public class Operator06 {
	public static void main(String[] args) {
		int num1 = 3;	// 0011
		int num2 = 5;	// 0101
		System.out.println("num1 & num2: " + (num1 & num2));
		System.out.println("num1 | num2: " + (num1 | num2));
		System.out.println("num1 ^ num2: " + (num1 ^ num2));
		
		System.out.println("~num1: " + ~num1);
		
	}

}







