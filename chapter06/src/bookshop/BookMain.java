package bookshop;

import java.text.ParseException;
import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) throws ParseException {
		BookList book = new BookList(); // 객체화 , 인스턴스화
		
		book.additems(new BookDTO("드래곤볼","토리야마","소년점프","2020-01-12",12000));
		book.additems(new BookDTO("원피스 ","오다   ","소년점프","2021-04-22",15000));
		book.additems(new BookDTO("나루토 ","키시모토","소년점프","2023-10-11",11000));
		book.additems(new BookDTO("블리치 ","쿠보   ","소년점프","2022-09-20",10500));
		book.additems(new BookDTO("나히아 ","호리코시","소년점프","2025-11-13",11000));
		
		
		System.out.println("===========================================");
		System.out.println("도서명  저자     출판사        출판일      가격");
		System.out.print("===========================================");
		book.showPrint();
		System.out.println("\n===========================================");
		book.total();
	}

}
