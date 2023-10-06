package section11.access1;

public class SchoolBus extends Bus {
	
	@Override
	public void drive() {
		System.out.println("학생을 태우고 운전을 해요~");
	}
	
	public void stopPannel() {
		System.out.println("Stop!");
	}

}
