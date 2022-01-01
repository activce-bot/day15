package exer1;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.eat();

		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();

		// *************************************************
		System.out.println("*******************");
		Person p2 = new Man();

		p2.eat();
		p2.walk();
		System.out.println(p2.id);// 1001
		System.out.println("*********************");

		// 强制类型转换 同类 可以使用man独有的方法
		Man mi = (Man) p2;

		// 可以使用man独有的方
		mi.earnMoney();
		mi.isSmoking = true;

		// 判断是否是同一个类型
		if (mi instanceof Man) {
			System.out.println("******man********");
		}

		// 可以是父类的父类
		if (mi instanceof Object) {
			System.out.println("父类也行");
		}

	}
}
