package diExample04;

public class EmailMessage implements IMessage{
	@Override
	public String SendMessage(String name,String txt) {
		String result = "["+name+"] 에게 ["+txt+"]를 이메일로 전송"  ;
		return result;
	};
}
