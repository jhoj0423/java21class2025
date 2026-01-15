package schedluer;

import java.util.Scanner;

public class SchedluerTest {

	public static void main(String[] args) {
		// Scanner 입력 L, P, R
		Scanner scan = new Scanner(System.in);
		System.out.println("전화 상담 배분 방식을 선택하세요 : R, L, P");
		// R또는 r, P또는 p, L 또는 ㅣ
		String ch = scan.next();
		Schedluer sch = null;
		
		if(ch.equals("R") || ch.equals("r")) {
			sch = new RoundRobin();
		}else if(ch.equals("P") || ch.equals("p")) {
			sch = new PriorityAllocation();
		}else if(ch.equals("L") || ch.equals("l")) {
			sch = new LeastJob();
		}else {
			System.out.println("없는 방식 입니다");
			return;
		}
		
		sch.getNextCall();
		sch.sendCallToAgent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
