package exer;

public class CircleTest {

	public static void main(String[] args) {

		CircleTest test = new CircleTest();
		
		
		Circle c = new Circle();
		
		test.printAreas(c, 5);
		
		System.out.println("\t���ڰ뾶Ϊ"+c.radius);
	
	}
						  //����   ������   ���������ʹtime��i�Ͷ����е�radius����ϵ
	public void printAreas(Circle c, int time) {
		System.out.println("Radis\t\tArea");
		
		int i=1;
		for (; i <= time; i++) {

			// Բ�İ뾶
			c.radius = i;

			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		//i���6��
		c.radius=i;
	}
}
