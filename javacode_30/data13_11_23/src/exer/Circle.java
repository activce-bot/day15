package exer;

public class Circle extends GeometricObject {

	double radius;// �뾶

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

	// ����Բ�İ뾶
	public double findArea() {
		return 3.14 * radius * radius;
	}
}
