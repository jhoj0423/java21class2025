package iFexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx15 {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(100) +1; // 1~100까지의 숫자
		System.out.printf("문제[%d]%n1. 홀수%n2. 짝수%n번호를 선택하세요 : ",num);
		Scanner scan = new Scanner(System.in);
		int chk = scan.nextInt();
		int numChk = num%2;
		switch(chk) {
		case 1 : if(numChk==1) {
				System.out.println("정답!");
			}else {
				System.out.println("오답!");
			};break;
		case 2 : if(numChk==1) {
			System.out.println("오답!");
		}else {
			System.out.println("정답!");
		};break;
		default : System.out.println("둘중 한가지를 선택해주세요");
		}//switch문 종료
		scan.close();
	}

}
