package multiexample;

public class MultiArrayEx01 {

	public static void main(String[] args) {
//		int[][] arr01 = {
//				{10,20,30},
//				{40,50,60},
//				{70,80,90}
//		};
		int[][] arr01 = new int[3][3];
		int num = 10;
		for(int i=0;i<arr01.length;i++) {
			for(int j=0;j<arr01[i].length;j++) {
				arr01[i][j] = num;
				num += 10;
			}
		}
		System.out.println("===1번 문제===");
		
		for(int i=0;i<arr01.length;i++) {
			for(int j=0;j<arr01[i].length;j++) {
				System.out.print(arr01[i][j]+" ");
			}
			System.out.println();
		}
		
		int sum = 0; // 전체 합
		for(int i=0;i<arr01.length;i++) {
			for(int j=0;j<arr01[i].length;j++) {
				sum += arr01[i][j];
				
			}
		}
		System.out.println("===2번 문제===");
		System.out.println(sum);
		
		System.out.println("===3번 문제===");
		int cnt = 0; // 갯수 표시
		for(int i=0;i<arr01.length;i++) {
			for(int j=0;j<arr01[i].length;j++) {
				if(arr01[i][j]%4==0) {
					System.out.print(arr01[i][j]+" ");
					cnt++;
				}
			}
		}
		System.out.println(cnt+"개");
		System.out.println("===4번 문제===");
		int f_sum=0; // 4의 배수의 합
		for(int i=0;i<arr01.length;i++) {
			for(int j=0;j<arr01[i].length;j++) {
				if(arr01[i][j]%4==0) {
					f_sum+=arr01[i][j];
				}
			}
		}
		System.out.println(f_sum);
	}

}
