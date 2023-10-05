package section08;
/*
계산기 메서드: 두 개의 숫자와 연산자(+, -, *, /)를 입력으로 받아서 계산하는 메서드를 작성하십시오.

문자열 뒤집기: 문자열을 입력으로 받아서 해당 문자열을 거꾸로 뒤집는 메서드를 작성하십시오.

최대값 찾기: 정수 배열을 입력으로 받아서 배열 내의 최대값을 찾아 반환하는 메서드를 작성하십시오.

소수 판별: 주어진 숫자가 소수인지 아닌지를 판별하는 메서드를 작성하십시오.

배열 정렬: 정수 배열을 입력으로 받아서 오름차순으로 정렬하는 메서드를 작성하십시오.
 */
public class MethodHomeWork {
	
	// 계산기 메서드: 두 개의 숫자와 연산자(+, -, *, /)를 입력으로 받아서 계산하는 메서드를 작성하십시오.
	public static double calculate(double num1, double num2, char operator) {
		double result = 0;
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Division by zero is not allowed.");
			}
			break;
		default:
			System.out.println("Invalid operator");
		}
		return result;
	}

	// 문자열 뒤집기: 문자열을 입력으로 받아서 해당 문자열을 거꾸로 뒤집는 메서드를 작성하십시오.
	public static String reverseString(String input) {
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		return reversed;
	}

	// 최대값 찾기: 정수 배열을 입력으로 받아서 배열 내의 최대값을 찾아 반환하는 메서드를 작성하십시오.
	public static int findMax(int[] arr) {

		int max = arr[0]; // 배열의 첫 번째 요소를 최대값으로 초기화합니다.

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; // 현재 요소가 현재까지의 최대값보다 크면 최대값을 갱신합니다.
			}
		}

		return max;
	}

	// 소수 판별: 주어진 숫자가 소수인지 아닌지를 판별하는 메서드를 작성하십시오.
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false; // 1 이하의 숫자는 소수가 아닙니다.
		}

		if (number <= 3) {
			return true; // 2와 3은 소수입니다.
		}

		if (number % 2 == 0 || number % 3 == 0) {
			return false; // 2 또는 3으로 나누어 떨어지면 소수가 아닙니다.
		}

		// 5부터 시작하여 6씩 증가하는 숫자를 사용하여 소수를 판별합니다.
		for (int i = 5; i * i <= number; i += 6) {
			if (number % i == 0 || number % (i + 2) == 0) {
				return false;
			}
		}

		return true; // 위의 조건을 모두 통과하면 소수입니다.
	}

}
