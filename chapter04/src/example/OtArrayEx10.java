package example;

import java.util.Scanner;

public class OtArrayEx10 {
	public static void main(String[] args) {
		// 영화 예매 프로그램 규칙정링
		//좌석 상태 값 정의
		// 0 : 비어있는 좌석
		// 1 : 현재 선택 중인 좌석 [O]
		// 2 : 예매 완료된 좌석 [X]
		// 3 : 예매 불가 좌석 [!]
		
		Scanner scan = new Scanner(System.in);
		
		//좌석 10개로 배열 지정
		//int 배열의 깁손값은 0 -> 처음엔 모두 비어 있음
		int[] seat = new int[10];
		//전체 예매 인원 수(총 매출 계산용)
		int cnt = 0;
		//프로그램 실행 여부를 제어하는 변수
		boolean run = true;
		//메인메뉴선택
		while(run==true) {
			System.out.println();
			System.out.println("===메가 영화관===");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.println("3.취소");
			System.out.print("메뉴선택 : ");
			int sel = scan.nextInt();
			//======== 1.좌석 예매 ================
			if(sel == 1) {
				System.out.println("예매 인원을 입력하세요 [1~8]:");
				int inwon = scan.nextInt();//내각 입력한 인원
				//1명 예매 규칙
				//짝수 좌석은 선택 불가 = > 3
				//홀수 좌석만 예매 가능
				if(inwon>=1 && inwon<=8) {
					//== 1명 예매일 경우
					for(int i=0;i<seat.length;i++) {
						// 2, 4, 6, 8, => 배열은 index가 0 부터시작하므로 홀수좌석 
						if(i % 2 !=0 && seat[i] !=2) {
							seat[i]=3;
						}
					}
					//현재 좌석 상태 출력
					for(int i=0; i<seat.length;i++) {
						if(seat[i]==0)System.out.print("[ ]");
						else if(seat[i]==2)System.out.print("[X]");
						else if(seat[i]==3)System.out.print("[!]");
						else System.out.print("[O]");
					}
					System.out.println();
					
					//좌석 선택
					System.out.print("좌석번호 선택[1~10]");
					int idx = scan.nextInt()-1; // -1인 이유 : index는 0번부터 시작하므로
					
					//이미 선택좌석 예외처리
					if(seat[idx]==2) {
						System.out.println("이미 예매된 좌석입니다.");
						//짝수 좌석 선택시
					}else if(idx %2!=0) {
						System.out.println("예매 불가능");
					}else {//정상 예매
						seat[idx]=1;
						System.out.println("예매완료");
						//예매시 인원수 누적
						cnt++;
					}
					//선택후 좌석 출력
					for(int i=0; i<seat.length;i++) {
						if(seat[i]==0)System.out.print("[ ]");
						else if(seat[i]==2)System.out.print("[X]");
						else if(seat[i]==3)System.out.print("[!]");
						else System.out.print("[O]");
					}
					System.out.println();
				//  ----[두명 이상 예매일 경우]----
					if(inwon>=2 && inwon <=8) {
						for(int i=0; i<seat.length;i++) {
							if(seat[i]==0)System.out.print("[ ]");
							else if(seat[i]==2)System.out.print("[X]");
							else if(seat[i]==3)System.out.print("[!]");
							else System.out.print("[O]");
						}
						System.out.println();
						
						int selectCnt = 0;
						
						//인원 수 만큼 좌석 건택 반복
						//inwon = 4,현재 선택인원인 selectCnt=2
						//selectCnt가 최초에 선택한 inwon보다 작으면
						//아직 좌석선택이 다 끝나지 않았음을 조건으로 표시 함
						while(selectCnt<inwon) {
							System.out.println("좌석번호 선택[1!10]");
							int idx1 = scan.nextInt();
							//좌석번호 범위 체크 예외처리하기
							if(idx1<0 || idx1>=10) {
								System.out.println("좌석번호 오류");
								continue;
							}
							//selectCnt의 인원 중 마지막 1명이 남았을경우
							//전체 예매 인원 중 아직 선택하지 않은 사람이 1명일때 실행하는 코드
							if(inwon - selectCnt==1) {
								//이미 선택되었거나, 예매 완료된 좌석이면 선택불가 예외처리
								if(seat[idx1]==1 || seat[idx1]==2) {
									System.out.println("이미 선택되었거나 예매된 좌석입니다");
									continue;
								}
								//셋팅 부분
								//해당 좌석을 '선택중[O]' 상태로 변경
								seat[idx1]=1;
								//전체 예매 인원수를 누적 상태로 변경
								cnt++;
								//현재 선택완료된 인원수 1명 증가
								selectCnt++;
							}else {
								//----[2명 이상 남았을 경우]----
								//연속해서 두 좌석 함께 선택외어야 함
								
								//배열 범위를 벗어나거나
								//이미 선택외었거나, 예매가 완료된 좌석이 포함되어 있으면
								//선택 불가 예외처리함
								if(idx1>=9 || seat[idx1]==1 || seat[idx1+1]==1 || seat[idx1]==2 || seat[idx1+1]==2) {
									System.out.println("이미 선택되었거나 예매된 좌석입니다");
									continue;
								}
								//해당 좌석과 옆 좌석을 '선택중[O]' 상태로 변경
								seat[idx1]=1;
								seat[idx1+1]=1;
								
								//전체 예매 인원수를 누적 상태로 변경
								cnt+=2;
								//현재 선택완료된 인원수 1명 증가
								selectCnt+=2;
								
								//현재 좌석 출력
								for(int i=0; i<seat.length;i++) {
									if(seat[i]==0)System.out.print("[ ]");
									else if(seat[i]==2)System.out.print("[X]");
									else if(seat[i]==3)System.out.print("[!]");
									else System.out.print("[O]");
								}
								System.out.println();
							}
							System.out.println();
						}
						//예매 확정 [X]로 변경
						//예매 불가능 [!] => 다시 []
						for(int i=0;i<seat.length;i++) {
							if(seat[i]==1)seat[i]=2;
							else if(seat[i]==3)seat[i]=0;
						}
					}else {
						System.out.println("===예매 인원을 다시 확인해 주세요===");
					}
				}else {
					System.out.println("===예매 인원을 다시 확인해 주세요===");
				}
				
			}else if(sel == 2) {
				//총 매출액 계산 예정
				int total = cnt * 12000;
				System.out.printf("매출액 : %d원%n",total);
				System.out.printf("인원수 : %d명%n",cnt);
				//종료
				run= false;
				System.out.println("===프로그램 종료===");
			}
		}
		
		//===개발 종료 ===
		scan.close();
	}
}
