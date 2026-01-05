package multiexample;

import java.util.Scanner;

public class MultiArrayEx02 {

	public static void main(String[] args) {
		int[][] arr01 = new int[3][3];
		int num = 10;
		for(int i=0;i<arr01.length;i++) {
			for(int j=0;j<arr01[i].length;j++) {
				arr01[i][j] = num;
				num += 10;
			}
		}
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("인덱스1 입력 : ");
//		int idx1 = scan.nextInt();
//		System.out.println("인덱스2 입력 : ");
//		int idx2 = scan.nextInt();
//		if(idx1>=0 && idx1<=2 && idx2>=0 && idx2<=2) {
//			System.out.print("값 출력 : "+arr01[idx1][idx2]);
//		}else {
//			System.out.println("값이 없습니다.");
//		}
		int[][] arr02 = new int[3][3];
		int num2 = 10;
		for(int i=0;i<arr01.length;i++) {
			for(int j=0;j<arr01[i].length;j++) {
				arr02[i][j] = num2;
				num2 += 10;
			}
		}
		
		System.out.println("인덱스1 입력 : ");
		int idx3 = scan.nextInt();
		System.out.println("인덱스2 입력 : ");
		int idx4 = scan.nextInt();
		System.out.println("바꿀 인덱스1 입력 : ");
		int idx5 = scan.nextInt();
		System.out.println("바꿀 인덱스2 입력 : ");
		int idx6 = scan.nextInt();
		if(idx3>=0 && idx3<=2 && idx4>=0 && idx4<=2 && idx5>=0 && idx5<=2 && idx6>=0 && idx6<=2) {
			arr02[idx3][idx4]=arr01[idx5][idx6];
			arr02[idx5][idx6]=arr01[idx3][idx4];
		}else {
			System.out.println("값이 없습니다.");
		}
		
		
		for(int i=0;i<arr01.length;i++) {
			for(int j=0;j<arr01[i].length;j++) {
				System.out.print(arr02[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
