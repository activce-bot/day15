package exer2;
/*
 * 类的成员之四：代码块（或初始化块）
 * 
 * 1. 代码块的作用：用来初始化类、对象
 * 2. 代码块如果有修饰的话，只能使用static.
 * 3. 分类：静态代码块  vs 非静态代码块
 * 
 * 4. 静态代码块
 * 	   >内部可以有输出语句
 * 	   >随着类的加载而执行,而且只执行一次
 * 	   >作用：初始化类的信息
 * 	   >如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 	   >静态代码块的执行要优先于非静态代码块的执行
 * 	   >静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构
 * 
 * 5. 非静态代码块
 * 		>内部可以有输出语句
 * 		>随着对象的创建而执行
 * 		>每创建一个对象，就执行一次非静态代码块
 * 		>作用：可以在创建对象时，对对象的属性等进行初始化
 * 		>如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 * 		>非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法
 * 
 */

public class BlockText {
	public static void main(String[] args) {

		String desc = person.desc;
		System.out.println(desc);

		person.Info();

		person per1 = new person();
		person per2 = new person();

		per1.happyper();
		System.out.println("-------");
		System.out.println(per1.toString());
		System.out.println(per2.toString());
	}
}

// 类
class person {
	String name;
	int age;
	static String desc = "我是一个人";
	int geshu;

	static int total;

	// 构造器
	public person() {
	}

	// 代码块
	// 对象的加载而进行 一个对象一次
	{
		age = 1;
		System.out.println("非静态代码块");
		geshu = ++total;
		System.out.println(total);
	}
	// 类的加载而进行 只执行一次
	static {

		System.out.println("静态代码块");
	}

	// 方法
	public static void Info() {
		System.out.println("静态的方法");
	}

	public void happyper() {

		System.out.println("我是一个快乐的人");
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", geshu=" + geshu + "]";
	}

}