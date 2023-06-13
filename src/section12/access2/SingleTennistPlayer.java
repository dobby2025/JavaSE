package section12.access2;

public class SingleTennistPlayer implements Tennis {
	

	@Override
	public void getPlayer() {
		System.out.println("조코비치");
	}

	@Override
	public void getSkill() {
		System.out.println("강도 높은 스트로크");
	}

	@Override
	public void getContury() {
		System.out.println("국적 세르비아");
	}
}
