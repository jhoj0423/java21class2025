package polymorphism;

public class Tiger extends Animal{
	
	@Override // 가상메서드, 오버라이딩이 되면 가상 메소드에 저장됨 열려주는 역활
	public void move() {
		System.out.println("호랑이는 네발로 뜁니다");
	}
}
