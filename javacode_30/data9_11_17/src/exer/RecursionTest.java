package exer;

public class RecursionTest {

	public static void main(String[] args) {

		// ʵ����
		RecursionTest recur = new RecursionTest();

		System.out.println("sum:" + recur.sum(10));

		System.out.println("�˻�Ϊ:" + recur.getchengji(5));
	}

	/**
	 * �ݹ�ʹ������
	 */

	// ��mun�Ľ׳�num!
	public int sum(int num) {
		if (num == 1) {
			return 1;
		} else {
			System.out.println(num);
			return num + sum(num - 1);
		}
	}

	// ��num�ĳ˻�
	public int getchengji(int num) {
		if (num == 1) {
			return 1;
		} else {

			return num * getchengji(num - 1);
		}
	}

}
