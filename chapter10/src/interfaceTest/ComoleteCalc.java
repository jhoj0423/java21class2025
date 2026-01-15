package interfaceTest;

//Calculater 추상클래스를 extends로 상속 받는다.
public class ComoleteCalc  extends Calculater{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2 !=0) {
			return num1/num2;
		}
		return ERROR;
	}
	
	//extends는 구현체를 상속한다라는 의미이다
	
	//출력 메소드
	public void showInfo(){
		System.out.println("Clac 인터페이스 구현하겠습니다");
	}
	
	
	
	
}
