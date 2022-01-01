package exer1;

import org.junit.Test;

/**
 * 
 * �������Ϊ�쳣�Ĵ���ʽ���� try-catch-finally finally ��return ִ��֮ǰ���� �� throws
 * 
 * ���õ��쳣������ķ�ʽ�� �� String ���ͽ��� getMessage() ��ȡ���� �� printStackTrace() ���������Ϣ
 * java.lang.Throwable 
 * 		|-----java.lang.Error:һ�㲻��д����ԵĴ�����д���
 * 		|-----java.lang.Exception:���Խ����쳣�Ĵ��� 
 * 			|------����ʱ�쳣(checked) 
 * 				|-----IOException
 * 					|-----FileNotFoundException 
 * 				|-----ClassNotFoundException
 * 			|------����ʱ�쳣(unchecked,RuntimeException) 
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
			System.out.println(str);// / by zero �����һ��Ϊ0

		} finally {
			System.out.println("�������");
		}
	}

	// NumberFormatException �ַ�ת���쳣
	@Test
	public void test2() {

		try {
			String str = "123";
			str = "abc";
			int num = Integer.parseInt(str);

		} catch (NumberFormatException e) {
			// �������ĵط�
			e.printStackTrace();
		} finally {
			System.out.println("һֱ����ִ�е����");
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