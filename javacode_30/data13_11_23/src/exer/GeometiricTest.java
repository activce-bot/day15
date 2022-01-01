package exer;

public class GeometiricTest {
	public static void main(String[] args) {

		GeometiricTest test = new GeometiricTest();

		Circle o1 = new Circle("��ɫ", 1, 1);// 3*3*3.14

		MyRectangle o2 = new MyRectangle("��ɫ", 1, 3.14, 1);// 4*5

		test.displayGeometricObject(o1);
		test.displayGeometricObject(o2);

		boolean isequalsArea = test.equalsArea(o1, o2);
		System.out.println("��ͼ�ε�����Ƿ���ȣ�" + isequalsArea);

	}

	// ��ʾ���
	public void displayGeometricObject(GeometricObject o) {
		double area = o.findArea();
		System.out.println("���Ϊ��" + area);
	}

	// �Ƚ����
	public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}

}
