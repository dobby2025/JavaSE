package section19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import section19.access1.*;

/*
 * ObjectInputStream / ObjectOutputStream
 * 	객체를 바이트 스트림으로 읽고 쓰는 클래스
 * 
 * Serializable
 * 	직렬화, 객체를 일련의 바이트(byte)로 변환하는것
 * 
 */

public class IO07 {
	public static void main(String[] args) throws IOException {
		
		MemberVO member = new MemberVO();
		member.setName("피카츄");
		member.setAge(25);
		
		String filePath = "./upload/member.obj";
		
		FileOutputStream fos = null;
		
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(member);
			
			System.out.println("객체 >> 파일백업");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(oos != null) oos.close();
			if(fos != null) fos.close();
		}
		
		
	}

}















