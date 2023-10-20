package section16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 
 * no:1	
 * name: 홍길동		
 * mobile:01010001234		
 * address:서울특별시
 * 
 * 
 * 
 * 
 * no:2	name: 짱구		mobile:01020001234		address:떡잎마을
 * 
 * 
 * no:3	name: 둘리		mobile:01030001234		address:쌍문동
 * 
 * 
 * no:4	name: 도라에몽	mobile:01040001234		address:오징어도시
 * 
 * 
 * 
 */

public class Collection05 {
	
	public static void main(String[] args) {
		
		List<Map<String, Object>> memberList = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> member1 = new HashMap<String, Object>();
		Map<String, Object> member2 = new HashMap<String, Object>();
		Map<String, Object> member3 = new HashMap<String, Object>();
		Map<String, Object> member4 = new HashMap<String, Object>();
		
		
		member1.put("no", 1);
		member1.put("name", "홍길동");
		member1.put("mobile", "01010001234");
		member1.put("address", "서울특별시");
		member1.put("jobId", "개발자");
		
		member2.put("no", 2);
		member2.put("name", "짱구");
		member2.put("mobile", "01020001234");
		member2.put("address", "떡잎마을");

		member3.put("no", 3);
		member3.put("name", "둘리");
		member3.put("mobile", "01030001234");
		member3.put("address", "쌍문동");
		
		member4.put("no", 4);
		member4.put("name", "도라에몽");
		member4.put("mobile", "01040001234");
		member4.put("address", "오징어도시");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		memberList.add(member4);
		
		/*
			no	name	mobile		address
			1	홍길동	01010001234	서울특별시
			2	짱구		01020001234	떡잎마을
			3	둘리		01030001234 쌍문동
			4	도라에몽	01040001234	오징어도시
		*/
		
		System.out.println("no\tname\tmobile\t\taddress\tjobId");
		for(int i = 0; i < memberList.size(); i ++) {
			Map<String, Object> map = memberList.get(i);
			int no = (int) map.get("no");
			String name = (String) map.get("name");
			String mobile = (String) map.get("mobile");
			String address = (String) map.get("address");
			String jobId = (String) map.get("jobId");
			
			System.out.println(no+"\t"+name+"\t"+mobile+"\t"+address +"\t" + jobId);
		}
	}
}






