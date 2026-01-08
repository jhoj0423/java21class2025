package classpart08;

import java.util.Scanner;

public class ClassEx08 {
	//멤버변수
	Scanner scan = new Scanner(System.in);
	String name = "";
	String[] arAcc= {"1111","2222","3333","4444","5555","","","","",""};
	String[] arPw= {"1234","2345","3456","4567","5678","","","","",""};
	int[] arMoney= {87000,34000,17500,98000,12500,0,0,0,0,0};
	
	int count = 5;
	
	// 3333로그인중
	int loginCheck = -1;
	
	public ClassEx08() {}
	//계좌 정보 출력
	public void showPrint() {
		System.out.println("------------------------");
		System.out.println("계좌번호  비밀번호  계좌잔액");
		System.out.println("------------------------");
		for(int i = 0 ;i<arAcc.length;i++) {
			if(arAcc[i]!="") {
				System.out.printf("%n%s   %s   %d",arAcc[i],arPw[i],arMoney[i]);
			}
		}
		System.out.println("\n------------------------");
		System.out.println();
		System.out.println("[Mega Bank]");
		System.out.print("상태 : ");
		if(loginCheck== -1) {
			System.out.println("로그아웃");
		}else {
			System.out.println(arAcc[loginCheck]+" 로그인 중");
		}
		System.out.println("[1]회원가입");
		System.out.println("[2]로그인");
		System.out.println("[3]로그아웃");
		System.out.println("[4]입금");
		System.out.println("[5]이체");
		System.out.println("[6]잔액조회");
		System.out.println("[0]종료");
		System.out.print("선택 : ");
	}
	//회원가입
	public void signup(){
		System.out.print("계좌 : ");
		String myId = scan.next();
		System.out.print("비번 : ");
		String myPw = scan.next();
		System.out.print("입금액 : ");
		int money = scan.nextInt();
		int success = 0;
		for(int i=0;i<arAcc.length;i++) {
			if(arAcc[i].equals(myId)) {// 계좌번호 중복확인
				success = 1;
				break;
			}
			if(success==0 && arAcc[i].equals("")) {// 빈값에 회원가입 한번하면 빠져나와라
				arAcc[i]=myId;
				arPw[i]=myPw;
				arMoney[i]=money+1000;
				break;
			}
		}
		if(success == 1) {
			System.out.println("=====회원가입에 실패 하였습니다=====");
		}
	}
	//로그인
	public void login() {
		if(loginCheck == -1) {//로그인 상태 확인
			System.out.print("계좌 : ");
			String myId = scan.next();
			System.out.print("비번 : ");
			String myPw = scan.next();
			
			int success = 0;
			for(int i=0;i<arAcc.length;i++) {
				if(arAcc[i].equals(myId) && arPw[i].equals(myPw)) {
					System.out.println("로그인 성공");
					loginCheck = i;
				}else {
					success = 1;
				}
			}
			if(success == 1) {
				System.out.println("==== 계좌번호를 다시 확인해 주세요 ====");
			}
		}else {
			System.out.println("==== 이미 로그인 상태입니다 ====");
		}
		
	}
	//로그아웃
	public void logout() {
		if(loginCheck != -1) {
			System.out.println("==== 로그아웃 ====");
			loginCheck = -1;
		}else {
			System.out.println("==== 로그인 후 이용하세요 ====");
		}
		
		
	}
	//입금
	public void addmoney(){
		if(loginCheck != -1) {//로그인 상태라면
			System.out.print("입금액 : ");
			int money = scan.nextInt();
			arMoney[loginCheck]+=money;
			System.out.println("==== 입금완료 ====");
		}else {
			System.out.println("==== 로그인 후 이용하세요 ====");
		}
	}
	//이체
	public void movemoney() {
		if(loginCheck != -1) {
			System.out.print("상대계좌 : ");
			String otherId = scan.next();
			System.out.print("금액 : ");
			int money = scan.nextInt();
			int chk = -1;
			for(int i=0;i<arAcc.length;i++) {
				if(arAcc[i].equals(otherId)!=false) {
					chk = 0;
				}
			}
			if(chk== -1) {
				System.out.println("=== 상대방의 계좌를 다시 확인해주세요 ===");
			}else {
				if(money>arMoney[loginCheck]) {
					System.out.println("=== 계좌잔액이 모자랍니다.===");
				}else {
					for(int i=0;i<arAcc.length;i++) {
						if(arAcc[i].equals(otherId)) {
							arMoney[i] += money;
							arMoney[loginCheck] -=money;
						}
					}
					System.out.println("=== 이체 성공 ===");
				}
			}
		}else {
			System.out.println("==== 로그인 후 이용하세요 ====");
		}
		
	}
	//잔액조회
	public void myMoney() {
		if(loginCheck != -1) {
			System.out.println("잔액 : "+ arMoney[loginCheck]);
		}else {
			System.out.println("==== 로그인 후 이용하세요 ====");
		}
		
	}
	
}
