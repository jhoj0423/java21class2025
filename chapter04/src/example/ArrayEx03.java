package example;

import java.util.Scanner;
//import java.util.*; 모든 임폴트

public class ArrayEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {87,11,45,98,23};
		
		System.out.print("인덱스 입력 : ");
		int num = scan.nextInt();
		if(num<arr.length && num>=0) {
			System.out.printf("성적 : %d점%n",arr[num]);
		}else {
			System.out.println("입력하신 정보의 성적은 없습니다");
		}
		
		
		System.out.print("성적 입력 : ");
		int num2 = scan.nextInt();
		boolean chk = true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num2) {
				System.out.println("인덱스 : "+i);
				chk = false;
			}
		}
		if(chk) {
			System.out.println("입력한 성적의 인덱스는 없습니다.");
		}

	}

}
