package omok;

import java.util.Scanner;

public class Game {
	GameElements game = new GameElements();
	Scanner scan = new Scanner(System.in);
	
	//디폴트 생성자
	public Game() {};
	
	//화면 출력문
	public void ShowPrintGame() {
		boolean run = true;
		
		while(run) {
			System.out.println("[오목]");
			System.out.println("[1]게임시작");
			System.out.println("[2]전전확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel==1) {
				PlayGame();
			}else if(sel==2) {
				WinInfo();
			}else if(sel==0) {
				System.out.println("게임종료");
				run = false;
			}else {
				System.out.println("[0~2]번 메누중에서 선택해 주세요");
			}
			
		}
	}
	
	//게임 진행문
	public void PlayGame() {
		System.out.println("오목 게임 시작 (플레이어1 : 흑돌, 플레이어2 : 백돌)");
		boolean play = true;
		int turn = 1;
		game.Gameset();
		while(play) {
			
			for(int i=0;i<game.table.length;i++) {
				for(int j=0;j<game.table[i].length;j++) {
					if(game.state[i][j]==1) {
						game.table[i][j]="●";
					}else if(game.state[i][j]==2) {
						game.table[i][j]="○";
					}
					System.out.print(" "+game.table[i][j]+" ");
				}
				System.out.print("\n");
			}
			if(turn%2 == 1) {
				System.out.println("플레이어1 차례 - 놓을 위치를 선택");
				System.out.print("세로(1~13) [0 기권] : ");
				int ver = scan.nextInt();
				if(ver==0) {
					System.out.println("게임 끝 : 플레이어 2 승리");
					game.player1[1]++;
					game.player2[0]++;
					play=false;
					return;
				}
				System.out.print("가로(1~13) [0 기권] : ");
				int hor = scan.nextInt();
				if(hor==0) {
					System.out.println("게임 끝 : 플레이어 2 승리");
					game.player1[1]++;
					game.player2[0]++;
					play=false;
					return;
				}
				if((ver>0 && ver<=13) && (hor>0 && hor<=13) && game.state[hor-1][ver-1]==0) {
					game.state[hor-1][ver-1] = 1;
					turn++;
				}else {
					System.out.println("위치 정보가 잘못되었습니다.");
				}
				
			}else {
				System.out.println("플레이어2 차례 - 놓을 위치를 선택");
				System.out.print("세로(1~13) [0 기권] : ");
				int ver = scan.nextInt();
				if(ver==0) {
					System.out.println("게임 끝 : 플레이어 1 승리");
					game.player1[0]++;
					game.player2[1]++;
					play=false;
					return;
				}
				System.out.print("가로(1~13) [0 기권] : ");
				int hor = scan.nextInt();
				if(hor==0) {
					System.out.println("게임 끝 : 플레이어 1 승리");
					game.player1[0]++;
					game.player2[1]++;
					play=false;
					return;
				}
				if((ver>0 && ver<=13) && (hor>0 && hor<=13)&& game.state[hor-1][ver-1]==0) {
					game.state[hor-1][ver-1] = 2;
					turn++;
				}else {
					System.out.println("위치 정보가 잘못되었습니다.");
				}
			}
			int win = -1;
			int wincnt =0;
			for(int i=0;i<game.table.length;i++) {// 가로 5개가 같은때 비교
				for(int j=0;j<game.table[i].length-4;j++) {
					
					if(game.state[i][j]!= 0 
							&&(game.state[i][j]==game.state[i][j+1]
							&&game.state[i][j]==game.state[i][j+2]
							&&game.state[i][j]==game.state[i][j+3]
							&&game.state[i][j]==game.state[i][j+4])) {
						win = game.state[i][j];
					}
				}
			}
			for(int i=0;i<game.table.length-4;i++) {// 세로 5개가 같은때 비교
				for(int j=0;j<game.table[i].length;j++) {
					if(game.state[i][j]!= 0 
						&& (game.state[i][j]==game.state[i+1][j]
						&&game.state[i][j]==game.state[i+2][j]
						&&game.state[i][j]==game.state[i+3][j]
						&&game.state[i][j]==game.state[i+4][j])) {
						win = game.state[i][j];
					}
				}
			}
			for(int i=4;i<game.table.length;i++) {// 대각선 우상 5개
				for(int j=0;j<game.table[i].length-4;j++) {
					if(game.state[i][j]!= 0 
							&& (game.state[i][j]==game.state[i-1][j+1]
									&&game.state[i][j]==game.state[i-2][j+2]
									&&game.state[i][j]==game.state[i-3][j+3]
									&&game.state[i][j]==game.state[i-4][j+4])) {
							win = game.state[i][j];
						}
					}
			}
			for(int i=0;i<game.table.length-4;i++) {// 대각선 좌상 5개
				for(int j=0;j<game.table[i].length-4;j++) {
					
				if(game.state[i][j]!= 0 
					   &&(game.state[i][j]==game.state[i+1][j+1]
					   &&game.state[i][j]==game.state[i+2][j+2]
					   &&game.state[i][j]==game.state[i+3][j+3]
					   &&game.state[i][j]==game.state[i+4][j+4])) {
						win = game.state[i][j];
					}
				}
			}
			if(win==1) {
				System.out.println("게임 끝 : 플레이어 "+win+" 승리");
				game.player1[0]++;
				game.player2[1]++;
				play=false;
			}else if(win==2) {
				System.out.println("게임 끝 : 플레이어 "+win+" 승리");
				game.player1[1]++;
				game.player2[0]++;
				play=false;
			}
			
		}
	}
	//전적확인문
	public void WinInfo() {
		System.out.println("플레이어 1 :"+game.player1[0]+"승 "+game.player1[1]+"패");
		System.out.println("플레이어 1 :"+game.player2[0]+"승 "+game.player2[1]+"패");
		
	}
	
	
}
