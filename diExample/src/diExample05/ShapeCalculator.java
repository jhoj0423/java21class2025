package diExample05;

public class ShapeCalculator {
	int num1;
	int num2;
	
	public ShapeCalculator() {
		
	};
	
//	public void calculate(int num1,int num2, ICalculate iCalculate) {
//		String result = iCalculate.calculate(num1, num2);
//		System.out.println(result);
//	}
	public void calculate(ICalculate iCalculate) {
		String result =iCalculate.calculate();
		System.out.println(result);
	}
	
}
