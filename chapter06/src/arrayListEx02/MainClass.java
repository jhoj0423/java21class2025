package arrayListEx02;

import java.util.ArrayList;
import java.util.Scanner;

import arrayListEx01.Product;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> St = new ArrayList<Student>();
		
		boolean run = true;
		
		while(run) {
			for(int i=0;i<3;i++) {
				//객체화를 진행한다.
				Student sname = new Student();
				System.out.println("학생 이름 : ");
				String name =  scan.next();
				System.out.println("1번째 과목 :");
				String sub1 =  scan.next();
				System.out.println("점수 :");
				int sco1 =  scan.nextInt();
				System.out.println("2번째 과목 :");
				String sub2 =  scan.next();
				System.out.println("점수 :");
				int sco2 =  scan.nextInt();
				sname.name = name;
				Subject subject = new Subject();
				subject.sub = sub1;
				subject.score = sco1;
				subject.sub = sub2;
				subject.score = sco2;
			}
			run = false;
		}
		System.out.println("=== 학생 성적 출력 ===");
		
	}

}
