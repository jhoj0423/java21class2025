package interfaceExample03;

public interface Shape {
	void draw();
	double getArea();
	default void redraw() {};
}
