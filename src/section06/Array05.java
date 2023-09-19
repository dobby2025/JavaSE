package section06;

public class Array05 {
	
	public static void main(String[] args) {
		// new 연산자 사용하지 않고 2중 배열 선언 및 대입하기
		int[][] nums = {
							{1, 2, 3}, 
							{4, 5, 6}, 
							{7, 8, 9}, 
							{10, 11, 12}
						};
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}




