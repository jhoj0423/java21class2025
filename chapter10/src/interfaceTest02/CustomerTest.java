package interfaceTest02;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus = new Customer();
		Buy buy = cus;
		Sell sell = cus;
		
		buy.buy();
		sell.sell();
		
		buy.order();
		sell.order();
		cus.order();
	}

}
