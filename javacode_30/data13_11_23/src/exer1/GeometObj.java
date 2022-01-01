package exer1;

public class GeometObj {
	public static void main(String[] args) {
		
		Circle c1 = new Circle(3);
		Circle c2 = new Circle("white",1,3);
		
		System.out.println("俩个圆面积是否相等？ "+c1.equals(c2));
		System.out.println("颜色是否相等? "+c1.getColor().equals(c2.getColor()));
		
		System.out.println("半径为:"+c1);
		System.out.println("半径为:"+c2.toString());
		
	}
}
