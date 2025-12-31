package chapter03;

import java.util.Scanner;

public class LoopEx07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbAcc2 = 2222;
		int dbPw1 = 1234;
		int dbPw2 = 5678;
		int state = 0;// 로그인 상태 확인
		boolean run = true;
		while(run==true) {
			System.out.println("1.로그인 \n2로그아웃 \n0.종료 \n메뉴 선택 : ");
			int select = scan.nextInt();
			if(state==0 && select==2) {
				System.out.println("로그아웃 상태입니다");
			}else if(state==1 && select==1){
				System.out.println("로그인 상태입니다");
			}
			if(select==1 && state==0) {
				System.out.print("계좌번호 입력 : ");
				int addAcc = scan.nextInt();
				System.out.print("비밀번호 입력 : ");
				int addPw = scan.nextInt();
				if((dbAcc1==addAcc && dbPw1==addPw)||(dbAcc2==addAcc && dbPw2==addPw)) {
					System.out.println(addAcc+"님, 환영합니다.");
					state=1;
				}else {
					System.out.println("계좌번호와 비밀번호를 다시 확인해 주세요");
				}
				
			}else if(select == 2 && state ==1) {
				System.out.println("로그아웃 되었습니다.");
				state = 0;
				
			}else if(select == 0) {
				System.out.println("종료");
				run=false;
			}
		}
		
		
		
		
		scan.close();
	}

}
