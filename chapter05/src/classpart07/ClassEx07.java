package classpart07;

public class ClassEx07 {
	//멤버 변수, 생성자, 기능 메서드 작성
	String[] menu = {"치즈버거","불고기버거","감자튀김","콜 라"};
	int[] arPrice = {2500,3800,1500,1000};
	int[] cart = new int[menu.length]; // 갯수를 담을 변수
	int total = 0; // 총금액
	String name;
	
	//객체를 생성시 초기화에 필요한 디폴트 생성자
	//생성자 반드시 클래스이름과 동일해야 함
	public ClassEx07() {};
	//void는 반환할 값이 없는 메소드 생성할때 사용한다.
	public void printMenu() {
		System.out.println("      [맘스터치 햄버거]");
		for(int i=0;i<menu.length;i++) {
			System.out.printf("%d.%s    %d원%n",i+1,menu[i],arPrice[i]);
		}
		System.out.println("0.주문하기");
		System.out.println("----------------------------");
	}
	//메뉴 주문시 갯수 증가
	public void order(int sel) {
		cart[sel]++;
		System.out.println(cart[sel]+"추가됨");
	};
	//총 가격 계산 함수
	public void totalPrice() {
		total = 0;
		for(int i=0;i<arPrice.length;i++) {
			total += arPrice[i]*cart[i];
		}
	};
	//주문여부를 확인하는 메서드
	//반환할 값이 필요한 경우 받드시 데이터 타입으로 메소드를 작성한다.
	public boolean hasOrder() {
		for(int i=0;i<menu.length;i++) {
			if(cart[i]>0) {
				return true; //주문됨
			}
		}
		return false;//주문안됨
	}
	
	//영수증을 출력하는 함수
	public void printReceipt(int money) {
		System.out.println("============영수증============");
		System.out.println("           맘스터치");
		System.out.println("----------------------------");
		System.out.println("메뉴\t수량\t금액");
		for(int i=0;i<menu.length;i++) {
			if(cart[i]>0) {
				System.out.println(menu[i]+"\t"+cart[i]+"\t"+arPrice[i]);
			}
		}
		System.out.println("-------------------");
		System.out.println("총 금액 : "+total);
		System.out.println("받은돈"+money);
		System.out.println("잔돈"+(money-total));
		System.out.println("------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
