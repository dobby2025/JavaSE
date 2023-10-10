package section12.access1;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("야옹!");
	}

}
