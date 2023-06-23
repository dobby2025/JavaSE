package section17;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(66);
		numbers.add(99);
		
		int result = nomalSum(numbers);
		System.out.println("합계 : " + result);
		
	}
	
	private static int nomalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
	
	// stream reduce 람다식 - 스트림요소들을 결합하여 단일결과를 생성
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, (sum, number) -> sum + number);
	}
	
	
	
}









