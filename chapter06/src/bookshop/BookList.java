package bookshop;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class BookList {
	ArrayList<BookDTO> book = new ArrayList<BookDTO>();
	//멤버변수
	
	// 초기화
	public BookList() {};
	
	//요소추가
	public void additems(BookDTO b) {
		//b.booktitle 접근가능
		book.add(b);
	}
	
	
	//목록 출력
	public void showPrint() throws ParseException {
		for(BookDTO b:book) {
			b.showDatePrint();
		}
	}
	//총가격 출력
	public void total() {
		int money = 0;
		for(BookDTO b : book) {
			money += b.Price;
		}
		
		DecimalFormat moneyTotal = new DecimalFormat("\u00A4#,###");
		System.out.println("합계 : "+moneyTotal.format(money)+"원");
	}
}
