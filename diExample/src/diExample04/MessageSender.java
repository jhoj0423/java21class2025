package diExample04;

public class MessageSender {
	String name;
	String txt;
	
	public MessageSender() {};
	
	public void SendMessage(String name,String txt,IMessage iMessage) {
		String result = iMessage.SendMessage(name,txt);
		System.out.println(result);
	}
}
