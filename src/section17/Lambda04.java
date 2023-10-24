package section17;

import java.util.List;
import java.util.stream.Collectors;

public class Lambda04 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 7, 45, 3, 1, 8);
		
		// 각 요소의 연산을 반영하기
		numbers.stream()
			.filter(n -> n % 2 == 0)
			.map(n -> n * n)
			.forEach(System.out::println);
		
		numbers.forEach(System.out::println);
		
		System.out.println("==============================");
		List<Integer> numbers2 = numbers.stream()
									.filter(n -> n % 2 == 0)
									.map(n -> n * n)
									.collect(Collectors.toList());
		
		
		numbers2.forEach(System.out::println);
	}

}





