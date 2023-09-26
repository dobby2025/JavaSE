package section08;

public class Method08 {
	
	public static void main(String[] args) {
		int num = 10;
		valTest(num);
		System.out.println(num);
		
		System.out.println("========================");
		
		int[] values = {1, 2, 3, 4, 5};
		
		refTest(values);
		
		for(int value : values) {
			System.out.println(value);
		}
	}
	
	public static void valTest(int num) {
		num = 4;
	}
	
	public static void refTest(int[] values) {
		values[1] = 10;
	}
	
	

}
