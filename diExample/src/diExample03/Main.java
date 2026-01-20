package diExample03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor p = new PaymentProcessor();
		
		p.PayMoney(10000, new CreditCardPayment());
		p.PayMoney(20000, new Kakaopayment());
		p.PayMoney(30000, new NaverPayPayment());
	}

}
