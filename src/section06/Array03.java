package section06;

public class Array03 {
	public static void main(String[] args) {
		// new 연산자 사용하지 않고 직접 배열 생성 및 값 대입하기
		String[] pokemons = {"피카츄", "라이츄", "파이리", 
				"꼬부기", "버터플", "야도란"};
		
		for(int i = 0; i < pokemons.length; i++) {
			System.out.println(pokemons[i]);
		}
		
		System.out.println("===============================");
		
		// 배열 값 수정하기
		pokemons[3] = "메타몽";
		
		// 확장for문, 향상된for문
		for(String pokemon : pokemons) {	
			// String pokemon = pokemons[0] 
			// String pokemon = pokemons[1] 
			// String pokemon = pokemons[2] 
			// String pokemon = pokemons[3] 
			// String pokemon = pokemons[4] 
			// String pokemon = pokemons[5] 
			System.out.println(pokemon);
		}
	}
}






