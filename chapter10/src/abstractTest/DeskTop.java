package abstractTest;

public class DeskTop extends Computer{

	@Override // 부모 메서드를 상속받아 재 정의 한다는 의미
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop display() ---");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop typing() ---");
	}

}
