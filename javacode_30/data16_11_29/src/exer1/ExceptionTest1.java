package exer1;

/*
 * throws 并未真正的把异常给处理，异常抛出 
 */
import org.junit.Test;

public class ExceptionTest1 {

	@Test
	public void test2() {

		try {
			test1();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	// throws 加 异常类型 表示把异常类型给 抛出 ，
	// 使用这个方法的类需要给出解决方法
	public void test1() throws NumberFormatException {
		String str = "123";
		str = "abc";
		int num = Integer.parseInt(str);

	}
}
