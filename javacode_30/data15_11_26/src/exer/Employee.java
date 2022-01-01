package exer;
/**
 * 编写一个Employee类，声明为抽象类，
包含如下三个属性：name，id，salary。
提供必要的构造器和抽象方法：work()。
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021年11月26日下午4:34:43
*
 */

abstract public class Employee {
	
	private String name;//姓名
	private int id;//id
	private int salary;//
	
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	//抽象类的方法中方法区为空
	public abstract void work();
	
	
}
