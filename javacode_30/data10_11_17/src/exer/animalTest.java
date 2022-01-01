package exer;

public class animalTest {
	public static void main(String[] args) {

		animal test = new animal();
		test.name = "小黄";
		test.age = 3;
		// test.lage = 3;

		// 设置为4
		test.setlage(6);

		System.out.println(test.getlage());
		test.show();
	}
}

// 类
class animal {
	// 属性
	String name;
	int age;

	// 私有类 不可以直接调用
	private int lage;

	// 方法 设置lage
	// 大于0和为偶数可以设置
	public void setlage(int Lage) {
		if (Lage >= 0 && Lage % 2 == 0) {
			lage = Lage;
		} else {
			lage = 0;
		}

	}

	// 方法 获取lage
	public int getlage() {
		return lage;
	}

	public void show() {
		System.out.println("name:" + name + ",lage " + lage + ",age " + age);

	}

}
