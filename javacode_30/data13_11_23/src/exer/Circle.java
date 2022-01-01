package exer;

public class Circle extends GeometricObject {

	double radius;// °ë¾¶

	public Circle(String color, double weight, double radius) {
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// ·µ»ØÔ²µÄ°ë¾¶
	public double findArea() {
		return 3.14 * radius * radius;
	}
}
