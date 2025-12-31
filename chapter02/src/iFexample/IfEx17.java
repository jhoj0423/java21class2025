package iFexample;

import java.util.Random;

public class IfEx17 {

	public static void main(String[] args) {
		Random ra = new Random();
		int raN = ra.nextInt(50)+1;
		System.out.println("문제 = "+raN);
//		int te = raN/10;
//		int on = (raN%10)%3;
//		if(te==3 && on==0) {
//			System.out.println("짝짝");
//		}else if((te!=3&&on==0)||(te==3&&on!=0)) {
//			System.out.println("짝");
//		}else {
//			System.out.println(raN);
//		}
		int te = raN/10;
		int on = raN%10;
//		갯수를 수적할 변수
		int cnt = 0;
		if(te==3||te==6||te==9) {
			cnt++;
		}
		if(on==3||on==6||on==9) {
			cnt++;
		}
		if(cnt==2) {
			System.out.println("짝짝");
		}else if(cnt==1) {
			System.out.println("짝");
		}else {
			System.out.println(raN);
		}
	}

}
