package arrayListTest;

public class Member {
	//멤버변수
	String name;
	String address;
	int age;
	
	//디폴트 생성자
	public Member() {}
	
	//메계변수가 포함된 생성자
	public Member(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
		//this는 Member클래스를 지칭
	}
	
	//출력 메서드
	public void printmember() {
		System.out.printf("이름 : %s%n주소 : %s%n나이 : %d%n",name,address,age);
	}
}
