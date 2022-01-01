package exer1;

public class Circle extends GeometricObject {

	protected double radius;
	
	public Circle(String color, double weight, double radius) {
		super(color, weight);
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// �������
	public double findArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public boolean equals(Object obj) {
		// �Ƿ���ͬһ����ֵַ
		if (this == obj) {
			return true;
		}
		// �ж��Ƿ���ͬһ���� ����Ҳ��
		if (obj instanceof Circle) {
			// ת��Ϊͬһ����
			Circle ci = (Circle) obj;
			// �Ƚ�
			return this.radius == ci.radius;
		}
		return false;
	}

	// ��д toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
