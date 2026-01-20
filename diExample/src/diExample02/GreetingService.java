package diExample02;

public class GreetingService {
	String name;
	
	public GreetingService() {}
	
	public void greet(String name,Igreet igreet) {
		String result = igreet.greet(name);
		System.out.println(result);
	}
}
