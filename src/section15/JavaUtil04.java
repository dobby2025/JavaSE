package section15;

import java.util.Calendar;

/*
 * Calendar 클래스
 * 	시간과 날짜 정보를 다루는 클래스
 * 	날짜 시간 계산으로 자주 사용된다.
 * 	Date 객체와 호환가능
 * 
 * 
 */
public class JavaUtil04 {
	
	public static void main(String[] args) {
		
		// 객체 생성 getInstance() 메서드 통해 해야한다.
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		// Calendar 클래스는 월의 시작이 0부터 시작
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘 날짜는 " + year + "년 " + month +"월 " + day +"일 입니다.");
		
	}

}










