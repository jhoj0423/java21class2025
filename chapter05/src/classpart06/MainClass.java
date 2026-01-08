package classpart06;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx06 e6 = new ClassEx06();
		
		e6.seting();
		e6.test();
		System.out.print("성적 : ");
		e6.totalscore();
	}

}
