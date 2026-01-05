package multiexample;

import java.util.Scanner;

public class String_example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String[][] items = new String[100][2];
		boolean run = true; // 반복문 조건
		int category = 0; //생성될 카테고리 수
		while(run) {
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아이템 관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[0]종료");
			System.out.print("관리자 모드를 선택 :");
			int sel =  scan.nextInt();
			if(sel==1) {//카테고리 관리 선택시
				System.out.print("\n추가할 카테고리 입력 :");
				String tags = scan.next(); //카테고리이름
				items[category][0]= tags;
				category++;
				System.out.println();
			}else if(sel==2){//아이템 관리 선택시
				if(items[0][0]==null) {//생성된 품목이 없을시
					System.out.println("====아직 품목이 존재하지 않습니다====");
				}else {//생성된 품목이 있을을시
					for(int i=0;i<items.length;i++) {
						if(items[i][0]!=null) {
							System.out.printf("[%d] %s%n",i,items[i][0]);
						}
					}
					System.out.print("카테고리를 선택하세요 : ");
					int tagNum = scan.nextInt();//선택한 카테고리 넘버 
					System.out.print("추가할 아이템을 입력하세요 : ");
					String product = scan.next();
					if(items[tagNum][1]==null) {
						items[tagNum][1] = product+"/";
					}else {
						items[tagNum][1] += product+"/";
					}
					
				}
			}else if(sel==3){//전체품목 출력 선택시
				if(items[0][0]==null) {//생성된 품목이 없을시
					System.out.println("====아직 품목이 존재하지 않습니다====");
				}else {
					for(int i=0;i<items.length;i++) {
						if(items[i][0]!=null) {
							System.out.printf("%n%s : %s",items[i][0],items[i][1]);
						}
					}
					System.out.println();
				}
			}else if(sel==0){//종료 선택시
				System.out.println("------프로그램 종료--------");
				run=false;
			}else {
				System.out.println("---다시 입력해주세요---");
			}
			
		}
		
		scan.close();
	}

}
