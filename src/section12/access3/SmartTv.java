package section12.access3;

public class SmartTv extends CableTv{
	
	@Override
	public void channel() {
		System.out.println("공영 + 케이블 + OTT 방송이 나와요!");
	}
	
	
	public void internet() {
		System.out.println("인터넷 검색이 됩니다.");
	}
}

