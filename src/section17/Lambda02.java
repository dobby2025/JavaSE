package section17;

import java.util.Arrays;
import java.util.List;

/*
 * 스트림(Stream)
 * 	데이터 처리와 컬렉션을 다루는데에 사용되는 선언적이고 함수형 스타일의 API이다.
 * 	컬렉션을 스트림으로 변환하여 조작, 필터링, 매핑 등을 효율적이고 간결하게 수행가능.
 * 
 * 	스트림용어 데이터의 흐름을 다루는 추상적인 개념이다.
 * 
 * 
 */
public class Lambda02 {
	
	public static void main(String[] args) {
		// List.of 만든 list 객체는 불변(immutable)이다.
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		List<String> list2 = Arrays.asList("Apple", "Bat", "Cat", "Dog");
		
		// printBasic(list);
		// printWithFP(list);
		// printBasicWithFiltering(list);
		printWithFpFiltering(list);
	}
	private static void printBasic(List<String> list) {
		for(String element : list) {
			System.out.println(element);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream()
			.forEach(element -> System.out.println("element -" + element));
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String element : list) {
			if(element.endsWith("at")) {
				System.out.println(element);
			}
		}
	}
	
	private static void printWithFpFiltering(List<String> list) {
		list.stream()
			.filter(element -> element.endsWith("at"))
			.forEach(element -> System.out.println("element- " + element));
	}

}









