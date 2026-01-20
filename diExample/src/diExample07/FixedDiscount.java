package diExample07;

public class FixedDiscount implements IDisCount{
	@Override
	public double discount(int money) {
		double result =money>5000?money - 5000:0;
		return result;
	}
}
