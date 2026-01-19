package otShop;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {
	Scanner scan = new Scanner(System.in);
	
	//카테고리는 String 자료형으로 ArrayList<>생성 할 것
	ArrayList<String> category = new ArrayList<String>();
	
	//전체 아이템리스트를 Item 자료형으로 ArrayList<>생성 할것
	ArrayList<Item> itemList = new ArrayList<Item>();
	
	// 장바구니 => Cart 클래스를 자료형으로 ArrayList<>생성
	ArrayList<Cart> jang = new ArrayList<Cart>();
	
	//객체화(=인스터스화)
	UserMenu user = new UserMenu();
	
	//디폴트 생성자
	public ItemManager() {info();};
	
	//itemList에 아이템을 추가하는 메소드=> ArrayList<>에서 추가하는 모소드 add()이다
	public void addItem(String name, int price,String category) {
		itemList.add(new Item(name,price,category));
	}
	
	//카테고리 추가 메소드
	public void info() {
		category.add("과자");		//index = 0
		category.add("생선");		//index = 1
		category.add("육류");		//index = 2
		category.add("음료수");	//index = 3
		addItem("새우깡",1000,category.get(0));
		addItem("고등어",2000,category.get(1));
		addItem("칸쵸",3600,category.get(0));
		addItem("소고기",6500,category.get(2));
		addItem("돼지고기",5500,category.get(2));
		addItem("콜라",1000,category.get(3));
		addItem("사이다",1500,category.get(3));
		addItem("새우",1800,category.get(1));
		addItem("양파링",200,category.get(0));
	}
	
	//카테고리 출력 메소드
	public void printCategory() {
		for(int i=0;i<category.size();i++) {
			System.out.println("["+i+"]"+category.get(i));
		}
	}
	
	// item 목록 출력 메소드
	public void printItemList() {
		for(int i=0;i<itemList.size();i++) {
			System.out.print("\n["+i+"]");
			itemList.get(i).PrintInfo();
		}
	}
	
	
	// 장바구니 
	//userid, 카테로기 번호, 아이템 아이디
	public void addCart(String usid, int caId, int itemId) {
		//이미장바구니에 아이템이 존재하는지 검사
		//이미 존재하면 수량누적, 가격 누적 필요함
		//Cart 인스턴스화
		int cnt = 0; //갯수
		int jangcnt = 0; // 장바구니에 중복된 데이터의 존재 유무 치트키
		int log = user.logindex; // UserMenu클래스의 로그인 된 log값을 static으로 고유
		Cart temp = new Cart(); // temp => 임시기억 장치
		temp.userId = usid;
		
		for(int i=0;i<itemList.size();i++) {
			//if(itemList.get(i).name.equals(temp.itemName)) {// 중복 검사
			if(itemList.get(i).name.equals(itemList.get(itemId).name)) {// 중복 검사
				jangcnt = 0;
				for(int j=0;j<jang.size();j++) { // =>현재 장바구니에 담긴 제품인가
					if(jang.get(j).itemName.equals(itemList.get(itemId).name) &&
							jang.get(j).userId.equals(user.id[log])) {
						jang.get(j).Quantity++;
						jang.get(j).price = jang.get(i).price * jang.get(j).Quantity;
					}
				}
			}
			if(jangcnt==0) { // 중복 없을때
				temp.itemName=itemList.get(i).name;
				temp.price = itemList.get(i).price;
				cnt+=1;
				temp.Quantity = cnt;
				jang.add(temp);
			}
		}
		
	}
	
	// 장바구니 인쇄
	public void printJang() {
		for(int i=0;i<jang.size();i++) {
			jang.get(i).PrintCart();
		}
	}
	
	
	//전체 item 추가 메소드
	public void addItem02(String addname, int addprice, int addcategory) {
		//Item클래스 추가 => add
		Item temp = new Item(addname, addprice, category.get(addcategory));
		itemList.add(temp);
	}
	
	public void delItem(int delIndex) {
		itemList.remove(delIndex);
	}
	
	//전제 item 수정 메소드
	public void itemUpdate(int indexNum,String upNum,int upPrice) {
		for(int i=0;i<itemList.size();i++) {
			itemList.get(indexNum).name = upNum;
			itemList.get(indexNum).price = upPrice;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
