package multiexample;

import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] ids = {"qwer","aaa","abcd"};
		String[] pws = {"1111","2222","3333"};
		String[] items = {"사과","바나나","딸기","메론","수박","키위"};
		int MAX_SIZE = 100;
		int[][] cart = new int[ids.length][items.length]; 
		int[][] jang = new int[MAX_SIZE][2];
		int num =0; // 선택한 물품의 총 갯수
		boolean run = true; // 반복문 조건
		int state = -1; // 로그인 상태확인
		while(run){
			System.out.println("-------------------");
			System.out.print("상태 : ");
			if(state== -1) {
				System.out.println("로그아웃");
			}else {
				System.out.println(ids[state]);
			}
			System.out.println("-------------------");
			System.out.println("[GREEN MART]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt(); // 메뉴 선택 변수
			// 선택 메뉴별 출력항목 
			if(sel==1) {//로그인 선택시
				if(state== -1) {//로그인 체크 후 로그인 안한 상태일시
					// 아이디 비밀번호 입력
					System.out.print("ID입력 : ");
					String myID = scan.next();
					System.out.print("PW입력 : ");
					String myPW = scan.next();
					// 아이디 비번 확인
					int chk = 0; // 로그인 성공 여부 확인
					for(int i=0;i<ids.length;i++) {
						if(ids[i].equals(myID) && pws[i].equals(myPW)) { //아이디 비번이 맞을때
							System.out.printf("===%s님, 환영합니다===%n",myID);
							state=i; //상태를 아이디 index로 변경
							chk = 1;
						}
					}
					if(chk==0) {// 로그인 실패시
						System.out.println("===아이디와 비밀번호를 다시 확인해주세요===");
					}
					
				}else {// 이미 로그인이 된 상태일때
					System.out.println("===이미 로그인 중인 상태입니다===");
				}
			}else if(sel==2) {//로그아웃 선택시
				if(state!= -1) {//로그인 상태일시
					System.out.println("===로그아웃이 완료 되었습니다.===");
					state= -1;
				}else {//로그아웃 상태일시
					System.out.println("===이미 로그아웃 중인 상태입니다===");
				}
			}else if(sel==3) {//쇼핑 선택시
				if(state== -1) {//로그아웃 상태라면
					System.out.println("===로그인 이후 사용 가능한 서비스 입니다.===");
				}else { // 로그인 상태라면
					boolean shoping = true; // 쇼핑 반복 조건문
					while(shoping) {
						System.out.println("[상품목록]");
						for(int i=0;i<items.length;i++) {
							System.out.printf("[%d]%s%n",i+1,items[i]);
						}
						System.out.println("[0]뒤로가기");
						System.out.print("상품번호를 선택하세요 : ");
						int choice = scan.nextInt();// 상품번호 선택
						
						if(choice>=1 && choice<=items.length && num<MAX_SIZE) {//사과,바나나,딸기 선택시
							cart[state][choice-1]++;
							jang[num][0]=state;
							jang[num][1]=choice-1;
							num++;// 선택한 제품 수 증가
						}else if(choice==0) {//뒤로가기 선택시
							shoping=false;
						}else if((choice>=0 && choice<=items.length)==false){// 다른 번호 선택시
							System.out.println("===[1~4]번 항목에서 선택해주세요.===");
						}else {// 제품수 max 초과시 
							System.out.println("===상품을 최대로 선택하였습니다. 뒤로가기를 선택해주세요.===");
						}
					}
				}
			}else if(sel==4) {//장바구니 선택시
				if(state == -1) {//로그아웃 상태일때
					System.out.println("===로그인 이후 사용 가능한 서비스 입니다.===");
				}else {//로그인 상태일때
					System.out.println("--- 내 장바구니 목록 ---");
					for(int i=0;i<items.length;i++) {
						System.out.printf("%s: %d개%n",items[i],cart[state][i]);
					}
				}
			}else if(sel==0) {//종료선택시
				System.out.println("===종료===");
				run = false;
			}
		}
		scan.close();
	}

}
