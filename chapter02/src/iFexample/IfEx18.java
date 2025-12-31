package iFexample;

import java.util.Scanner;

public class IfEx18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이용할 정거장의 수를 입력하세요 : ");
		int move = scan.nextInt();
		int pay =0;
		if(move>0 && move<=5) {
			pay=500;
		}else if(move>5 && move<=10) {
			pay=600;
		}else {
			int go = ((move-9)/2);
			pay = 600+(go*50);
		}
		
		System.out.println("요금 = "+pay+"원");
		scan.close();
	}
	

}
