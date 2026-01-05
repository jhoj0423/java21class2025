package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] site = new int[7]; // 좌석 예매여부
		int choose = 0; // 선택한 인원의 수
		int menu = 0; // 메뉴 선택
		int pay =12000; // 좌석당 가격
		String[] state = {" "," "," "," "," "," "," "};//좌석표시
		boolean run = true;
		
		while(run == true) {
			for(int i=0;i<site.length;i++) {
				if(site[i]==0) {//좌석 미선택시
					state[i] = " ";
				}else if(site[i]==1) {//좌석선택시
					state[i] = "O";
				}else if(site[i]==2) {
					state[i] = "X";
				}
				System.out.printf("[%s]",state[i]);
			}
			System.out.println("\n=== 메가 영화관 ===");
			System.out.println("1.좌석예매 \n2.취소 \n3.종료");
			System.out.print("메뉴선택 : ");
			menu = scan.nextInt();
			if(menu==1) {//좌석예매 메뉴 선택시
				System.out.print("예매 인원을 입력하세요[1~7] : ");
				int head = scan.nextInt();
				if(head==1) {
					for(int i=0;i<site.length;i++) {
						if(i%2==1 && site[i]!=1) {//짝수 자리 비활성화
							site[i]=2;
						}
						if(site[i]==0) {//좌석 미선택시
							state[i] = " ";
						}else if(site[i]==1) {//좌석선택시
							state[i] = "O";
						}else if(site[i]==2) {
							state[i] = "X";
						}
						System.out.printf("[%s]",state[i]);
						
					}
					System.out.println();
					System.out.print("좌석 번호를 선택[1~7] : ");
					int select = scan.nextInt();
					
					
					if(site[(select-1)%7]==1 || site[(select-1)%7]==2) {
						System.out.println("--------예약이 불가능 합니다--------");
					}else {
						for(int i=0;i<head;i++) {
							if(site[i]!=2 && site[i]!=1 && select>=1 && select<=7) {
								site[(select-1)%7]=1;
								choose++;
								System.out.println(choose+"좌석수");
							}
						}
						
					}				
				}else if(head==2) {
					System.out.print("좌석 번호를 선택[1~7] : ");
					int select = scan.nextInt();
					int num = 0;
					if(site[(num+select-1)%7]==1 || site[(num+select-1)%7]==2 || site[(num+select)%7]==1 || site[(num+select)%7]==2) {
						System.out.println("--------예약이 불가능 합니다--------");
					}else {
						for(int i=0; i<head ; i++) {
							site[(num+select-1)%7]=1;
							choose ++;
							num++;
							System.out.println(choose+"좌석수");
						}
					}
				}else if(head>=3 && head<=7) {
					int cnt = (head+1)/2; // 3=2, 4=2, 5=3, 6=3, 7=4 =>2자리씩 선택하는 횟수
					int cnt2 = 0;
					for(int i=1;i<=cnt;i++) {
						System.out.printf("%n%d번째 좌석 번호를 선택[1~7] : ",i);
						int select = scan.nextInt();
						int num = 0;
						if(site[(num+select-1)%7]==1 || site[(num+select-1)%7]==2 || site[(num+select)%7]==1 || site[(num+select)%7]==2) {
							System.out.println("--------예약이 불가능 합니다--------");
						}else {
							for(int j=0; j<=1 ; j++) {
								if(head>cnt2) {
									site[(num+select-1)%7]=1;
									choose ++;
									num++;
									cnt2 ++;
									System.out.println(choose+"좌석수");
								}
							}
						}
					}
					
				}else { // 선택인원이 좌석보다 많을때
					System.out.print("선택인원이 잘못되었습니다.");
				}
//				
				for(int i=0;i<site.length;i++) {// 비활성화 초기화
					if(site[i]==2) {
						site[i]=0;
					}
				}
			}else if(menu==2) {
				System.out.print("취소할 인원을 입력하세요[1~7] : ");
				int head = scan.nextInt();
				if(head>choose) {
					System.out.println("--------선택된 인원보다 취소인원이 더 많습니다--------");
				}else if(head==1) {
					System.out.print("좌석 번호를 선택[1~7] : ");
					int select = scan.nextInt();
					if(site[select]!=1) {
						System.out.print("예매되어 있지 않은 좌석입니다.");
					}else {
						site[select-1]=0;
						System.out.println("예매가 취소 되었습니다");
					}
				}else if(head==2) {
					
				}else if(head>=3 && head<=7) {
					
				}
				
			}else {// 종료메뉴 선택시
				System.out.println("--------종료되었습니다--------");
				run = false;
				System.out.println(pay);
				System.out.println(choose);
				System.out.println("총 예매 가격 : "+(pay*choose)+"원");
			}
		}
		
		

	}

}
