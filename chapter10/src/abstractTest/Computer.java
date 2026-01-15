package abstractTest;

public abstract class Computer {
	
	//추상 클래스 작성 이유
	// - 어떻게 구현해야 할지 구체적 방법을 모를때
	// 각하위 클래스에서 알아서 구현해야 할때 시영힌디/
	//  추상 클래스는 구현은 하지 않고 선언만 하는 메소드를 작성한다.
	// public abstract display(){body},=> body는 코트를 구현하는 부분
	
	public abstract void display(); // 추상메서드
	public abstract void typing();
	
	// 모두 공통으로 구현해야 되는 경우는 메소드로 작성한다.
	// 단, body => 코드를 구현하는 구현체까지 작성한다.
	// 구현체가 존재하는 메소드는 추상 메소드가 아니다.
	public void turnOn() {
		System.out.println("전원 ON");
	}
	public void turnOff() {
		System.out.println("전원 OFF");
	}
	
	
	
	
	
	
	
	
}
