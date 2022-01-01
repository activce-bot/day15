package test;

/**
 * 
 * 
 * 构造器的使用举例
 * 
 * this的使用 表示当前对象
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021年11月18日下午12:55:58
 *
 */

public class construct {
	public static void main(String[] args) {

		// persion per1 = new persion();
		// per1.show();
		// per1.name = "ggg";
		// per1.show();
		// System.out.println("----------");
		//
		// persion per = new persion(18);
		// per.name = "gxx";
		//
		// per.show();

		System.out.println("-------");
		// 调用构造器
		persion per2 = new persion(10);
		per2.name = "ggg";
	}
}

/**
 * 构造器的使用
 */
class persion {
	// 属性
	String name;
	int age;

	public persion(int i, int b) {
		System.out.println("i:" + i + " b " + b);

	}

	// 构造器默认为空
	public persion() {
		this(1, 2);
		System.out.println("name is：" + name);
	}

	/**
	 * 构造器的使用
	 */
	// 构造器可以设定属性值
	public persion(int age) {

		// this调用构造器，只可在构造器内互调
		// 且会有停止，不可以是是死循环
		// 必须在第一行使用
		// Constructor call must be the first statement in a constructo
		this();

		this.age = age;
		System.out.println("age is :" + age);
		// 构造器调用方法
		this.show();
		this.setname("gxx");
		this.show();
	
	}

	public void setname(String name) {

		// this调用对象
		// 调用时需要放在第一行使用
		this.name = name;
	}

	public String getname() {

		show();
		return this.name;
	}

	public void show() {

		System.out.println("name：" + name + ",age:" + age);
	}
}
