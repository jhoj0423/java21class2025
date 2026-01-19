package otShop;

public class Cart {
	//멤버변수
	//userId
	String userId; //구매한 유저 아이디
	String itemName; //구입한 제품 이름
	int price; // 구매한 제품의 가격
	int Quantity; // 구매수량
	
	public Cart() {};
	
	public Cart(String itemName,int price) {
		this.itemName=itemName;
		this.price = price;
	}
	
	//Cart 출력 메소드
	public void PrintCart() {
		System.out.println("["+userId+"]"+"항목 : " + itemName +", 금액 :"+ price+", 수량 : "+Quantity+"개");
		
	}
}
