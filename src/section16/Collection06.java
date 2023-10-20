package section16;

import java.util.ArrayList;
import java.util.List;

public class Collection06 {
	public static void main(String[] args) {
		
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		
		MemberVO member1 = new MemberVO();
		MemberVO member2 = new MemberVO();
		
		member1.setNo(1);
		member1.setName("홍길동");
		member1.setMobile("01010001234");
		member1.setAddress("서울특별시");

		member2.setNo(2);
		member2.setName("짱구");
		member2.setMobile("01020001234");
		member2.setAddress("떡잎마을");
		
		memberList.add(member1);
		memberList.add(member2);
		
		System.out.println("no\tname\tmobile\t\taddress");
		for(MemberVO member : memberList) {
			int no = member.getNo();
			String name = member.getName();
			String mobile = member.getMobile();
			String address = member.getAddress();

			System.out.println(no+"\t"+name+"\t"+mobile+"\t"+address);
		}
		
		
		
		
		
		
		
		
		
	}

}
