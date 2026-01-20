package diExample02;

public class KoreanGreeting implements Igreet{
	@Override
	public String greet(String name) {
		String result = "안녕하세요,"+name+"님!"; 
		return result;
	};
}
