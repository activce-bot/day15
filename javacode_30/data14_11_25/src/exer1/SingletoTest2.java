package exer1;
/**
 * 单例设计模式：
 * 1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。
 * 
 * 2. 如何实现？
 * 	 饿汉式  vs 懒汉式
 * 
 * 3. 区分饿汉式 和 懒汉式
 *   饿汉式：	
 *   	坏处：对象加载时间过长。
 *   	好处：饿汉式是线程安全的
 *   
 *   懒汉式：好处：延迟对象的创建。
 * 		  目前的写法坏处：线程不安全。--->到多线程内容时，再修改
 * 
 * 
 */
public class SingletoTest2 {
	
	public static void main(String[] args) {
	
	bank bakn2=bank.getInstace();
	bank bakn3=bank.getInstace();
	System.out.println( bakn2==bakn3);
	
		
	}
}

/**
 * 1.私有化类的构造器 2.声明当前类对象，没有初始化 3.声明public、static的返回当前类对象的方法 4.此对象也必须声明为static的
 */
class bank{
	
	private static bank bank1=new bank();
	
	private bank() {
		
	}
	public static  bank getInstace() {
		
		return bank1;
		
	}
}