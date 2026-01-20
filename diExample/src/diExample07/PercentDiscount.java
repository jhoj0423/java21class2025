package diExample07;

public class PercentDiscount implements IDisCount{
	@Override
	public double discount(int money) {
		double result =money-(money*0.1);
		return result;
	}
}
