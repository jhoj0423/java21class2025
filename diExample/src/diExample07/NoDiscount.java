package diExample07;

public class NoDiscount implements IDisCount{
	@Override
	public double discount(int money) {
		double result =money;
		return result;
	}
}
