package capitalGame;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RunMain {

	public static void main(String[] args) {
		Game game = new Game();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
//		HashMap<String, String> cu = new HashMap<String, String>();
		Random ran = new Random();
//		cu.put("한국", "서울");
//		cu.put("미국", "워싱턴DC");
//		cu.put("중국", "베이징");
//		cu.put("일본", "도쿄");
//		cu.put("프랑스", "파리");
//		cu.put("러시아", "모스크바");
//		cu.put("그리스", "아테네");
//		cu.put("이탈리아", "로마");
		//int num = game.cu.size() + 1;
		
		game.PlayGame();
		
//		System.out.println("*** 수도 맞추기 게임을 시작합니다. ***");
//		while(true) {
//			System.out.println(game.cu);
//			System.out.print("입력: 1, 퀴즈: 2 , 종료 : 3 >>");
//			int Sel = scan.nextInt();
//			if(Sel==1) {
//				//g.AddCity();
//				System.out.println("현재"+game.cu.size()+"개 나라의 수도가 입력되어 있습니다.");
//				while(true) {
//		    		System.out.print("나라와 수도 입력"+num+">>");
//					String answer = scan2.nextLine();
//					
//					if(answer.equals("그만")) {
//						break;
//					}else if(game.cu.containsKey(answer)){
//						StringTokenizer st = new StringTokenizer(answer);
//						String c= st.nextToken();
//						String t= st.nextToken();
//						System.out.println(c+"는 이미 입력되었습니다");
//					}else {
//						StringTokenizer st = new StringTokenizer(answer);
//						String c= st.nextToken();
//						String t= st.nextToken();
//						
//						num++;
//					}
//		    	}
//			}else if(Sel==2) {
//				//g.PlayGame();
//				while(true) {
//					int Q = ran.nextInt(game.cu.size())+1;
//					String mon = null;
//					for(String s : game.cu.keySet()) {
//						mon=s;
//						break;
//					}
//					System.out.print(mon+"의 수도는?");
//				}
//			}else if(Sel==3) {
//				System.out.println("게임을 종료합니다");
//				break;
//			}else {
//				System.out.println("[1~3] 번의 메뉴 중 선택해주세요");
//			}
		
	}

}
