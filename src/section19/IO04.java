package section19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * InputStream / OutputStream
 * 	바이트 기반 입력과 출력을 다루는 추상클래스 이다.
 * 
 * FileInputStream
 * 	파일을 바이트 단위로 순차적으로 읽는 객체
 * 
 * FileOutputStream
 * 	파일을 바이트 단위로 순차적으로 쓰는 객체
 * 
 */
public class IO04 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("./upload/hello.txt");
			
			File f1 = new File("./upload2");
			if(f1.mkdir()) {
				System.out.println("upload2 디렉토리 생성되었습니다.");
			}
			
			// hello2.txt 파일이 없으면 생성 해준다.
			// 단 디렉토리 생성 하지 않는다.
			fos = new FileOutputStream("./upload2/hello2.txt");
			
			int readByteCnt = 0;
			byte[] b = new byte[2];
			
			//  readByteCnt = fis.read(b)  읽을 데이터가 없으면 -1 반환
			// () != - 1
			
			while((readByteCnt = fis.read(b)) != - 1) {
				fos.write(b, 0, readByteCnt);
			}
			
			System.out.println("파일 복사 완료!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}














