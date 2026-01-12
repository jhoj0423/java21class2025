package staticEx;

public class MainClass {

	public static void main(String[] args) {
		StaticEx01 s1 = new StaticEx01("박찬호");
		
		
		s1.plus(1);
		System.out.println("atm : "+s1.money);
		System.out.println("name :"+s1.name);
		System.out.println("atm : "+s1.money);
		
		System.out.println("---------------");
		StaticEx01 s2 = new StaticEx01("이승엽");
		s2.plus(2);
		System.out.println("atm : "+s2.money);
		System.out.println("name : "+s2.name);
		System.out.println("atm : "+s2.money);
		s2.minus(1);
		System.out.println("atm : "+s2.money);
		
		

	}

}
