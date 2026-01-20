package diExample05;

public class Rectangle implements ICalculate{
	
//	public String calculate(int num1,int num2) {
//		double cla = num1*num2;
//		String result = "사각형의 면적 : "+cla;
//		return result;
//	};
	int num1;
	int num2;
	
	public Rectangle() {}
	public Rectangle(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	@Override
	public String calculate() {
		double cla = num1*num2;
		String result = "사각형의 면적 : "+cla;
		return result;
	}
}
