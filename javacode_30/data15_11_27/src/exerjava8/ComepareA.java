package exerjava8;
/**
 * jdk1.8
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021��11��27������8:33:26
*
 */
public interface ComepareA {
	//��̬����
	public static void method1() {
		System.out.println("comepareA:��̬");
}
	//Ĭ�Ϸ���
	//public����ʡ
	//��default
	public default void method2() {
		System.out.println("comepareA:Ĭ��2");
	}
	public default void method3() {
		System.out.println("comepareA:Ĭ��3");
	}
}