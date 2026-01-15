package interfaceExample03;

public class Circle implements Shape{
	int radius; //반지름
	double PI = 3.14; 
	
	public Circle (int radius) {
		this.radius=radius;
	};
	
	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}
	@Override
	public double getArea() {
		double Area = radius*radius*PI;
		return Area;
	}
	
	@Override
	public void redraw() {
		System.out.println("--- 다시 그립니다.");
	};

	
}
