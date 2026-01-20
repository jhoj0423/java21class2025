package diExample02;

public class JapaneseGreeting implements Igreet{
	@Override
	public String greet(String name) {
		String result = "곤니치와" + name + "상!"; 
		return result;
	};
}
