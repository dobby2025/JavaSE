package section12;

import section12.access4.Card;

public class StaticClass01 {
	public static void main(String[] args) {
		
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.getInfo();
		card2.getInfo();
		
		System.out.println("========================");
		
		Card.width = 72;
		Card.height = 99;
		
		card2.type = "Heart";
		card2.number = "7";
		
		card1.getInfo();
		card2.getInfo();
		
		
		
	}
}
