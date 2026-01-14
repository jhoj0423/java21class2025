package omok;

public class GameMain {

	public static void main(String[] args) {
		// 1. 가로세로는 13*13
		// 2. 플레이어는 2명
		// 3. 전적 출력 -> 전적을 담을 변수
		// 4. 기본은 0 , 플레이어 1이 선택시 1로 플레이어2가 선택시 2로 변경
		// 5. 위 경우에는 출력용 배열과 상태를 담을 변수 두가지 필요
		// 6. 승리 조건? => 가로,세로 5줄연속, 대각선 5개 연속 
		// => for[i][j] 중 i (j,j+1,j+2,j+3,j+4) 가 같거나 (i,i+1,i+2,i+3,i+4) j 가 같거나 
		// (i,i+1,i+2,i+3,i+4) (j,j+1,j+2,j+3,j+4) 같으면 승리
		Game g = new Game();
		g.ShowPrintGame();

	}

}
