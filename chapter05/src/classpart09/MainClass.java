package classpart09;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx09 e9 = new ClassEx09();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(e9.plus(a, b));
		System.out.println(e9.minus(a, b));
		System.out.println(e9.gob(a, b));
		System.out.println(e9.nanu(a, b));
	}

}
