package inheritance04;

public class GoldCustomer extends Customer{
	double salePoint;
	
	public GoldCustomer(String customerID,String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		this.customerGrade="GOLD";
		this.bonusRatio=0.02;
		this.salePoint=0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price*bonusRatio);
		return price - (int)(price*salePoint);
	}
	
	@Override
	public String showCustomrtInfo() {
		return super.showCustomrtInfo();
	}
}
