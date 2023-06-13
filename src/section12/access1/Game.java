package section12.access1;

// 추상클래스
public abstract class Game {
	public String title;
	public String genre;
	public int price;
	protected int player;
	public String console;
	
	
	// 구현되지 않은 추상메소드
	public abstract void setPlayer(int player);
	
	public int getPlayer() {
		return player;
	}
	
	public void getInfo() {
		System.out.println("title: " + title);
		System.out.println("genre: " + genre);
		System.out.println("price: " + price);
		System.out.println("player: " + player);
		System.out.println("console: " + console);
	}
	

}






