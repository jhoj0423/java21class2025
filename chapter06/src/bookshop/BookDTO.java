package bookshop;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookDTO {
	String Booktitle;
	String Author;
	String publisher;
	Date Date;
	int Price;
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd(E)");
	NumberFormat num = NumberFormat.getNumberInstance();
	
	public BookDTO() {};
	
	public BookDTO(String Booktitle,String Author,String publisher,String Date,int Price) throws ParseException {
		this.Booktitle = Booktitle;
		this.Author = Author;
		this.publisher = publisher;
		this.Date=sdf1.parse(Date);
		this.Price=Price;
	}
	
	
	//프린트문
	public void showDatePrint() throws ParseException {
		System.out.print("\n"+Booktitle+" ");
		System.out.print(Author+" ");
		System.out.print(publisher+" ");
		System.out.print(sdf3.format(Date));
		System.out.print(" "+num.format(Price)+"원");
	}
}
