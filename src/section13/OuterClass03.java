package section13;

import section13.access1.MyUtil;

/*
 * 정적(static) 내부클래스 
 * 	외부클래스의 인스턴스에 종속되지 않으며, 독립적으로 사용할 수 있는 내부클래스 유형이다. 
 * 
 * 선언방법
 * 	Outer.Inner in = new Outer.Inner();
 * 	
 * 인스턴스 내부클래스
 * 	기본적인 일반 내부클래스 이다.
 * 	외부클래스 안에 생성되기 때문에 클래스를 사용하려면
 * 	외부클래스 객체가 생성된 상태에서 객체 생성을 할 수 있다.
 * 
 * 인스턴스 내부클래스 선언방법
 * 	Outer outer = new Outer();
 * 	Outer.Inner in = outer.new Inner();
 * 
 */

public class OuterClass03 {
	
	public static void main(String[] args) {
		
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		hp.printHello();
		
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		hp2.printHello();
		
		MyUtil.Calculater calc = new MyUtil.Calculater();
		calc.calc(25, 30);
		
	}
	
}









