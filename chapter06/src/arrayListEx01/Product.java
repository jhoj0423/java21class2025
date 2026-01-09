package arrayListEx01;

public class Product {
	//멤버변수
	String fu;
	int price;
	
	//디폴트 생성자
	public Product() {};
	
	public Product(String fu,int price) {
		this.fu =fu;
		this.price=price;
	}
	//출력 메서드
	public void showMenuPrint() {
		System.out.printf("%s : %d원%n",fu,price);
	}
	
	
}
