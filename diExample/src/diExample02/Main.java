package diExample02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingService G = new GreetingService();
		
		G.greet("홍길동", new KoreanGreeting());
		G.greet("제임슨", new EnglishGreeting());
		G.greet("아이", new JapaneseGreeting());
	}

}
