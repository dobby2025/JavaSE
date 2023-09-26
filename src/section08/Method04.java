package section08;

public class Method04 {

	public static void main(String[] args) {
		
		String[] pokemons = {"피카츄", "라이츄", "파이리", "꼬부기"};
		printPokemons(pokemons);
		
	}
	
	// 4. 인자 배열타입 , 리턴 X 
	public static void printPokemons(String... pokemons) {
		
//		for(int i = 0; i < pokemons.length; i++) {
//			System.out.println(pokemons[i]);
//		}
		
		// 향상된 for문
		for(String pokemon : pokemons) {
			System.out.println(pokemon);
		}
		
	}
	
	

}
