package section19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import section19.access1.MemberVO;

public class IO08 {
	public static void main(String[] args) throws IOException {
		String filePath = "./upload/member.obj";
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);
			
			MemberVO member = (MemberVO) ois.readObject();
			System.out.println("백업파일 >> 객체화");
			System.out.println("이름: " + member.getName());
			System.out.println("나이: " + member.getAge());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ois != null) ois.close();
			if(fis != null) fis.close();
		}
	}
}
