package exer1;

import org.junit.Test;

/**
 * 
 * 可以理解为异常的处理方式：① try-catch-finally finally 在return 执行之前运行 ② throws
 * 
 * 常用的异常对象处理的方式： ① String 类型接收 getMessage() 获取错误 ② printStackTrace() 输出错误信息
 * java.lang.Throwable 
 * 		|-----java.lang.Error:一般不编写针对性的代码进行处理。
 * 		|-----java.lang.Exception:可以进行异常的处理 
 * 			|------编译时异常(checked) 
 * 				|-----IOException
 * 					|-----FileNotFoundException 
 * 				|-----ClassNotFoundException
 * 			|------运行时异常(unchecked,RuntimeException) 
 * 				|-----NullPointerException
 * 				|-----ArrayIndexOutOfBoundsException 
 * 				|-----ClassCastException
 * 				|-----NumberFormatException 
 * 				|-----InputMismatchException
 * 				|-----ArithmeticException
 * 
 */
public class ExceptionTest {

	@Test
	public void test1() {

		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			String str = e.getMessage();
			System.out.println(str);// / by zero 相除有一个为0

		} finally {
			System.out.println("最终输出");
		}
	}

	// NumberFormatException 字符转换异常
	@Test
	public void test2() {

		try {
			String str = "123";
			str = "abc";
			int num = Integer.parseInt(str);

		} catch (NumberFormatException e) {
			// 输出错误的地方
			e.printStackTrace();
		} finally {
			System.out.println("一直都会执行的语句");
		}

	}

	@Test
	public int test3() {

		try {
			String str = "123";
			str = "abc";
			int num = Integer.parseInt(str);
			return 1;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return 2;
		} catch (Exception e) {
			e.printStackTrace();
			return 3;
		} finally {

		}
	}

	@Test
	public void tast4() {
		try {
			String str = "123";
			str = "abc";
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}