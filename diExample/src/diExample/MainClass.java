package diExample;

public class MainClass {

	public static void main(String[] args) {
		// Mycal 객체화
		Mycal cal = new Mycal();
		
//		cal.add(20,10);
//		cal.sub(20,10);
//		cal.mul(20,10);
//		cal.div(20,10);
		cal.gesan(20,10,new Add());
		cal.gesan(20,10,new Sub());
		cal.gesan(20,10,new Mul());
		cal.gesan(20,10,new Div());

	}

}
