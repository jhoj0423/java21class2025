package bookMax;

public class BookDTO {
	private String title;
	private String name;
	private int price;
	
	public BookDTO() {};
	
	public BookDTO(String title,String name,int price) {
		this.title=title;
		this.name=name;
		this.price=price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showprint() {
		System.out.printf("%n제목 : %s, 저자 : %s, 가격 %d원%n",getTitle(),getName(),getPrice());
	}
	
	
}
