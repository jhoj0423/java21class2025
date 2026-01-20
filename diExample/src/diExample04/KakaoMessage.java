package diExample04;

public class KakaoMessage implements IMessage{
	@Override
	public String SendMessage(String name,String txt) {
		String result = "["+name+"] 에게 ["+txt+"]를 카카오톡으로 전송"  ;
		return result;
	};
}
