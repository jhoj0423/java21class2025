package classpart07;

import java.awt.Menu;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//while()문은 main()메소드에서 작성할것
		//main() 계산
		Scanner scan = new Scanner(System.in);
		ClassEx07 ca = new ClassEx07();
		//ClassEx07클래스에 접근하는 방법
		//참조변수.멤버변수,참조변수,메소드
		boolean run = true;
		while(run) {
			ca.printMenu();
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel>=1 && sel <= ca.menu.length) {
					ca.order(sel);
			}else {
				if(ca.hasOrder()) {
				ca.totalPrice();
				System.out.print("총금액은"+ca.total+"입니다. 돈을 입력하세요 : ");
				int money = scan.nextInt();
				if(money < ca.total) {
					System.out.println("지불 금액이 부족합니다");
					continue;
				}else {
					ca.printReceipt(money);
				}
				run = false;
				}else {
					System.out.println("주문내역이 없습니다");
					continue;
				}
			}
			
		}
	}

}
