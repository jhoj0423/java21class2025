package otomok;

public class GameElements {
	int player1Win=0; // 플레이어 1 승
	int player1Lose=0; // 플레이어 1 패
	int player2Win=0; // 플레이어 2 승
	int player2Lose=0; // 플레이어 2 패
	
	//가로, 세로 크기 13배열 선언
	String[][] checkerboard = new String[13][13];
	
	//오목판 크기를 벗어나면 예외처리하는 메소드
	public boolean isCheckPostion(int row,int column) {
		return row>=1 && row<=13 && column>=1 && column <=13;
	}
	
	//게임 시작 직후 -> 한판이 끝나고 새 게임 시작할 때
	public void setCheckboard() {
		for(int i=0;i<checkerboard.length;i++) {
			for(int j=0;j<checkerboard[i].length;j++) {
				checkerboard[i][j]="-";
			}
		}
	}
	
	//오목판 출력 => 돌 하나 놓을때 마다
	public void printCheckerboard() {
		System.out.println();
		for(int i=0;i<checkerboard.length;i++) {
			for(int j=0;j<checkerboard[i].length;j++) {
				System.out.print(checkerboard[i][j]+ " ");
			}
			System.out.println();
		}
	}
		
	//플레이어1이 돌을 놓을때 : 흑돌
	public void placeStone1(int row,int column) {
		checkerboard[column-1][row-1]="●";
	}
	//플레이어1이 돌을 놓을때 : 백돌
	public void placeStone2(int row,int column) {
		checkerboard[column-1][row-1]="○";
	}
	
	//오목의 기본 요건 (가로,세로,대각선) 돌이 5개이면
	//체크하는 함수를 생성
	public boolean fiveRowCheck() {
		int chk = -1;
		for(int i=0;i<checkerboard.length;i++) {
			for(int j=0;j<checkerboard[i].length-4;j++) {
				if(checkerboard[i][j].equals("●") 
					&& checkerboard[i][j+1].equals("●") 
					&& checkerboard[i][j+2].equals("●") 
					&& checkerboard[i][j+3].equals("●") 
					&& checkerboard[i][j+4].equals("●") 
					|| checkerboard[i][j].equals("○")
					&& checkerboard[i][j+1].equals("○")
					&& checkerboard[i][j+2].equals("○")
					&& checkerboard[i][j+3].equals("○")
					&& checkerboard[i][j+4].equals("○")
					) {
					chk=i;
				}
			}
			
		}
		for(int i=0;i<checkerboard.length-4;i++) {
			for(int j=0;j<checkerboard[i].length;j++) {
				if(checkerboard[i][j].equals("●") 
					&& checkerboard[i+1][j].equals("●") 
					&& checkerboard[i+2][j].equals("●") 
					&& checkerboard[i+3][j].equals("●") 
					&& checkerboard[i+4][j].equals("●") 
					|| checkerboard[i][j].equals("○")
					&& checkerboard[i+1][j].equals("○")
					&& checkerboard[i+2][j].equals("○")
					&& checkerboard[i+3][j].equals("○")
					&& checkerboard[i+4][j].equals("○")
					) {
					chk=i;
				}
			}
			
		}
		for(int i=4;i<checkerboard.length;i++) {
			for(int j=0;j<checkerboard[i].length-4;j++) {
				if(checkerboard[i][j].equals("●") 
						&& checkerboard[i-1][j+1].equals("●") 
						&& checkerboard[i-2][j+2].equals("●") 
						&& checkerboard[i-3][j+3].equals("●") 
						&& checkerboard[i-4][j+4].equals("●") 
						|| checkerboard[i][j].equals("○")
						&& checkerboard[i-1][j+1].equals("○")
						&& checkerboard[i-2][j+2].equals("○")
						&& checkerboard[i-3][j+3].equals("○")
						&& checkerboard[i-4][j+4].equals("○")
						) {
						chk=i;
					}
			}
			
		}
		for(int i=0;i<checkerboard.length-4;i++) {
			for(int j=0;j<checkerboard[i].length-4;j++) {
				if(checkerboard[i][j].equals("●") 
						&& checkerboard[i+1][j+1].equals("●") 
						&& checkerboard[i+2][j+2].equals("●") 
						&& checkerboard[i+3][j+3].equals("●") 
						&& checkerboard[i+4][j+4].equals("●") 
						|| checkerboard[i][j].equals("○")
						&& checkerboard[i+1][j+1].equals("○")
						&& checkerboard[i+2][j+2].equals("○")
						&& checkerboard[i+3][j+3].equals("○")
						&& checkerboard[i+4][j+4].equals("○")
						) {
						chk=i;
					}
			}
			
		}
		if(chk == -1) {
			return false;
		}else {
			return true;
		}
	}
	public boolean fiveColumnCheck() {
		int chk = -1;
		for(int i=0;i<checkerboard.length-4;i++) {
			for(int j=0;j<checkerboard[i].length;j++) {
				if(checkerboard[i][j].equals("●") 
					&& checkerboard[i+1][j].equals("●") 
					&& checkerboard[i+2][j].equals("●") 
					&& checkerboard[i+3][j].equals("●") 
					&& checkerboard[i+4][j].equals("●") 
					|| checkerboard[i][j].equals("○")
					&& checkerboard[i+1][j].equals("○")
					&& checkerboard[i+2][j].equals("○")
					&& checkerboard[i+3][j].equals("○")
					&& checkerboard[i+4][j].equals("○")
					) {
					chk=i;
				}
			}
			
		}
		
		if(chk == -1) {
			return false;
		}else {
			return true;
		}
	}
	public boolean fiveTopCheck() {
		int chk = -1;
		for(int i=4;i<checkerboard.length;i++) {
			for(int j=0;j<checkerboard[i].length-4;j++) {
				if(checkerboard[i][j].equals("●") 
						&& checkerboard[i-1][j+1].equals("●") 
						&& checkerboard[i-2][j+2].equals("●") 
						&& checkerboard[i-3][j+3].equals("●") 
						&& checkerboard[i-4][j+4].equals("●") 
						|| checkerboard[i][j].equals("○")
						&& checkerboard[i-1][j+1].equals("○")
						&& checkerboard[i-2][j+2].equals("○")
						&& checkerboard[i-3][j+3].equals("○")
						&& checkerboard[i-4][j+4].equals("○")
						) {
						chk=i;
					}
			}
			
		}
		if(chk == -1) {
			return false;
		}else {
			return true;
		}
	}
	public boolean fiveDownCheck() {
		int chk = -1;
		for(int i=0;i<checkerboard.length-4;i++) {
			for(int j=0;j<checkerboard[i].length-4;j++) {
				if(checkerboard[i][j].equals("●") 
						&& checkerboard[i+1][j+1].equals("●") 
						&& checkerboard[i+2][j+2].equals("●") 
						&& checkerboard[i+3][j+3].equals("●") 
						&& checkerboard[i+4][j+4].equals("●") 
						|| checkerboard[i][j].equals("○")
						&& checkerboard[i+1][j+1].equals("○")
						&& checkerboard[i+2][j+2].equals("○")
						&& checkerboard[i+3][j+3].equals("○")
						&& checkerboard[i+4][j+4].equals("○")
						) {
						chk=i;
					}
			}
			
		}
		if(chk == -1) {
			return false;
		}else {
			return true;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
