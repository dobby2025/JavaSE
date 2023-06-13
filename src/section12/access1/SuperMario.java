package section12.access1;

public class SuperMario extends Game {

	@Override
	public void setPlayer(int player) {
		if (player > 2) {
			System.out.println("2명이하 플레이 가능해요!!");
		} else {
			super.player = player;
		}
	}

}



