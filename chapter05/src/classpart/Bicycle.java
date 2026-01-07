package classpart;

public class Bicycle {
	String color;
	int price;
	
	public Bicycle() {}
	public Bicycle(String color , int price) {
		this.color = color;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("---info---");
		System.out.printf("color : %s%nprice : %d%n",color,price);
	}
	
	public static void main(String[] args) {
		Bicycle be = new Bicycle();
		Bicycle be01 = new Bicycle("red",100000);
		
		
		System.out.println("Bicycle cinstructor - I");
		be.showInfo();
		
		System.out.println();
		System.out.println("Bicycle cinstructor - II");
		be01.showInfo();
		
		
		
	}
}
