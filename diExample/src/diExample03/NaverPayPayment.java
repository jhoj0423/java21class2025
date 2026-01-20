package diExample03;

public class NaverPayPayment implements IPay{
	@Override
	public String pay(int money) {
		String result = "네이버페이로" +money +"원 결제 완료";
		return result;
	}
}
