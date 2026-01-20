package diExample06;

public class OrangeJuice implements IMake{
	
	String course = "오렌지를 자른다 -> 오렌지를 짜서 즙을 낸다";
	
	
	@Override
	public String makeBeverage() {
		return "오렌지주스를 제조합니다"+ course;
	};
}
