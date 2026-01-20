package diExample06;

public class GreenTea implements IMake{
	
	String course="녹차가루를 컵에 담기 -> 물추가 -> 기다리기";
	
	@Override
	public String makeBeverage() {
		return "녹차를 제조합니다"+course;
	};
}
