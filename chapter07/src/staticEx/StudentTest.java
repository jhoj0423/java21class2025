package staticEx;

public class StudentTest {

	public static void main(String[] args) {
		// 객체화=인스터스화
		Student st01 = new Student();
//		System.out.println(st01.serialnum);
//		System.out.println(Student.serialnum);
//		System.out.println(st01.serialnum);
//		
		Student st02 = new Student();
//		st02.serialnum++;
		//아무리 st02참조변수 생성 다음에 serialNum을 누적해도
		//데이터 메모리 영역에서 값을 모든 참조변수에 공유하고 있다.
		System.out.println("st03 참조변수 ====");
		Student st03 = new Student();
		System.out.println(st01.studentId);
		System.out.println(st02.studentId);
		System.out.println(st03.studentId);
		
		//static 클래스 변수는 인스턴스화 하지 않아도 접근 가능
		System.out.println(Student.serialnum);
		
		
		

	}

}
