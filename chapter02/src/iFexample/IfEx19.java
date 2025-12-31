package iFexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx19 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int le_num = ran.nextInt(10)+1;
		int ri_num = ran.nextInt(10)+1;
		int cal = ran.nextInt(4)+1;
		int answer = 0;
		if(cal==1) {
			answer += le_num+ri_num;
		}else if(cal==2) {
			answer += le_num-ri_num;
		}else if(cal==3) {
			answer += le_num*ri_num;
		}else if(cal==4) {
			answer += le_num%ri_num;
		}
		
		System.out.printf("%d ? %d = %d%n",le_num,ri_num,answer);
		
		System.out.println("1)+ 2)- 3)* 4)%");
		System.out.print("번호를 선택하세요 : ");
		int result = scan.nextInt();
		if(cal==result) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
			
	}

}
