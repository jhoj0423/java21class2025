package iFexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx16 {

	public static void main(String[] args) {
		Random ran = new Random();
		int ranNum = ran.nextInt(100)+150;
		System.out.printf("문제 = %d%n가운데 숫자를 입력하세요 : ",ranNum);
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		
		int hund = (ranNum-(select*10))%100;
		
		if(hund<10 && hund>=0) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		scan.close();	
	}
	

}
