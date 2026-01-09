package arrayListEx01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import arrayListTest.Member;

public class CartMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int gaguk = (ran.nextInt(10)+1)*1000;
		Cart cart = new Cart();
		
		cart.additem(new Product("사과",1000));
		cart.additem(new Product("바나나",2000));
		cart.additem(new Product("포도",8000));
		cart.additem(new Product("망고",5000));
		cart.additem(new Product("수박",10000));
		
		
		System.out.println("[장바구니 목록]");
		cart.showPrint();
		System.out.println("총 금액 :"+cart.total());
		
		System.out.println("\n-----------------------------");
		System.out.print("삭제할 상품을 입력하세요 : ");
		int sel = scan.nextInt();
		cart.removeitem(sel);
		System.out.println("[삭제한 후 장바구니 목록]");
		cart.showPrint();
		System.out.println("\n-----------------------------");
		System.out.print("추가할 상품을 입력하세요 : ");
		String newtem = scan.next();
		cart.additem(new Product(newtem,gaguk));
		cart.showPrint();
		
	}
}
