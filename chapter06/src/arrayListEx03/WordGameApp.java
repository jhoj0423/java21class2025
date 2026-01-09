package arrayListEx03;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Player> pl = new ArrayList<Player>();
		Player nams = new Player();
		
		System.out.print("참가자 수를 입력하세요 :");
		int num = scan.nextInt();
		if(num>1) {
			for(int i=0;i<num;i++) {
				System.out.print((i+1)+"번 참가자의 이름: ");
				String name = scan.next();
				pl.add(new Player(name));
			}
		}
		boolean run = true;
		System.out.println("게임 시작!!");
		System.out.println("현재 단어 : 아버지");
		int cnt = 0;
		while(run) {
			String word = "아버지";
			for(int i=0;i<num;i++) {
				String p = pl.get(i).name;
				System.out.print(p +" >> ");
				String answer= scan.next();
				if(word.charAt(word.length()-1)==answer.charAt(0)) {
					word=answer;
					cnt++;
				}else {
					run=false;
					break;
				}
			}
		}
		System.out.println("게임 종료!!");
		String a = pl.get(cnt%num).name;
		System.out.println("진 참가자 : "+ a);

	}

}
