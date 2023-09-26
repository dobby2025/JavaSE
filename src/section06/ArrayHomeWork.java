package section06;
/*

숙제!
							
 1  2  3  4  5  6  7		
 8  9  10 11 12 13 14		
 15 16 17 18 19 20 21		
 22 23 24 25 26 27 28		
 29 30 31 32 33 34 35		
 36 37 38 39 40 41 42		
 43 44 45 46 47 48 49	
 
 1. 2중배열 선언하고
 2. for문으로 1~49까지 대입하기
 3. 아래 번호대로 출력하기
 
결과>
1 2 8 15 9 3 4 10 16 22 29 23 17 11 5 6 12 18 24 30 36 43 37 31 25 19 13 7 14 20 26 32 38 44 45 39 33 27 21 28 34 40 46 47 41 35 42 48 49 


//	i  j 0  1  2  3  4  5  6	
//	0	 1  2  3  4  5  6  7		
//	1	 8  9  10 11 12 13 14		
//	2	 15 16 17 18 19 20 21		
//	3	 22 23 24 25 26 27 28		
//	4	 29 30 31 32 33 34 35		
//	5	 36 37 38 39 40 41 42		
//	6	 43 44 45 46 47 48 49	



힌트!

i											
0   1[0][0]								 			[i-j]
1   2[0][1]  8[1][0]						[j][i-j]  
2  15[2][0]  9[1][1]  3[0][2]						[i-j][j]
3   4[0][3] 10[1][2] 16[2][1] 22[3][0]		[j][i-j]
4  29[4][0] 23[3][1] 17[2][2] 11[1][3]  5[0][4]
5   6[0][5] 12[1][4] 18[2][3] 24[3][2] 30[4][1] 36[5][0]
6  43[6][0] 37[5][1] 31[4][2] 25[3][3] 19[2][4] 13[1][5] 7[0][6]

i j     0        1        2        3       4        5
7  14[1][6] 20[2][5] 26[3][4] 32[4][3] 38[5][2] 44[6][1]		  [i-6+j][6-j]
8  45[6][2] 39[5][3] 33[4][4] 27[3][5] 21[2][6]				[6-j][i-6+j]
9  28[3][6] 34[4][5] 40[5][4] 46[6][3]
10 47[6][4] 41[5][5] 35[4][6]
11 42[5][6] 48[6][5]
12 49[6][6]
 

*/
public class ArrayHomeWork {

	public static void main(String[] args) {
		
		int[][] array = new int[7][7];

		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				int value = i * 7 + j + 1;
				array[i][j] = value;
			}
		}
		
		
		for(int i = 0; i < 13; i++) {
			if(i < 7) {
				for(int j = 0; j < i + 1; j++) {
					if(i % 2 == 0) {
						System.out.print(array[i-j][j] + " ");
					} else {
						System.out.print(array[j][i-j] + " ");
					}
				}
			} else {
				for(int j = 0; j < 13 - i; j++) {
					if(i % 2 == 0) {
						System.out.print(array[6-j][i-6+j] + " ");
					} else {
						System.out.print(array[i-6+j][6-j] + " ");
					}
				}
			}
			
			System.out.println();
		}
	}

}







