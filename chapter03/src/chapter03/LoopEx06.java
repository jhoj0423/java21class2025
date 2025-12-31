package chapter03;

import java.util.Scanner;

public class LoopEx06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b_burger = 8700;
		int s_burger = 6700;
		int coke = 1500;
		int menu_cnt01 =0;
		int menu_cnt02 =0;
		int menu_cnt03 =0;
		int num = 0; // 주문 받은 횟수
		boolean run = true;
		int choice = 0;
		System.out.println("==== 롯데리아 ====");
		System.out.printf("1.불고기 버거: %d원%n2.새우 버거: %d원%n3.콜라: %d원%n",b_burger,s_burger,coke);
		while(run==true){
			System.out.print("메뉴선택 : ");
			choice = scan.nextInt();
			if(choice==1) {
				menu_cnt01++;
			}else if(choice==2) {
				menu_cnt02++;
			}else if(choice==3) {
				menu_cnt03++;
			}
			num++;
			if(num==5) {
				run=false;
			}
		}
		int total = (b_burger*menu_cnt01)+(s_burger*menu_cnt02)+(coke*menu_cnt03);
		System.out.printf("총 금액 = %d원%n",total);
		int pay = scan.nextInt();
		System.out.println();
		if(pay>total) {
		System.out.println("==== 롤데리아 영수증====");
		System.out.printf("1.불고기 버거: %d개%n2.새우 버거: %d개%n3.콜라: %d개%n",menu_cnt01,menu_cnt02,menu_cnt03);
		System.out.println("4.총 금액 : "+total+"원");
		System.out.println("5.잔돈 : "+(pay-total)+"원");
		}else {
			System.out.println("금액이 부족합니다");
		}
		
		scan.close();
	}

}
