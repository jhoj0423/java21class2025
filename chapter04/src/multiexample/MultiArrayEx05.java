package multiexample;

import java.util.Scanner;

public class MultiArrayEx05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] apt = {
				{101, 102, 103},
				{201, 202, 203},
				{301, 302, 303}
		};
		int[][] pay = {
				{1000, 2100, 1300},
				{4100, 2000, 1000},
				{3000, 1600, 800}
		};
//		System.out.println("각 층별 관리비 합 출력");
//		int sum=0; // 관리비의 합
//		for(int i=0;i<pay.length;i++) {
//			sum=0; // 층이 바뀔때 관리비 초기화
//			for(int j=0;j<pay[i].length;j++) {
//				sum+=pay[i][j];
//			}
//			System.out.print(sum+" ");
//		}
		System.out.println("호를 입력하면 관리비 출력");
		System.out.print("입력 :");
		int sel = scan.nextInt();//선택한 집
		int idx1 = 0; // 왼쪽 인덱스
		int idx2 = 0; // 오른쪽 인덱스 
		for(int i=0;i<apt.length;i++) {
			for(int j=0;j<apt[i].length;j++) {
				if(sel == apt[i][j]) { // 입력한 값의 인덱스 정보
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.print("관리비 출력 :"+pay[idx1][idx2]+"\n");
		
		System.out.println("문제10) 관리비가 가장 많이 나온집, 적게 나온 집 출력");
		// 관리비 비교
		int min = 0;
		int max = 0;
		//최소 관리비,최대 관리비 산출
		for(int i=0;i<pay.length;i++) {
			for(int j=0;j<pay[i].length;j++) {
				if(max<pay[i][j]) {
					max=pay[i][j];
				}
				min=max; // 일단 최솟값을 최대로 잡고 점점 줄여나가기 위해서
				if(min>pay[i][j]) {
					min=pay[i][j];
				}
			}
		}
		int idx3=0,idx4=0,idx5=0,idx6=0;// 최소왼쪽 인덱스 최소오른쪽 인덱스 최대왼쪽 인덱스 최대오른쪽 인덱스 
		
		for(int i=0;i<pay.length;i++) {
			for(int j=0;j<pay[i].length;j++) {
				if(min == pay[i][j]) { // 입력한 값의 인덱스 정보
					idx3 = i;
					idx4 = j;
				}
				if(max == pay[i][j]) { // 입력한 값의 인덱스 정보
					idx5 = i;
					idx6 = j;
				}
			}
		}
		System.out.printf("가장 많이 나온집(%d),가장 적게 나온 집(%d)",apt[idx3][idx4],apt[idx5][idx6]);
		
		
	}

}
