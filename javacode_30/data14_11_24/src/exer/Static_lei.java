package exer;

/**
 * 静态的使用 只可以静态和静态相互调用，非静态不可以调用 不可以使用super和this
 * 
 * static
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021年11月24日下午8:37:56
 *
 */
public class Static_lei {
	public static void main(String[] args) {

		person.nation = "chain";
		System.out.println(person.nation);

		person p1 = new person();
		p1.nation = "chain1";
		p1.name = "ggg";
		p1.age = 18;
		p1.show();

		person p2 = new person();
		p2.age = 19;
		p2.name = "xxx";
		// p2.nation = "中国";
		p2.show();

		p1.shownation();

	}
}

// 类
class person {

	String name;
	int age;
	static String nation;

	public static void shownation() {
		// 静态方法不可以调用非静态方法
		// show();

		System.out.println(nation);
	}

	public void show() {
		System.out.println("name:" + name + ",age:" + age + ",nation:" + nation);
	}
}
