package exer1;

/**
 * 单例模式的懒汉式
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021年11月25日下午3:35:04
 *
 */
public class SingletoTest1 {

	public static void main(String[] args) {

		order order1 = order.getInstace();
		order order2 = order.getInstace();
		// 表明只创建了一个对象 为true
		System.out.println(order1 == order2);

	}
}

/**
 * 1.私有化类的构造器 2.声明当前类对象，没有初始化 3.声明public、static的返回当前类对象的方法 4.此对象也必须声明为static的
 */
class order {

	// 创建对象为空
	private static order instace = null;

	// 1.私有化类的构造器
	private order() {

	}

	public static order getInstace() {
		// 为空返回创建一个对象
		if (instace == null) {
			instace = new order();
		}

		return instace;
	}

}
