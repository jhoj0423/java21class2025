package inheritance03;

public class Main {

	public static void main(String[] args) {
		ShapPencil s = new ShapPencil(10,1,"ShapPencil");
		BollPen b = new BollPen(25,2,"Ball");
		FounctionPen f = new FounctionPen(15,2,"FounctionPen");
		s.showPrint();
		b.showPrint();
		f.showPrint();
		
	}

}
