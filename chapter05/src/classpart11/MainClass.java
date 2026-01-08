package classpart11;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		ClassEx11 e11 = new ClassEx11();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("=== 메가IT 고등학교 ===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.(학번을 입력받아)성적확인하기");
			System.out.println("5.종료하기");
			System.out.print("메뉴 선택 : ");
			int sel =  scan.nextInt();
			if(sel==1) {
				e11.choice1();
			}else if(sel==2) {
				System.out.printf("%n1등 학생 = %d학번(%d점)%n",e11.arHakbun[e11.choice2()],e11.arScore[e11.choice2()]);
			}else if(sel==3) {
				System.out.printf("%n꼴등 학생 = %d학번(%d점)%n",e11.arHakbun[e11.choice3()],e11.arScore[e11.choice3()]);
			}else if(sel==4) {
				System.out.print("학번을 입력하세요.");
				int choose = scan.nextInt(); // 직접 선택한 학번
				if(e11.choice4(choose)!=-1) {//e11.choice4(choose) = chk 값 => 선택한 학번과 같은 index
					System.out.println(e11.arScore[e11.choice4(choose)]);
				}else {// 선택한 학번과 같은게 없을 경우
					System.out.println("입력한 한번의 학생이 없습니다");
				}
			}else if(sel==5) {
				run = false;
			}
		}
	}
}
