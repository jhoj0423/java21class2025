package classpart07;

public class ClassEx07 {
	//멤버 변수, 생성자, 기능 메서드 작성
	String[] menu = {"치즈버거","불고기버거","감자튀김","콜 라"};
	int[] arPrice = {2500,3800,1500,1000};
	int[] cart = new int[menu.length]; // 갯수를 담을 변수
	int total = 0; // 총금액
	
	public ClassEx07() {}
	public ClassEx07(int[] cart) {
		
	}
	public int totalPrice(int total) {
		for(int i=0;i<arPrice.length;i++) {
			total += arPrice[i]*cart[i];
		}
		return total;
	}
	
}
