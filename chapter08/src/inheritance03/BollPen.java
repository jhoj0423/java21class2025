package inheritance03;

public class BollPen extends ShapPencil{
	
	public BollPen() {};
	
	public BollPen(int a,int b,String c) {
		this.Residual=a;
		this.thickness=b;
		this.Name=c;
	}
	
	@Override
	public void showPrint() {
		System.out.printf("%s : 잔여량 :%d, 펜굵기 : %d, 색상: black %n",this.getName(),this.getResidual(),this.getThickness());
	}
	
}
