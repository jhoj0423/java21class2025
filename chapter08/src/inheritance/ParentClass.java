package inheritance;

public class ParentClass {
	//부모 클래스 
	protected int a=10;
	protected int b=20;
	
	
	public ParentClass() {
		System.out.println("== 부모생성자 ==");
	};
	public ParentClass(int a,int b) {
		this.a= a;
		this.b=b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	//메소드
	public void parentfun() {
		System.out.println("===parentfun===");
		System.out.println("부모 : "+a+","+b);
	}
	
}
