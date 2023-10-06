package section11.access1;

public class Bus extends Car{
	
	@Override
	public void drive() {
		System.out.println("승객을 태우고 운전을 해요~");
	}
	
	public void clickBell() {
		System.out.println("삐~");
	}

}
