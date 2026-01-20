package diExample;

public class Div implements Ical{
	public void div(int num1,int num2) {
		int result = num2!=0?num1/num2:0;
		System.out.println(result);
	}
	@Override
	public int doOper(int num1,int num2) {
		int result =num2!=0?num1/num2:0;
		return result;
	}
	
}
