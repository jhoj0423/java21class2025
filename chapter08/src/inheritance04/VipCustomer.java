package inheritance04;

public class VipCustomer extends Customer{
	
	protected int agentId;
	double salePoint;
	
	public VipCustomer() {};
	public VipCustomer(String coustomerID,String customerName,int agentId) {
		super(coustomerID, customerName);
		customerGrade="VIP";
		bonusRatio=0.05;
		this.agentId=agentId;
		this.salePoint=0.1;
	};
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price*bonusRatio);
		return price - (int)(price*salePoint);
	}
	
	@Override
	public String showCustomrtInfo() {
		return super.showCustomrtInfo()+"\n, 담당 전문 상담은:" +agentId+"번 입니다";
	}
//	
//	public VipCustomer(String customerID,String customerName,String customerGrade) {
//		this.customerID = customerID;
//		this.customerName = customerName;
//		this.customerGrade = customerGrade;
//	};
//	public void customer(String customerID,String customerName) {
//		this.customerID = customerID;
//		this.customerName = customerName;
//		this.customerGrade = "VIP";
//	}
//	
//	public void vipPring(int price) {
//		System.out.printf("지불금액은 %d원이고, %s님의 등급은 %s이며, 보너스 포인트는 "+super.num.format(calcPrice(price))+"입니다%n",price,super.getCustomerName(),super.getCustomerGrade());
//		System.out.println("전문 상담은 "+super.getCustomerID()+"번입니다");
//	}
}
