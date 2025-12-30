package iFexample;

import java.util.Scanner;

public class ifEx05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시요 >>> ");
		int money = 0;
		money = scan.nextInt();
		System.out.println("오만원권 : " + money/50000 +"매");
		int fm = money%50000;
		System.out.println("만원권 : " + fm/10000 +"매");
		int im = money%10000;
		System.out.println("오천원권 : " + im/5000 +"매");
		int ft = money%5000;
		System.out.println("천원권 : " + ft/1000 +"매");
		int it = money%1000;
		System.out.println("오백원 : " + it/500 +"매");
		int fb = money%500;
		System.out.println("백원 : " + fb/100 +"매");
		
		// System.out.printf("오만원군 %d매%n 만원군%d매%n",oman,oneman);
		// 프린트를 한 줄로 줄일 수 있다
	}

}
