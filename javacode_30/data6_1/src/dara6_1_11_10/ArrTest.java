
package dara6_1_11_10;

import java.util.Scanner;



/**
 * @author Guan_x_c
 * @version 1.8
 * @date 2021年11月10日下午7:45:27
 */
/**
 * @author Guan_x_c
 * @version 1.8
 * @date 2021年11月10日下午8:08:41
 */
/**
 * @author Guan_x_c
 * @version 1.8
 * @date 2021年11月10日下午8:08:42
 */
public class ArrTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义一维数组

		// 实例化Scanner
		Scanner scan = new Scanner(System.in);

		int[] arr1 = { 1000, 2000 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// 往数组里面存入数字
		System.out.println("请输入数组的长度");
		int number = scan.nextInt();
		//	输入数字
		int[] id = new int[number];
		for (int i = 0; i < id.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数字");
			id[i] = scan.nextInt();
		}
		//输出数字
		System.out.println("输出为： ");
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i] + " ");
		}

	}
}
