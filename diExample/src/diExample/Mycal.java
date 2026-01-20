package diExample;

public class Mycal {
	
//	 1단계 : 계산기 클래스 생성
//	 2단계 : Mycal 클래스의 메소드들을 모듈화(부품화) 할 예정
//	 3단계 : 공통인터페이스로를 도입
//	 4단계 : DI(의존성 객체주입)
	
	
	// 더하기, 빼기, 곱하기, 나누기 메소드 작성
	// add , sub, mul,  div
	// 접근제어자 public
	//데이터 반환 없이 void이용
	//print문으로 출력 할 것
	// 메게변수 int num1, int num2를 이용해 작성
	
	int num1;
	int num2;
	
	public Mycal() {};
	
	public void gesan(int num1,int num2, Ical ical) {
		int result =ical.doOper(num1, num2);
		System.out.println("result"+result);
	}
//	
//	public void add(int num1,int num2, Ical ical) {
//		//Add adds = new Add();
//		//Ical ical = new Add(); 
//		int result =ical.doOper(num1, num2);
//		System.out.println(result);
//	}
//	
//	public void sub(int num1,int num2, Ical ical) {
//		//Ical ical = new Sub();
//		int result = ical.doOper(num1, num2);
//		System.out.println(result);
//	}
//	
//	public void mul(int num1,int num2, Ical ical) {
//		//Ical ical = new Mul();
//		int result = ical.doOper(num1, num2);
//		System.out.println(result);
//	}
//	
//	public void div(int num1,int num2, Ical ical) {
//		//Ical ical = new Div();
//		int result = ical.doOper(num1, num2);
//		System.out.println(result);
//	}
	
	
	
	
	
	
	
	
}
