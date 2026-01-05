package multiexample;

public class MultiArrtest {
	
	public static void main(String[] args) {
		//다차원 배열 선언 및 초기화
		//int[][] score= new int[3][]
		//score[0]=new int[2];
		int[][] score = {
				{95,60},
				{95,60,50},
				{95,60,89,68,59}
		};
		
		//score 값 출력
		for(int i=0 ;i<score.length;i++) {
			for(int j=0 ;j<score[i].length;j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
