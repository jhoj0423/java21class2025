package example;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = {"홍길동","개나리","진달래","김백합","최동훈"};
		int[] score = new int[name.length];
		for(int i=0;i<name.length;i++) {
			System.out.printf("%s의 점수를 입력하세요 : ",name[i]);
			score[i] = scan.nextInt();
		}
		for(int i=0;i<name.length;i++) {
			System.out.printf("%s의 점수 : %d%n",name[i],score[i]);
		}
		
		System.out.println("============================");
		
		double avg = 0.0;
		for(int i=0;i<name.length;i++) {
			avg+=score[i];
		}
		avg=avg/5;
		System.out.println("평균 : "+avg);

		scan.close();
	}

}
