package otShop;

public class Item {
	//멤버변수
	String name; //제품이름
	int price; //제품가격
	String category; // 제품분류
	
	//디폴트 생성자
	
	public Item() {};
	
	//매개변수 생성자
	public Item(String name, int price, String category) {
		this.name = name;
		this.price=price;
		this.category = category;
	}
	
	//출력매소드
	
	public void PrintInfo() {
		System.out.println("["+name+"]"+"["+price+"]"+"["+category+"]");
	}
	
}
