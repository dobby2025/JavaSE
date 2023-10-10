package section13;

import section13.access2.BirdImpl;

public class OuterClass07 {
	public static void main(String[] args) {
		
		
		String name = new BirdImpl().getName();
		
		System.out.println("name: " + name);
		
	}
}
