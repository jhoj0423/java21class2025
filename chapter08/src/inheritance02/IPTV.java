package inheritance02;

public class IPTV extends ColorTV{
	protected String myip;
	
	public IPTV() {};
	
	public IPTV(String ip, int size, int color) {
		this.myip=ip;
		super.size=size;
		super.Color=color;
	}
	
	public String getMyip() {
		return myip;
	}

	public void setMyip(String myip) {
		this.myip = myip;
	}
	//@ 어노테이션 , Override => 재정의 하다 라는 뜻 
	@Override
	public void printPropetry() {
		System.out.printf("나의 IPTV는 %s주소의 %d인치 %d컬러",getMyip(),super.getSize(),super.getColor());
		super.printPropetry();
	}
}
