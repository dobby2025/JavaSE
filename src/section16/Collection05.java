package section16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * 	Key, Value 값을 쌍으로 저장하는 객체.
 * 	Key는 중복 불가
 * 
 */

public class Collection05 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		// 데이터 저장하기
		map.put("Car", "자동차");
		map.put("Star", "별");
		map.put("Sun", "태양");
		map.put("Moon", "달");
		map.put("Tiger", "호랑이");
		
		String value = map.get("Car");
		System.out.println("Car 뜻: " + value);
		
		// Map에 있는 키값 불러오기
		Set<String> keys = map.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}
		
	}

}






