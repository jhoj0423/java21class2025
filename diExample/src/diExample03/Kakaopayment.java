package diExample03;

public class Kakaopayment implements IPay{
	@Override
	public String pay(int money) {
		String result = "카카오페이로" +money +"원 결제 완료";
		return result;
	}
}
