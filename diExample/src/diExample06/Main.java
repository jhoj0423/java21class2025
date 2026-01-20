package diExample06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeverageMaker b = new BeverageMaker();
		
		b.makeBeverage(new Americano());
		b.makeBeverage(new GreenTea());
		b.makeBeverage(new Latte());
		b.makeBeverage(new OrangeJuice());
	}

}
