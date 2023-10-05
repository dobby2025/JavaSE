package section09;

public class Book {
	// 속성
	public String title;	// 제목
	public int price;		// 가격
	public int totalPage;	// 쪽수
	public String author;	// 저자
	
	// 생성자
	public Book() {	
		this.title = "멘토씨리즈 자바";
		this.price = 32000;
		this.totalPage = 603;
		this.author = "김영우";
	}
	
	public void printInfo() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
		System.out.println("totalPage: " + totalPage);
		System.out.println("author: " + author);
	}

}
