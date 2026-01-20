package diExample;

public class Mul implements Ical{
	public void mul(int num1,int num2) {
		int result = num1*num2;
		System.out.println(result);
	}
	@Override
	public int doOper(int num1,int num2) {
		int result =num1*num2;
		return result;
	}
	
}
