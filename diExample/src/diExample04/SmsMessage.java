package diExample04;

public class SmsMessage implements IMessage{
	@Override
	public String SendMessage(String name,String txt) {
		String result = "["+name+"] 에게 ["+txt+"]를 SMS로 전송"  ;
		return result;
	};
}
