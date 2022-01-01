package exerjava8;
/**
 * jdk1.8
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021年11月27日下午8:33:26
*
 */
public interface ComepareA {
	//静态方法
	public static void method1() {
		System.out.println("comepareA:静态");
}
	//默认方法
	//public可以省
	//加default
	public default void method2() {
		System.out.println("comepareA:默认2");
	}
	public default void method3() {
		System.out.println("comepareA:默认3");
	}
}