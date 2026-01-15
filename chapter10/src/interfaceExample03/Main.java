package interfaceExample03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle(10);
		
		s.redraw();
		s.draw();
		System.out.println("면적은"+s.getArea());
	}

}
