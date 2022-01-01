package exer;

public class CircleTest {

	public static void main(String[] args) {

		CircleTest test = new CircleTest();
		
		
		Circle c = new Circle();
		
		test.printAreas(c, 5);
		
		System.out.println("\t现在半径为"+c.radius);
	
	}
						  //类名   对象名   ，引用这个使time和i和对象中的radius有联系
	public void printAreas(Circle c, int time) {
		System.out.println("Radis\t\tArea");
		
		int i=1;
		for (; i <= time; i++) {

			// 圆的半径
			c.radius = i;

			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		//i变成6了
		c.radius=i;
	}
}
