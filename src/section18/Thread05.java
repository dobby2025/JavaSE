package section18;

import section18.access3.InterThread;

/*
 * Runnable 인터페이스
 * 	Thread 상속대신 Runnable 인터페이스 상속받아 Thread 객체 구현
 * 
 * 
 */

public class Thread05 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		Runnable iThread = new InterThread();
		
		Thread thread = new Thread(iThread);
		
		thread.start();
		
		System.out.println("메인스레드 종료!");
	}

}






