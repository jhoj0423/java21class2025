package classpart11;

public class ClassEx11 {
	String name ="";
	int[] arHakbun = {1001,1002,1003,1004,1005};
	int[] arScore = {92,38,87,100,11};
	
	//전교생 성적 출력
	public void choice1 () {
		for(int i=0;i<arHakbun.length;i++) {
			System.out.printf("%d. %d학번(%d점)%n",i+1,arHakbun[i],arScore[i]);
		}
	}
	//1등 성적 확인
	public int choice2 () {
		int max = 0;
		int num = -1;
		for(int i=0;i<arHakbun.length;i++) {
			if(arScore[i]>max) {
				max=arScore[i];
				num=i; // 1등 학생확인
			}
		}
		return num;
	}
	//꼴등 성적 확인
	public int choice3 () {
		int num = choice2();
		int min = arScore[num];
		int underNum = 0;
		for(int i=0;i<arHakbun.length;i++) {
			if(arScore[i]<min) {
				min=arScore[i];
				underNum=i; // 꼴등 학생확인
			}
		}
		
		return underNum;
	}
	// 입력 받은 학번으로 성적확인
	public int choice4 (int choose) {
		int chk = -1; //같은 학번이 있는지 확인하는 변수
		for(int i=0;i<arHakbun.length;i++) {
			if(choose==arHakbun[i]) {//선택한 변수가 존재하는 학번인지 확인
				chk = i;
				break; // 찾았다면 학번의 index를 가지고 탈출
			}else {
				chk=-1; // 아닐시 고정
			}
		}
		return chk;
	}
	
	

}
