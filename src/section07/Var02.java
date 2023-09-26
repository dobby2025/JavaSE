package section07;
/*
 * 3. 정적(static) 변수
 * 	정적 - static 예약어로 선언
 * 		 모든 객체가 공유하는 변수
 * 		 클래스명으로 접근 가능하다.
 * 		 객체 생성없이 불러올 수 있다.
 * 
 * 
 */
public class Var02 {
	
	
	public static void main(String[] args) {
		System.out.println(Card.height);
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		System.out.println("card1 type: " + card1.type);
		System.out.println("card1 num: " + card1.num);
		System.out.println("card1 width: " + Card.width);
		System.out.println("card1 height: " + Card.height);
		
		System.out.println("card2 type: " + card2.type);
		System.out.println("card2 num: " + card2.num);
		System.out.println("card2 width: " + Card.width);
		System.out.println("card2 height: " + Card.height);
		
		System.out.println("==================================================");
		
		card1.num = "K";
		Card.width = 72;
		
		System.out.println("card1 type: " + card1.type);
		System.out.println("card1 num: " + card1.num);
		System.out.println("card1 width: " + card1.width);
		System.out.println("card1 height: " + card1.height);
		
		System.out.println("card2 type: " + card2.type);
		System.out.println("card2 num: " + card2.num);
		System.out.println("card2 width: " + card2.width);
		System.out.println("card2 height: " + card2.height);
		
		
	}
}








