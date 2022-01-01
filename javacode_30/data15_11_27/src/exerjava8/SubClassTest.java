package exerjava8;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		// 默认方法可以使用类的对象直接点调用
		s.method2();
		s.method3();
		// 静态方法只可以使用接口来调用，自己使用
		ComepareA.method1();
		System.out.println("------------------------");
		s.myMethod();
	}
}

class SubClass extends SupClass implements ComepareA, CompareB {

	// 与重写调用重写的
	@Override
	public void method2() {
		System.out.println("SubClass.重写2");
	}

	// 自己有先使用自己的
	@Override
	public void method3() {
		System.out.println("SubClass.重写3");
	}


	// 多个接口，接口冲突怎么办
	// 1.自己重写一个
	//2.
	public void myMethod() {
		super.method3();// 调用父类的
		ComepareA.super.method3();// 单独调用某个接口的方法
		CompareB.super.method3();

	}

}