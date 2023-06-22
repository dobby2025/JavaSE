package section15;

import java.util.Calendar;

/*
 * Calendar 클래스
 * 	날짜 관력 객체
 * 	날짜 계산용으로 자주 사용
 * 	Date 객체와 호환 가능
 * 
 * 
 */
public class JavaUtilClass04 {

	public static void main(String[] args) {
	
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("올 해: " + year);
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("월: " + month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("일: " + day);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(hour+":"+min+":"+sec);
		
		
	}
	
}







