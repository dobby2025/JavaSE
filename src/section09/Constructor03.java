package section09;

public class Constructor03 {
	public static void main(String[] args) {
		AniCharacter aniChar1 = new AniCharacter();
		aniChar1.printInfo();
		
		System.out.println("=========================");
		String[] items = {"또치", "도우너", "마이콜"};
		AniCharacter aniChar2 = new AniCharacter(
											"둘리", 
											"아기공룡 둘리", 
											"ENFP", 
											items
											);
		aniChar2.printInfo();
		
		System.out.println("==========================");
		
		String[] friends = {"진구", "이슬이", "퉁퉁이", "비실이"};
		new AniCharacter(friends);
		
	}

}




