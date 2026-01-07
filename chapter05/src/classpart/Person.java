package classpart;

import java.util.Random;

public class Person {
	String name;
	float height;
	float weight;
	
	//생성자란 : 객체를 초기화 하여 생성해주는 역활을 한다.
	//디폴트 생성자가 존재하지 않으면 컴파일러가 자동으로 생성해준다.
	//단, 매개변수 생성자가 존재하고, 디폴트 생성자가 존재하지 않은태는
	//디폴트 생성자를 컴파일러가 자동으로 생성해 주지 않는다.
	//default 생성자
	//생성자 이름은 반드시 클래스 이름과 같아야한다.
			
	public Person() {} //기본생성자
	public Person(String name) {
		this.name = name;
	}
	public Person(float height,float weight) {
		this.height = height;
		this.weight = weight;
	}
		
		public static void main(String[] args) {
			//인스턴트
			//디폴트 생성자를 생성하지 않은 채로 아래처럼 기본생성자를 
			//객체화 할 수 없다.
			//이유는 이미 매개변수 생성자가 2개나 존재하므로
			//컴파일러가 디폴드 생성자를 자동으로 생성하지 않는다.
			//Person pe= new Person()
			Random ra = new Random();
			//Scanner 클래스는 디폴트 생성자가 존재하지 않는다
			//이유는 입력받는 inputstream이 키보드인지/네트워크인지
			//구분이 필려하기 때문이다.
			//고로 Scanner scan = new Scanner(System.in);
			//매개변수 생성자만 존재한다.
			//Scanner scan = new Scanner();
			//pe는 참조변수이다.
			//클래스는 반드시 객체화래서 사용해야 함을 주의하자!
			Person pe = new Person(); // 객체화 = 인스터스화
			Person pe02 =new Person("홍길동");
			Person pe03 =new Person(178,100);
			System.out.println(pe02.name);
			System.out.println(pe03.height);
			System.out.println(pe03.weight);
		}

		
}
