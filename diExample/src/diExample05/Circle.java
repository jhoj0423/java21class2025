package diExample05;

public class Circle implements ICalculate{
	
//	public String calculate(int num1,int num2) {
//		double cla = num1*num1*3.14;
//		String result = "원의 면적 : "+cla;
//		return result;
//	};
	int num1;
	
	public Circle() {}
	public Circle(int num1) {
		this.num1=num1;
	}
	@Override
	public String calculate() {
		double cla = num1*num1*3.14;
		String result = "원의 면적 : " + cla;
		return result;
	}
}
