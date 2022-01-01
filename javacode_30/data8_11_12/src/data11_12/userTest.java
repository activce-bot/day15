package data11_12;


public class userTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 创建类的对象
		body zi = new body();

		// 调用类的属性
		zi.age = 10;
		System.out.println(zi.age);

		// 调用类的方法
		zi.eat();
		zi.langer("中文");
	}
}

// 创建类
class body{

	// 创建属性
	String hell="are";
	int age=4;
	int tall=9;

	// 创建方法
	public void eat() {
		System.out.println("人可以吃饭");
	}

	//
	public void langer(String langer) {
		System.out.println("使用" + langer + "语言");
	}

}