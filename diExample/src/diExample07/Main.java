package diExample07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountCalculator d = new DiscountCalculator();
		d.applyDiscount(50000, new FixedDiscount());
		d.applyDiscount(40000, new PercentDiscount());
		d.applyDiscount(30000, new NoDiscount());
	}

}
