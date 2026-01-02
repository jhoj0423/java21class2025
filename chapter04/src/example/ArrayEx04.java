package example;

import java.util.Scanner;

public class ArrayEx04 {

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

	}

}
