package otomok;

import java.util.Scanner;
	
public class Game {
	Scanner scan = new Scanner(System.in);
	// 게임 엘리먼트 객체화
	GameElements game = new GameElements();
	boolean run = true;
	int menu = -1;
	
	public void menu() {
		while(run) {
			System.out.println("[오목]");
			System.out.println("[1]게임시작");
			System.out.println("[2]전전확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				playgame();
				run = true;
				break;
			case 2:
				showGameRecord();
				break;
			case 0:
				run = false;
				System.out.println("게임종료");
				break;
			}
		}
	}
	
	public void playgame(){
		System.out.println("오목게임 시작(플레이어1 흑돌,플레이어2 벽돌)");
		game.setCheckboard();
		game.printCheckerboard();
		
		while(run) {
			System.out.println("플레이어 1 차례 - 놓을 위치를 선택");
			while(true) {
				System.out.println("세로(1~13 - 놓을 위치를 선택)");
				int row = scan.nextInt();
				System.out.println("가로(1~13 - 놓을 위치를 선택)");
				int column = scan.nextInt();
				
				//오목판 크기의 예외처리
				//isCheckPostion(행,열)의 false크기를 벗어난 경우임
				if(!game.isCheckPostion(row, column)) {
					System.out.println("오목판을 벗어났습니다 다시확인해주세요");
					continue;
				}
				if(!game.checkerboard[column-1][row-1].equals("-")) {
					System.out.println("이미 돌이 놓아져 있습니다");
				}else {
					game.placeStone1(row, column);
					game.printCheckerboard();
					if(game.fiveRowCheck()) {
						System.out.println("게임 끝 : 플레이어1 승리");
						game.player1Win++;
						game.player2Lose++;
						run=false;
					}
				}
				break;
			}
			if(game.fiveRowCheck()==false) {
				System.out.println("플레이어2 차례 - 놓을 위치를 선택");
				while(true) {
					System.out.println("세로(1~13 - 놓을 위치를 선택)");
					int row = scan.nextInt();
					System.out.println("가로(1~13 - 놓을 위치를 선택)");
					int column = scan.nextInt();
					if(!game.isCheckPostion(row, column)) {
						System.out.println("오목판을 벗어났습니다 다시확인해주세요");
						continue;
					}else {
						if(!game.checkerboard[column-1][row-1].equals("-")) {
							System.out.println("이미 돌이 놓아져 있습니다");
						}else {
							game.placeStone2(row, column);
							game.printCheckerboard();
							if(game.fiveRowCheck()) {
								System.out.println("게임 끝 : 플레이어2 승리");
								game.player2Win++;
								game.player1Lose++;
								run=false;
							}
						}
						break;
					}
				}
			}
		}
	};
	
	//전적 출력 함수
	public void showGameRecord(){
		System.out.println("플레이어1 : "+game.player1Win+"승"+game.player1Lose+"패");
		System.out.println("플레이어2 : "+game.player2Win+"승"+game.player2Lose+"패");
	};
}
