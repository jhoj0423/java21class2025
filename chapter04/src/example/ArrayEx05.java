package example;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력 : ");
		int num = scan.nextInt();
		boolean chk = true;
		for(int i=0;i<hakbuns.length;i++) {
			if(num==hakbuns[i]) {
				System.out.printf("성적 : %d점%n",scores[i]);
				chk=false;
			}
		}
		if(chk) {
			System.out.println("입력하신 학번에 대한 성적이 없습니다.");
		}
		System.out.print("점수 입력 : ");
		int num2 = scan.nextInt();
		int chk2 = -1; // 숫자 0은 인덱스 번호로 사용되므로 인덱스 번호와 겹치치 않는 숫자를 사용
		for(int i=0;i<scores.length;i++) {
			if(num2==scores[i]) {
				System.out.printf("학번 : %d%n",hakbuns[i]);
				chk2=1;
			}
		}
		if(chk2==-1) {
			System.out.println("입력하신 점수의 학번은 없습니다.");
		}
	}

}
