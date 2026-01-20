package diExample;

public class Add implements Ical{
	public void add(int num1,int num2) {
		int result =num1+num2;
		System.out.println(result);
	}
	
	//더하기 함수를 모듈화
	//부품화를 해야 되는 이유는 느슨한 결합이 되야하므로
	@Override
	public int doOper(int num1,int num2) {
		int result =num1+num2;
		return result;
	}
}
