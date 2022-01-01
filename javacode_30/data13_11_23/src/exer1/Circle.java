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

	// 计算面积
	public double findArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public boolean equals(Object obj) {
		// 是否是同一个地址值
		if (this == obj) {
			return true;
		}
		// 判断是否是同一个类 父类也行
		if (obj instanceof Circle) {
			// 转换为同一个类
			Circle ci = (Circle) obj;
			// 比较
			return this.radius == ci.radius;
		}
		return false;
	}

	// 重写 toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
