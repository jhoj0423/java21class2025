package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Double> has = new HashMap<>();
		
		System.out.println("미래 장학금 관리 시스템입니다.");
		while(true) {
			for(int i=0;i<5;) {
				System.out.print("이름과 학점 >>");
				String inputs = scan.nextLine();
				
				StringTokenizer person = new StringTokenizer(inputs);
				String name = person.nextToken();
				Double score = Double.parseDouble(person.nextToken().trim());
				if(score<0 || score>4.5) {
					System.out.println("학점 범위 0.0 ~ 4.5");
					continue;
				}
				has.put(name, score);
				i++; // 조건이 만족할때만 누적
			}
			System.out.println("장학생 선발 학생 기준 입력 >>");
			double standard = scan.nextDouble();
			System.out.print("장학생 명단 : ");
			for(String h :has.keySet()) {
				if(has.get(h)>=standard) {
					System.out.print(h+" ");
				}
			}
			break;
			
		}
	}

}
