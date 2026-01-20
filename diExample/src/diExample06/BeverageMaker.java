package diExample06;

public class BeverageMaker {
	
	public void makeBeverage(IMake makeBeverage) {
		String result = makeBeverage.makeBeverage();
		System.out.println(result);
	}
}
