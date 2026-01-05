package multiexample;

public class MultiArrayEx03 {

	public static void main(String[] args) {
		int[][] arr = {
				{101,102,103,104},
				{201,202,203,204},
				{301,302,303,304}
		};
		
		int sum =0;
		System.out.println("가로 합 출력");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
			}
			System.out.print(sum+" ");
			sum=0;
		}
		System.out.println();
		System.out.println("세로 합 출력");
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum += arr[j][i];
			}
			System.out.print(sum+" ");
			sum=0;
		}

	}

}
