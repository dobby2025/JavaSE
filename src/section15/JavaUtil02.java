package section15;

import java.util.Random;

public class JavaUtil02 {
	
	public static void main(String[] args) {
		
		int[] iArray = new int[45];
		
		for(int i = 0; i < iArray.length; i++) {
			iArray[i] = i+1;
		}
		// iArray = {4, 1, 3, 2 ... 45};
		Random ran = new Random();
		
		
		// 1~45 셔플 
		for(int i = 0; i < iArray.length; i++) {
			// 0 ~ 44 난수 값 반환
			int cIndex = ran.nextInt(45);
			
			/*
				cIndex= 3
				i = 1
				iArray[1] = 1
				tmp = 2
				iArray[3] = 2
			
			*/
			int tmp = iArray[i];
			iArray[i] = iArray[cIndex];
			iArray[cIndex] = tmp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(iArray[i] + "/");
		}
	}
}












