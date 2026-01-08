package classpart06;

import java.util.Random;
import java.util.Scanner;

public class ClassEx06 {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	int[] hgd = new int[5];
	int[] answer02 = {1,3,4,2,5};
	String[] chk = {"X","X","X","X","X"}; 
	int cnt = 0;
	int cnt02 = 0;
	public ClassEx06() {}
	
	public void seting() {
		for(int i=0;i<hgd.length;i++) {
			int correct = ran.nextInt(5)+1;
			hgd[i]=correct;
		}
	}
	public void test() {
		int answer = 0;
		for(int i=0;i<hgd.length;i++) {
			System.out.print("정답 입력 : ");
			answer = scan.nextInt();
			if(hgd[i] == answer) {
				cnt++;
			}
		}
		
	}
	public void test02() {
		for(int i=0;i<hgd.length;i++) {
			if(hgd[i]==answer02[i]) {
				cnt02++;
				chk[i] = "O";
			}
		}
		System.out.print("\nanswer = ");
		for(int i=0;i<hgd.length;i++) {
			System.out.print(answer02[i]);
		}
		System.out.print("\nhgd = ");
		for(int i=0;i<hgd.length;i++) {
			System.out.print(hgd[i]);
		}
		System.out.print("\n정오표 = ");
		for(int i=0;i<hgd.length;i++) {
			System.out.print(chk[i]);
		}
	}
	
	public void OX() {
		
	}
	public void totalscore() {
		int score = cnt*20 ;
		for(int i=0;i<hgd.length;i++) {
			System.out.print(hgd[i]+" ");
		}
		System.out.println("\n"+score);
	}
	public void totalscore2() {
		int score = cnt02*20 ;
		
		System.out.println("\n"+score+": 성적");
	}
}
