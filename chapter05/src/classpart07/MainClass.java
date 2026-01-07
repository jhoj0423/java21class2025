package classpart07;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx07 ca = new ClassEx07();
		while(true) {
			System.out.println("      [맘스터치 햄버거]");
			for(int i=0;i<ca.menu.length;i++) {
				System.out.printf("%d.%s    %d원%n",i+1,ca.menu[i],ca.arPrice[i]);
			}
			System.out.println("0.주문하기");
			System.out.println("----------------------------");
			
			
		}
	}

}
