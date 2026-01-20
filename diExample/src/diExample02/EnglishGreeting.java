package diExample02;

public class EnglishGreeting implements Igreet{
	@Override
	public String greet(String name) {
		String result = " Hello, "+name+"!"; 
		return result;
	};
}
