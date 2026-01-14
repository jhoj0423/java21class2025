package inheritance04;


public class Main {

	public static void main(String[] args) {
		Customer c = new Customer("0100","이성계");
		int price = c.calcPrice(10000);
		System.out.println("지불금액은 "+price+"이고"+c.showCustomrtInfo());
//		c.customer("0101","이성계");
//		c.calcPrice(10000);
//		c.showCustomrtInfo(10000);
		//상속을 받은 하위클래스는 상위클래스를 데이터 타입을 인스턴스화 할 수 있다.
		Customer v = new VipCustomer("0200","김길동",1010);
		System.out.println("지불금액은 "+v.calcPrice(price)+"이고"+v.showCustomrtInfo());
//		VipCustomer v = new VipCustomer();
//		v.customer("1010","김길동");
//		v.calcPrice(10000);
//		v.vipPring(10000);
		
		Customer g = new GoldCustomer("0300", "홍길동");
		System.out.println("지불금액은 "+g.calcPrice(price)+"이고"+g.showCustomrtInfo());
		Customer g2 = new GoldCustomer("0400","이율곡");
		System.out.println("지불금액은 "+g2.calcPrice(price)+"이고"+g2.showCustomrtInfo());
		System.out.println("=================================");
		System.out.println();

	}

}
