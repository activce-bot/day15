package exer;

public class RecursionTest {

	public static void main(String[] args) {

		// 实例化
		RecursionTest recur = new RecursionTest();

		System.out.println("sum:" + recur.sum(10));

		System.out.println("乘积为:" + recur.getchengji(5));
	}

	/**
	 * 递归使用例子
	 */

	// 求mun的阶乘num!
	public int sum(int num) {
		if (num == 1) {
			return 1;
		} else {
			System.out.println(num);
			return num + sum(num - 1);
		}
	}

	// 求num的乘积
	public int getchengji(int num) {
		if (num == 1) {
			return 1;
		} else {

			return num * getchengji(num - 1);
		}
	}

}
