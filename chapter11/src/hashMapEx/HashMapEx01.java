package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		System.out.println("나라 이름과 인구를 입력하세요.(예:korea 5000)");
		String countrySel = "";
//		String countrySel = scan.nextLine();// nextLine 은 띄어쓰기 이후로도 전부 next 띄어쓰기 전까지
		
		int num=0;
		
		
		while(run) {
			if(!countrySel.equals("그만")) {
				System.out.print("나라 이름, 인구>>");
				countrySel = scan.nextLine();
				if(countrySel.equals("그만")) {//나라입력
					continue;
				}else {
					StringTokenizer str = new StringTokenizer(countrySel);
					String  cunt= str.nextToken().trim();
					Integer people = Integer.parseInt(str.nextToken().trim());
					nations.put(cunt, people);
				}
				
			}else {//정보검색
				System.out.print("인구 검색>>");
				String findCun = scan.next();
				if(findCun.equals("그만")) {
					run=false;
				}else if(nations.containsKey(findCun)){
					System.out.println(findCun+"의 인구는 "+nations.get(findCun));
				}else {
					System.out.println(findCun+"나라는 없습니다");
				}
			}
		}
		System.out.println("인구 검색 종료");
		
		
	}

}
