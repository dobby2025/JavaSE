package section17;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Bat");
		list.add("Cat");
		list.add("Dog");
		
//		printBasic(list);
		
//		printWithFP(list);
		
//		printBasicWithFiltering(list);
		
		printWithFPWithFiltering(list);
		
	}
	
	private static void printBasic(List<String> list) {
		for(String str : list) {
			System.out.println(str);
		}
	}
	
	// stream forEach 람다식
	private static void printWithFP(List<String> list) {
		list.stream()
			.forEach(element -> System.out.println("element - " + element));
	}
	
	
	private static void printBasicWithFiltering(List<String> list) { 
		for(String str : list) {
			if(str.endsWith("at")) {
				System.out.println(str);
			}
		}
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
			.filter(element -> element.endsWith("at"))
			.forEach(element -> System.out.println("element - " + element));
		
	}

}









