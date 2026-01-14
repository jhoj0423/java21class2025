package omok;

public class GameElements {
	String[][] table = new String[13][13];// 화면에 출력될 오목판
	int[][] state = new int[13][13]; // 오목판 상태 확인
	
	int[] player1 = new int[2]; //플레이어 1의 승패을 담을 변수 => 초기값 0 0
	int[] player2 = new int[2]; //플레이어 2의 승패를 담을 변수 => 초기값 0 0
	
	//디폴트 생성자
	public GameElements () {
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table[i].length;j++) {
				if(state[i][j]==0) {// 선택전 화면은 +
					table[i][j]="-";
				}else if(state[i][j]==1) {//플레이어 1은 흑돌
					table[i][j]="●";
				}else if(state[i][j]==2) {//플레이어 2은 백돌
					table[i][j]="○";
				}
			}
		}
	}
	public void Gameset() {
		for(int i=0;i<state.length;i++) {
			for(int j=0;j<state[i].length;j++) {
				state[i][j]=0;
			}
		}
	} 
}
