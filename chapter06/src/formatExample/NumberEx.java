package formatExample;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberEx {

	public static void main(String[] args) {
		// NumberFormat => 숫자를 원하는 형식으로 ㅊㄹ력하는 클래스
		// NumberFormat는 new 예약어를 통한 객체를 생성하지 않는다.
		// 예) NumberFormat nf = NumberFormat.getInstance();
		//		=> 결화는 천단위 마다,(콤마)를 출력하는 메소드이다.
		Scanner scan = new Scanner(System.in);
		double number;
		
		NumberFormat num1 = NumberFormat.getInstance();
		System.out.println("값을 입력 : ");
		number = scan.nextDouble();
		// 출력방식 num1.format(입력 받은 값)
		System.out.println(num1.format(number));
		// java.text.DecimalFormat@674dc => 현재num1의 참조주소
		// =>Heap주소 => Heap안에 값이 존재함
		// 반드시접근할 수 있는 메소드를 선택 해야한다.
		// NumberFormat의 출력메소드는  : 참조변수.format(값);
		//System.out.println(num1);
		NumberFormat num3 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(num3.format(number));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
