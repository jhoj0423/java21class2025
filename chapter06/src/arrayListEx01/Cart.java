package arrayListEx01;

import java.util.ArrayList;

public class Cart {
	ArrayList<Product> pro = new ArrayList<Product>();
	
	//초기화
	public Cart() {};
	
	//상품추가
	public void additem(Product p) {
		pro.add(p);
	}
	//상품삭제
	public void removeitem(int index) {
		pro.remove(index);
	}
	//총금액 계산
	public int total() {
		int money = 0;
		for(Product p:pro) {
			money+=p.price;
		}
		return money;
	}
	//출력 메서드
	public void showPrint() {
		for(Product p:pro) {
			p.showMenuPrint();
		}
	}
	
}
