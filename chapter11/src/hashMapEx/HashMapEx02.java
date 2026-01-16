package hashMapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Location> has = new HashMap<String, Location>();
		System.out.println("도시, 경도, 위도를 입력하세요.");
		
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String loc = scan.nextLine();
			StringTokenizer st = new StringTokenizer(loc,",");
			String twon = st.nextToken().trim();
			String we = st.nextToken();
			String g = st.nextToken();
			Location a2 = new Location(twon,we,g);
			has.put(twon, a2);
		}
		
		System.out.println("----------------------------");
//		for(Location l : lo) {
//			l.showPrint();
//		}
		for(String keytwon: has.keySet()) {
			Location loca = has.get(keytwon);
			System.out.println(loca.weg());
		}
		System.out.println("----------------------------");
		while(true) {
			System.out.print("도시 이름 >>");
			String twonSel = scan.next();
			if(twonSel.equals("그만")) {
				break;
			}else if(has.containsKey(twonSel)){
				System.out.println(has.get(twonSel));
			}else {
				System.out.println(twonSel+"은 없습니다.");
			}
		}
		System.out.println("정보 검색 종료");
	scan.close();	
	}
	
}
