package section12.access2;

public class PersianCat implements Cat {
	public String name;
	

	@Override
	public void eat() {
		System.out.println(name + " 이(가) 교양있게 먹어요.");
	}

	@Override
	public void sleep() {
		System.out.println(name + " 이(가) 우아하게 잡니다.");
	}

	@Override
	public void hunt() {
		System.out.println(name + " 이(가) 도도하게 사냥합니다.");
	}

}




