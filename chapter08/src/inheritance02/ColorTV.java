package inheritance02;

public class ColorTV extends TV{
	protected int Color;
	
	public ColorTV() {};
	
	public ColorTV(int a, int b) {
		super.size = a;
		//size = a;
		this.Color = b;
	};
	
	public void printPropetry() {
		System.out.println(super.size+"인치"+Color+"컬러");
	}
	
	public int getColor() {
		return Color;
	}

	public void setColor(int color) {
		Color = color;
	}
}
