package diExample05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCalculator S = new ShapeCalculator();
		
		S.calculate(new Circle(5));
		S.calculate(new Triangle(4,5));
		S.calculate(new Rectangle(8,4));
	}

}
