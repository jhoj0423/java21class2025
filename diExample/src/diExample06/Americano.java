package diExample06;

public class Americano implements IMake{
	
	String course = "원두갈기 -> 에스프레소 추출 -> 물 추가";
	
	@Override
	public String makeBeverage() {
		return "아메리카노를 제조합니다" + course;
	};
	
}
