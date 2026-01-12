package staticEx;

public class Student {

		// Static는 데이터 메모리 영역에 존재하며
		// 서로 다른 인스턴스에 같은 값을 값을 공유한다.
		// static 데이터 타입 변수 이름 => 클래스 변수라 칭한다
		static int serialnum = 1000;
		
		int studentId;
		String studentName;
		
		public Student() {
			serialnum ++;
			studentId = serialnum;
		}

	

}
