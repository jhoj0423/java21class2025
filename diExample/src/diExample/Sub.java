package diExample;

public class Sub implements Ical{
	public void sub(int num1,int num2) {
		int result = num1-num2;
		System.out.println(result);
	}
	@Override
	public int doOper(int num1,int num2) {
		int result =num1-num2;
		return result;
	}
}
