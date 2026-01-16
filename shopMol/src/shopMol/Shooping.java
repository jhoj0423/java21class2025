package shopMol;

import java.util.Scanner;

public class Shooping extends UserMenu{
	ItemManager ItemManager = new ItemManager(null);
	Scanner scan = new Scanner(System.in);
	//메뉴
	public void menu() {
		boolean run = true;
		
		while(run) {
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[0]종료");
			System.out.print("메뉴선택 : ");
			int sel = scan.nextInt();
			if(sel==1) {
				login();
			}else if(sel==2) {
				logout();
			}else if(sel==3) {
				shopMenu();
			}else if(sel==0) {
				run = false;
			}else {
				System.out.println("-----선택 메뉴는 목록에 존재하지 않습니다.------");
			}
		}
	};
	//쇼핑메뉴
	public void shopMenu() {
		if(super.log== -1) {
			System.out.println("----- 로그인 후 이용가능한 서비스 입니다.-----");
		}else {
			boolean shopping = true;// 쇼핑중 확인을 위한 
			while(shopping) {
				System.out.println("[1]쇼핑목록");
				System.out.println("[2]장바구니");
				System.out.println("[0]뒤로가기");
				System.out.print("\n메뉴 선택 : ");
				int shopSel = scan.nextInt();
				if(shopSel==1) {
					ItemManager.printCategory();
					System.out.println("쇼핑목록 선택 [뒤로가기 -1] :");
					int menuSel = scan.nextInt(); // 0 ~~
					if(menuSel == -1) {
						
					}else{
						//카테고리 번호가 menuSel인 제품 목록 출력
						int num=0; // 상품 앞자리 번호
						for(int i=0;i<ItemManager.itemList.size();i++) {
							if(ItemManager.itemList.get(i).category.equals(ItemManager.category.get(menuSel))) {
								System.out.print("["+num+"]");
								ItemManager.itemList.get(i).printInfo();
								num++;
							}else {
								num++;
							}
						}
						
						System.out.println("항목을 선택 : ");
						int itemSel = scan.nextInt();
						if(ItemManager.itemList.get(itemSel).category.equals(ItemManager.category.get(menuSel))) {
							jang[log][itemSel]++;
						}else {
							System.out.println("--- 선택한 제품이 목록에 존재하지 않습니다. ---");
						}
					}
					
				}else if(shopSel==2) {
					System.out.println("=========== 내 장바구니 ===========");
					for(int i=0;i<jang[log].length;i++) {
						if(jang[log][i] != 0) {
							System.out.printf("[%s]항목 : %s,금액 : %d, 수량 : %d개%n",id[log],ItemManager.itemList.get(i).name,ItemManager.itemList.get(i).price,jang[log][i]);
						}
						
					}
				}else if(shopSel==0) {
					shopping=false;
				}
			}
		}
	};
	//로그인 메서드
	public void login() {
		if(super.log== -1) {//로그아웃상태
			System.out.print("ID입력 : ");
			String myId = scan.next();
			System.out.print("PW입력 : ");
			String myPw = scan.next();
			for(int i=0;i<super.id.length;i++) {
				if(super.id[i].equals(myId) && super.pw[i].equals(myPw)) {
					super.log=i;
				}else if(super.id[i].equals("mmm") && super.pw[i].equals("111")) {
					//관리자메뉴 실행
					admin();
				}
			}
			if(super.log!= -1) {
				System.out.println("["+super.id[super.log]+"]님, 환영합니다.");
			}else {
				System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
			}
			
		}else {//로그인 상태
			System.out.println("-----이미 로그인 중인 상태입니다.------");
		}
	};
	//로그아웃 메서드
	public void logout(){
		if(super.log!= -1) {
			System.out.println("-----이미 로그아웃 중인 상태입니다.------");
		}else {
			System.out.println("-----안녕히계세요.------");
			super.log= -1;
		}
	};
	// 관리자 메뉴
	public void admin() {
		boolean adminrun = true;
		System.out.println("당신은 관리자 입니다.");
		while(adminrun) {
			System.out.println("[1]로그아웃");
			System.out.println("[2][아이템관리]");
			System.out.println("[3][장바구니리스트]\n");
			System.out.print("메뉴 선택 : ");
			int adSel = scan.nextInt();
			if(adSel==1) {
				
			}else if(adSel==2) {
				
			}else if(adSel==3) {
				
			}else {
				
			}
		}
	}
	//아이템 관리 메서드
	
	//장바구니리스트 메서드
	
	// 아이템 추가 메서드
	
	// 아이템 삭제 메서드
	
	// 아이템 수정 메서드
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
