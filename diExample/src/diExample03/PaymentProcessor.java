package diExample03;

public class PaymentProcessor {
	int money;
	
	public PaymentProcessor() {};
	
	public void PayMoney(int money,IPay pay) {
		String result = pay.pay(money);
		System.out.println(result);
	}
	
}
