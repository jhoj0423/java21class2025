package classpart08;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		ClassEx08 e8 = new ClassEx08();
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			e8.showPrint();
			int sel = scan.nextInt();
			if(sel==1) {
				e8.signup();
			}else if(sel==2) {
				e8.login();
			}else if(sel==3) {
				e8.logout();
			}else if(sel==4) {
				e8.addmoney();
			}else if(sel==5) {
				e8.movemoney();
			}else if(sel==6) {
				e8.myMoney();
			}else if(sel==0) {
				System.out.println("종료");
				run = false;
			}
		}
		

	}

}
