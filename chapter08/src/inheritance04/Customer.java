package inheritance04;

import java.text.DecimalFormat;

public class Customer {
	protected String customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
//	
//	DecimalFormat num = new DecimalFormat("#,###");
//	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio=0.01;
	};
//	
//	public Customer(String customerID,String customerName,String customerGrade) {
//		this.customerID = customerID;
//		this.customerName = customerName;
//		this.customerGrade = customerGrade;
//	}
	public Customer(String customerID,String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio=0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint+=(price * bonusRatio);
		return price;
	}
	
	public String showCustomrtInfo() {
		return customerName +"님의 등급은"+customerGrade+"이며, 보너스 포인트는 " + bonusPoint;
	}
	
	
//	public void calcPrice(int price) {
//		double point = 0;
//		double pay =0;
//		if(getCustomerGrade().equals("SILVER")) {
//			point = price*0.01;
//			pay=price;
//		}else {
//			point = price*0.05;
//			pay = price*0.9;
//		}
//		
//		setBonusPoint(point);
//		System.out.println("보너스 포인트는"+point+"입니다");
//	}
//	public void showCustomrtInfo(int price) {
//		System.out.printf("지불금액은 %d원이고, %s님의 등급은 %s이며, 보너스 포인트는 "+num.format(calcPrice(price))+"입니다%n",price,getCustomerName(),getCustomerGrade());
//	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}
