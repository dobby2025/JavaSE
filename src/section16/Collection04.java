package section16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 
 * Map
 * 	Map 인터페이스는 키-값 쌍으로 데이터를 저장하는 자료구조 이다.
 * 	키는 중복을 허용하지 않는다. 순서보장하지 않느다.
 * 	값은 중복을 허용한다. 
 * 
 */

public class Collection04 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터 저장하기
		map.put("Alice", 95);
		map.put("Bob", 82);
		map.put("David", 90);
		map.put("Son", 100);
		
		// map 값 가져오기
		int score = map.get("Alice");
		System.out.println("Alice score: " + score);
		
		// 특정 키의 존재여부 확인
		if(map.containsKey("Son")) {
			System.out.println("Son score: " + map.get("Son"));
		}
		
		// 전체 키값 가져오기
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int score2 = map.get(key);
			System.out.println("name: " + key);
			System.out.println("score: " + score2);
		}
		
		System.out.println("==================================");
		
		map.put("Son", 90);
		
		map.remove("David");
		// entrySet() - Map에 키-값 쌍을 포함하는 Map.Entry를 요소로 가지고있는 Set 을 반환하는 메서드
		//				항목을 편리하게 순회하거나 수정할 때 사용된다.
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println("name : " + entry.getKey());
			System.out.println("score : " + entry.getValue());
		}

	}
	

}














