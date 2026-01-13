package inheritance03;

public class ShapPencil {
	protected int Residual; 
	protected int thickness;
	protected String Name;
	
	public ShapPencil(){};
	
	public ShapPencil(int a,int b,String c) {
		this.Residual=a;
		this.thickness=b;
		this.Name=c;
	}

	public int getResidual() {
		return Residual;
	}

	public void setResidual(int residual) {
		Residual = residual;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public void showPrint() {
		System.out.printf("%s : 잔여량 :%d, 펜굵기 : %d%n",getName(),getResidual(),getThickness());
	}
}
