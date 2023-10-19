package section15;

import java.util.Calendar;
import java.util.Scanner;

public class JavaUtil05 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요");
		int year = scan.nextInt();
		
		System.out.println("월을 입력하세요");
		int month = scan.nextInt();
		
		cal.set(year, month - 1, 1);
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// 달의 마지막 날짜를 구함
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		
		// 지정한 달의 시작하는 요일을 구함 (1(일)~7(토))
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("week: " + week);
		
		// 달력 시작 날의 주말처리
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		
		for(int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%d\t", i);
			
			if(week % 7 == 0) {
				System.out.println();
			}
			
			week++;
		}
		
		scan.close();
			
	}

}











