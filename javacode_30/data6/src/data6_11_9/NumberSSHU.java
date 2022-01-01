package data6_11_9;

/**
 * 
 * @Description 素数打印
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021年11月13日下午9:01:02
 *
 */
public class NumberSSHU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 定义素数为真
		boolean isFlage = true;
		int tmp = 0;

		for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				// 判断是否为素数
				if (i % j == 0) {
					isFlage = false;
					break;
				}

			}
			// 是素数则输出
			if (isFlage) {
				tmp++;
				System.out.print(String.format("%-4s", i));
				if (tmp % 10 == 0) {
					System.out.println();
				}
			}

			// 重置isFlage
			isFlage = true;
		}
		System.out.println();
		System.out.println("个数为" + tmp + "个！");
	}

}
