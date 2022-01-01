package exer;

/**
 * （1）定义一个Employee类，该类包含： private成员变量name,number,birthday， 其中birthday
 * 为MyDate类的对象； abstract方法earnings()； toString()方法输出对象的name,number和birthday。
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021年11月27日上午11:03:22
 *
 */
public abstract class Employee {
	private String name;
	private int munber;
	private MyDate dirthday;

	public abstract double earnnigs();

	public Employee(String name, int munber, MyDate dirthday) {
		super();
		this.name = name;
		this.munber = munber;
		this.dirthday = dirthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMunber() {
		return munber;
	}

	public void setMunber(int munber) {
		this.munber = munber;
	}

	// 自定义的类，输出需要改为tostring，要不直接输出为地址值
	public String getDirthday() {
		return dirthday.toString();
	}

	public void setDirthday(MyDate dirthday) {
		this.dirthday = dirthday;
	}

	@Override
	public String toString() {
		return "name=" + name + ", munber=" + munber + ", dirthday=" + getDirthday().toString();
	}

}
