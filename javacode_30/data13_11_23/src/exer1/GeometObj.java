package exer1;

public class GeometObj {
	public static void main(String[] args) {
		
		Circle c1 = new Circle(3);
		Circle c2 = new Circle("white",1,3);
		
		System.out.println("����Բ����Ƿ���ȣ� "+c1.equals(c2));
		System.out.println("��ɫ�Ƿ����? "+c1.getColor().equals(c2.getColor()));
		
		System.out.println("�뾶Ϊ:"+c1);
		System.out.println("�뾶Ϊ:"+c2.toString());
		
	}
}
