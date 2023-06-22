package section16;

import java.util.ArrayList;
import java.util.List;

public class Collection07 {
	public static void main(String[] args) {
		List<MemberVO> memberList = new ArrayList<>();
		MemberVO member1 = new MemberVO();
		MemberVO member2 = new MemberVO();
		
		member1.setNo(1);
		member1.setName("홍길동");
		member1.setMobile("1111");
		member1.setNation("한국");
		
		member2.setNo(2);
		member2.setName("도라에몽");
		member2.setMobile("2222");
		member2.setNation("일본");
		
		memberList.add(member1);
		memberList.add(member2);
		
		System.out.println("no\tname\tmobile\tnation");
		for(MemberVO member : memberList) {
			Integer no = member.getNo();
			String name = member.getName();
			String mobile = member.getMobile();
			String nation = member.getNation();
			
			System.out.println(no+"\t"+name+"\t"+mobile+"\t"+nation);
		}
		
	}

}




