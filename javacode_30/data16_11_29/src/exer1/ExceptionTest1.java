package exer1;

/*
 * throws ��δ�����İ��쳣�������쳣�׳� 
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

	// throws �� �쳣���� ��ʾ���쳣���͸� �׳� ��
	// ʹ���������������Ҫ�����������
	public void test1() throws NumberFormatException {
		String str = "123";
		str = "abc";
		int num = Integer.parseInt(str);

	}
}
