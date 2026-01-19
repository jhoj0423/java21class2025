package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMap04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> point = new HashMap<>();
		
		System.out.println("* 포인트 관리 프로그램 입니다. *");
		while(true) {
			System.out.println("\n이름과 포인트 입력 >>");
			String plusPoint = scan.nextLine();
			
			if(plusPoint.equals("그만")) {break;}
			
			StringTokenizer st = new StringTokenizer(plusPoint);
			
			String name = st.nextToken().trim();
			Integer num = Integer.parseInt(st.nextToken().trim());
			
			if(point.containsKey(name)) {// 키 값이 존재한다면
				
				point.put(name, point.get(name)+num);
			}else {
				point.put(name, num);
			}
			for(String p :point.keySet()) {
				System.out.print("("+p+point.get(p)+")");
			}
		}
		System.out.println("포인트 관리 종료");
		
		
	}

}
