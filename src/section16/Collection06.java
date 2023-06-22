package section16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*

				
no:1 name:홍길동	mobile:1111	nation:한국
no:2 name:짱구	mobile:2222	nation:일본
no:3 name:도라에몽	mobile:3333	nation:일본

 */

public class Collection06 {
	public static void main(String[] args) {
		List<Map<String, Object>> memberList = new ArrayList<>();
		Map<String, Object> member1 = new HashMap<>();
		Map<String, Object> member2 = new HashMap<>();
		Map<String, Object> member3 = new HashMap<>();
		
		member1.put("no", 1);
		member1.put("name", "홍길동");
		member1.put("mobile", "1111");
		member1.put("nation", "한국");
		
		member2.put("no", 2);
		member2.put("name", "짱구");
		member2.put("mobile", "2222");
		member2.put("nation", "일본");
		
		member3.put("no", 3);
		member3.put("name", "도라에몽");
		member3.put("mobile", "3333");
		member3.put("nation", "일본");
		
		memberList.add(member1);	
		memberList.add(member2);
		memberList.add(member3);
		
		
		System.out.println("no\tname\tmobile\tnation");
		for(Map<String, Object> row : memberList) {
			Integer no = (Integer) row.get("no");
			String name = (String) row.get("name");
			String mobile = (String) row.get("mobile");
			String nation = (String) row.get("nation");
			
			System.out.println(no+"\t"+name+"\t"+mobile+"\t"+nation);
		}
		
	}
}









