package diExample07;

import java.text.DecimalFormat;

public class DiscountCalculator {
	DecimalFormat de = new DecimalFormat("#");
	
	public void applyDiscount(int money, IDisCount dis) {
		
		String result = "원가 : "+money+"원, 할인가 : "+de.format(dis.discount(money))+"원";
		System.out.println(result);
	}
}
