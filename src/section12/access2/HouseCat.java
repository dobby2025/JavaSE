package section12.access2;

public class HouseCat implements Cat, Playable{
	public String name;
	
	public HouseCat(String name) {	// 객체생성 직전 호출되는 생성자
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println(name + " 이(가) 경계하면서 먹어요.");
	}

	@Override
	public void sleep() {
		System.out.println(name + " 이(가) 밤에 잠을 안자요! 언제자는지 몰라요.");
	}

	@Override
	public void hunt() {
		System.out.println(name+ " 이(가) 쥐를 사냥해요!!! 주인에게 선물해요!!!");
	}

	@Override
	public void play() {
		System.out.println(name+ " 이(가) 쥐를 가지고 놀아요.");
	}

}








