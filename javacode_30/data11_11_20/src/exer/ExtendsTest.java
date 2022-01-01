package exer;
/**
 * 继承 父类和子类
 * 
 * 只自持 单 继承和  多层继承
 * 有 封装性的不可以自接调用！！！！ 
 * 
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021年11月20日下午8:56:49
*
 */

public class ExtendsTest extends persion {
	
	public static void main(String[] args) {
		
		ExtendsTest extend = new ExtendsTest();
		
		//不可以直接调用
		//extend.getAge(10);
		
		extend.eat();
		
		extend.yundong();
		
	}
	
	

	public void yundong() {
		System.out.println("人可以打游戏");
	}
	
	
}
