package diExample03;

public class CreditCardPayment implements IPay{
	@Override
	public String pay(int money) {
		String result = "신용카드로" +money +"원 결제 완료";
		return result;
	}
}
