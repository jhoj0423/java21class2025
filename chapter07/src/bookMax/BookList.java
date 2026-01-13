package bookMax;

import java.util.ArrayList;

public class BookList {
	ArrayList<BookDTO> bookdto = new ArrayList<BookDTO>();
	//초기화
	public BookList() {};
	
	//추가
	public void addBook(BookDTO b) {
		bookdto.add(b);
	}
	// 출력 프린트문
	public void showBookPrint() {
		for(BookDTO b : bookdto) {
			b.showprint();
		}
	}
	// 가장 비싼값 계산
	public void MaxPrice() {
		int max=0;
		String maxTitel = null;
		String maxName = null;
		for(BookDTO b : bookdto) {
			if(b.getPrice()>max) {
				max = b.getPrice();
				maxTitel = b.getTitle();
				maxName = b.getName();
			}
		}
		System.out.println("제목: "+maxTitel+"저자: "+maxName+", 가격 : "+max+"원");
		
	}
}
