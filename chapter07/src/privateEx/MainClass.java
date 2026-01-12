package privateEx;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTest pt = new PrivateTest();
//		pt.day=10;
//		pt.month=20;
//		pt.year=2025;
		
		pt.setMonth(2);
		pt.setDay(30);
		pt.setYear(2025);
		
		//System.out.println(pt.year+"-"+pt.month+"-"+pt.day);
		//아님 수정은 불가능하고 출력은 가능 getter
		System.out.println(pt.getDay());
		System.out.println(pt.getMonth());
		System.out.println(pt.getYear());
	}

}
