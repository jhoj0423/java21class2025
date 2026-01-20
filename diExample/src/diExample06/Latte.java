package diExample06;

public class Latte implements IMake{
	
	String course = "원두갈기->에스프레소 추출->스팀우유 추가";
	
	@Override
	public String makeBeverage() {
		return "라떼를 제조합니다"+course;
	};
}
