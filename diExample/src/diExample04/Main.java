package diExample04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSender M = new MessageSender();
		M.SendMessage("홍길동", "안녕하세요", new KakaoMessage());
		M.SendMessage("고길동", "감사해요", new EmailMessage());
		M.SendMessage("백동수", "잘있어요", new SmsMessage());
	}

}
