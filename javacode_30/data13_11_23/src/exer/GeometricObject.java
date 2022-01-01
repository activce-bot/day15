package exer;
/**
 * 代表几何形状，
 * 
 */

public class GeometricObject {
	private String color;  //颜色
	private double weight; //重量
	
	//构造器
	public GeometricObject(String color, double weight) {	
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double findArea(){
		return 0.0;
	}
	
	
}
