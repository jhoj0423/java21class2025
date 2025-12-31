package chapter03;

import java.util.Scanner;

public class LoopEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =0;
		boolean run = true;
		//while문 조건에 true가 들어가면 무한 루프
		while(run == true){
			num = scan.nextInt();
			if(num== -100) {
				run=false;
				System.out.println("종료");
			}
			
		}
		
		scan.close();
	}

}
