package example;

import java.util.Scanner;

public class LoopEx09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1=1111;
		int dbAcc2=2222;
		int dbPw1=1234;
		int dbPw2=5678;
		int dbMoney1 = 50000;
		int dbMoney2 = 70000;
		int addAcc =0;
		int addPw = 0;
		
		int state = 0; //로그인 상태확인
		boolean run = true; // 반복문 확인
		while(run == true) {
			System.out.printf("dbMoney1 = %d원%ndbMoney2 = %d원%n",dbMoney1,dbMoney2);
			if(state==0) {
				System.out.println("*상태 : 로그아웃");
			}else if(state==1) {
				System.out.println("*상태 : 로그인");
			}
			System.out.println("1.로그인\n2.로그아웃\n3.입금\n4.출금\n5.이체\n6.조회\n0.종료\n");
			int select = scan.nextInt();
			if(state==0) {
				
				//로그아웃 시 메뉴
				if(select==1) {//로그아웃 시 메뉴 1번 클릭
					System.out.print("계좌번호 입력 : ");
					addAcc= scan.nextInt();
					System.out.print("비밀번호 입력");
					addPw = scan.nextInt();
					if((addAcc==dbAcc1&&addPw==dbPw1)||(addAcc==dbAcc2&&addPw==dbPw2)) {
						System.out.println(addAcc+"님, 환영합니다.");
						state = 1;
					}else {
						System.out.println("====계좌번호와 비밀번호를 다시 확인해 주세요.====");
					}
				}else if(select==2) {//로그아웃 시 메뉴 2번 클릭
					System.out.println("====이미 로그아웃 상태 입니다====");
				}else if(select<=6 && select >=3) {//로그아웃 시 메뉴 3~6번 클릭
					System.out.println("====로그인 후 사용 가능한 서비스입니다====");
				}
				//로그인 시 메뉴
			}else if(state==1) {
				if(select==1) {//로그인 시 메뉴 1번 클릭
					System.out.println("====이미 로그인 중....===");
				}else if(select==2) {//로그인 시 메뉴 2번 클릭
					System.out.println("====로그아웃 되었습니다====");
					state = 0;
					addAcc=0;
					addPw=0;
				}else if(select==3) {//로그인 시 메뉴 3번 클릭
					System.out.print("입금할 금액 입력 : ");
					int money = scan.nextInt();
					if(addAcc==dbAcc1 ) {
						dbMoney1 += money;
					}else if(addAcc==dbAcc2 ){
						dbMoney2 += money;
					}
				}else if(select==4) {//로그인 시 메뉴 4번 클릭
					System.out.println("출금할 금액을 입력 : ");
					int money = scan.nextInt();
					if(addAcc==dbAcc1 && dbMoney1 >= money) {
						dbMoney1 -= money;
					}else if(addAcc==dbAcc2 && dbMoney2 >= money){
						dbMoney2 -= money;
					}else {
						System.out.println("====출금할 금액이 부족합니다====");
					}
					
				}else if(select==5) {//로그인 시 메뉴 5번 클릭
					System.out.println("이체할 계좌를 입력 : ");
					int gomoney = scan.nextInt();
					if((addAcc==dbAcc1 && gomoney==dbAcc2)||(addAcc==dbAcc2 && gomoney==dbAcc1)) {
						System.out.println("이체할 금액을 입력 : ");
						int money = scan.nextInt();
						if(addAcc==dbAcc1 && dbMoney1 >= money) {
							dbMoney2 += money;
							dbMoney1 -= money;
						}else if(addAcc==dbAcc2 && dbMoney2 >= money){
							dbMoney1 += money;
							dbMoney2 -= money;
						}else {
							System.out.println("====이체할 금액이 부족합니다====");
						}
					}else {
						System.out.println("====계좌번호를 다시 확인해 주세요====");
					}
					
					
				}else if(select==6) {//로그인 시 메뉴 6번 클릭
					System.out.printf("dbMoney1 = %d원%ndbMoney2 = %d원%n",dbMoney1,dbMoney2);
				}
			}//로그인 시 메뉴 종료
			if(select==0) {
				System.out.println("====종료====");
				run=false;
			}
		}//while문 종료
		scan.close();
	}

}
