package section13;

import section13.access1.MyUtil;

public class InnerClass03 {
	public static void main(String[] args) {
		// MyUtil 클래스에 HelloPrinter 내부클래스 생성하기
		// 첫번째 방법
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		hp.printHello();
		
		// 두번째 방법
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		hp2.printHello();
		
		MyUtil.Calculater calc = new MyUtil.Calculater();
		calc.calc(10, 20);
		
	}

}









