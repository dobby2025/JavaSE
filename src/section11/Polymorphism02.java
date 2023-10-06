package section11;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

public class Polymorphism02 {
	
	public static void main(String[] args) {
		
		/*
		 *	1. Car drive()
		 *	2. Bus drive()
		 *  3. ShcoolBus dirver()
		 */
		SchoolBus sBus1 = new SchoolBus();
		sBus1.drive();	// 3
		
		//주소값 출력
		System.out.println(System.identityHashCode(sBus1));
		
		Car car1 = sBus1;
		car1.drive();	// 3
		//주소값 출력
		System.out.println(System.identityHashCode(car1));
		
		Bus bus1 = (Bus) car1;
		bus1.drive();	// 2
		//주소값 출력
		System.out.println(System.identityHashCode(bus1));
		
	}
}






