package staticEx;

public class StaticEx01 {
	static int money = 0;
	String name;
	
	public StaticEx01() {
		
	}
	public StaticEx01(String name) {
		this.name=name;
	}
	
	public void plus(int m) {
		money+= m*100;
		
	}
	
	public void minus(int m) {
		money-=m*100;
		
	}
	
	
	
}
