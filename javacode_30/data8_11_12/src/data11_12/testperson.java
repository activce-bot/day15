package data11_12;
/**
 * 
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021年11月13日下午8:59:27
*
 */
public class testperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 调用类
		person per = new person();

		// 调用属性
		per.tall = 180;
		System.out.println("名字为:" + per.name);
		System.out.println("身高为:" + per.tall);

		// 调用方法
		per.eat();
		per.get("篮球");
		
		//调用输出
		System.out.println(per.getname());
	}
}

// 创建类
class person {

	// 声明属性
	int age = 10;
	String name = "gxx";
	int tall;

	// 声明方法

	public void eat() {
		System.out.println("人可以吃东西");
	}

	public void get(String aihao) {
		System.out.println("--------");
		
		// 可以调用类的属性和方法
		eat();
		System.out.println("爱好为:" + aihao);
	}
	// 返回值的类型为String
	// 必须要返回一个对应的类型
	// 可以调用类的属性和方法

	public String getname() {
		return name;
	}
}