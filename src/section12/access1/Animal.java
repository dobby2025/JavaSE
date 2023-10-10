package section12.access1;

// 추상 클래스  Animal
public abstract class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	// 추상메서드
	public abstract void makeSound();
	
	// 일반메서드
	public void eat() {
		System.out.println(name + "이(가) 먹고 있습니다.");
	}

}
