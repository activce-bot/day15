package exer;

public class GeometiricTest {
	public static void main(String[] args) {

		GeometiricTest test = new GeometiricTest();

		Circle o1 = new Circle("白色", 1, 1);// 3*3*3.14

		MyRectangle o2 = new MyRectangle("白色", 1, 3.14, 1);// 4*5

		test.displayGeometricObject(o1);
		test.displayGeometricObject(o2);

		boolean isequalsArea = test.equalsArea(o1, o2);
		System.out.println("俩图形的面积是否相等？" + isequalsArea);

	}

	// 显示面积
	public void displayGeometricObject(GeometricObject o) {
		double area = o.findArea();
		System.out.println("面积为：" + area);
	}

	// 比较面积
	public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}

}
