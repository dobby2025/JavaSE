package section09;

public class Movie {
	public String title;		// 제목
	public String genre;		// 장르
	public int runTime;			// 상영시간
	
	public Movie(String title, String genre, int runTime) {
		this.title = title;
		this.genre = genre;
		this.runTime = runTime;
	}
	
	public void printInfo() {
		System.out.println("title: " + title);
		System.out.println("genre: " + genre);
		System.out.println("runTime: " + runTime);
	}

}




