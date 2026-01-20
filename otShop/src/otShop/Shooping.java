package otShop;

import java.util.Scanner;

public class Shooping extends UserMenu{
	// 쇼핑메뉴 메소드
	// 인스턴스화
	ItemManager it = new ItemManager();
	Scanner scan = new Scanner(System.in);
	String menu = "[1]로그인\n[2]로그아웃\n[3]쇼핑\n[0]종료\n";
	String mageMenu = "[1]로그아웃\n[2][아이템관리]\n[3][장비구니리스트]\n";
	String itemMenu = "[1][item추가]\n[2][item삭제]\n[3][item수정]\n[0]종료\n";
	
	//디폴트 생성자
	public Shooping() {};
	//메뉴
	public void menu() {
		while(true) {
			System.out.println();
			System.out.println(menu);
			System.out.println("메뉴선택 : ");
			int select = scan.nextInt();
			
			if(select==1) {
				//login(); 메소드 만들예정
				login();
				if(log==0) {
					//managerMenu(); 만들 예정
					managerMenu();
				}
			}else if(select==2){
				//logout(); 메서드 만들 예정
				logout();
			}else if(select==3) {
				//쇼핑은 반드시 로그인 상태이어야 함
				if(log<0) {
					System.out.println("로그인 후 이용가능");
				}else {
					//로그인 상태 : log > 0
					//shopMenu()메소드 만들예정
					shopMenu();
				}
			}else if(select==0){
				System.out.println("쇼핑몰 종료");
				break;
			}else {
				System.out.println("[0~3]번 메뉴중 선택해주세요");
			}
		}
	};
	
	//쇼핑메뉴 메소드
	public void shopMenu() {
		while(true) {
			System.out.println();
			System.out.println("[1]쇼핑목록\n[2]장바구니\n[0]뒤로가기\n");
			int sel = scan.nextInt();
			if(sel==0) {
				break;
			}else if(sel==1) {
				it.printCategory();
				System.out.println("쇼핑목록 선택 [뒤로가기 -1]");
				int caId = scan.nextInt();
				
				int n=0;
				for(int i=0;i<it.itemList.size();i++) {
					if(it.category.get(caId).equals(it.itemList.get(i).category)) {
						//카테고리 인덱스 번호가 존재하지 않을때
						System.out.print("["+i+"]");
						it.itemList.get(i).PrintInfo();
					}
				}
				System.out.println("항목을 선택 : ");
				int itemId = scan.nextInt();
				//항목 추가 => 장바구니 카트에 내가산 항목 추가
				it.addCart(super.id[log], caId, itemId);
			}else if(sel == 2) {
				System.out.println("============= 내 장바구니 ================");
				for(int i=0;i<it.jang.size();i++) {
					//로그인 한 id가 장바구니 id하고 같은지 예외처리
					//현재 jang에 물건을 산 고객의 id별로 담겨있다
					if(it.jang.get(i).userId.equals(id[log])) {
						it.jang.get(i).PrintCart();
					}
				}
				System.out.println("=======================================");
			}
		}
	}
	
	// 관리자 메뉴 메소드
	
	public void managerMenu() {
		while(true) {
			System.out.println();
			System.out.print(mageMenu);
			System.out.print("메뉴 선택");
			int sel = scan.nextInt();
			
			if(sel==1) {
				logout();
				break;
			}else if(sel==2){
				// 아이템관리 itemmage()메소드 만들 예정
				itemmage();
			}else if(sel==3) {
				System.out.println("================== 장바구니 리스트 ===================");
				it.printJang();
				System.out.println("=================================================");
			}else {
				System.out.println("[1~3]메뉴중 선택해주세요");
			}
		}
	}
	
	//아이템 관리 메뉴
	public void itemmage() {
		while(true) {
			
			System.out.println();
			System.out.println(itemMenu);
			System.out.println("메뉴선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("추가할 item이름 입력");
				String addname = scan.next();
				System.out.println("추가할 item금액 입력");
				int addprice = scan.nextInt();
				System.out.println("추가할 item의 category번호를 입력");
				int addcategory = scan.nextInt();
				it.addItem02(addname, addprice, addcategory);
				//상품 목록 출력
				it.printItemList();
			}else if(sel==2) {
				System.out.println("삭제할 item 번호를 입력");
				int deleteindex = scan.nextInt();
				it.delItem(deleteindex);
				it.printItemList();
				
			}else if(sel==3) {
				System.out.println("수정할 item의 번호를 입력");
				int indexNum = scan.nextInt();
				System.out.print("수정할 item의 이름을 입력");
				String updatename = scan.next();
				System.out.println("수정할 item의 금액을 입력");
				int updateprice = scan.nextInt();
				it.itemUpdate(indexNum, updatename, updateprice);
				it.printItemList();
			}else if(sel==0) {
				System.out.println("아이템 관리 종료");
				break;
			}else {
				System.out.println("[0~3]번 메뉴 중 선택해 주세요");
			}
		}
	}
	
	
	// 로그인 메소드
	
	public void login() {
		if(log>-1) {
			System.out.println("이미 로그인중");
		}else {
			log = super.UserLog();
		}
	}
	
	//로그아웃 메소드
	
	public void logout() {
		if(log>-1) {
			System.out.println("로그아웃 되었습니다");
			log= -1;
		}else {
			System.out.println("이미 로그아웃 상태입니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
