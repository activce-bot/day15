package data6_11_11;
/*
 * 杨辉三角打印
 */

/**
 * @author Guan_x_c
 * @version 1.8
 * @date 2021年11月11日下午6:10:04
 */
public class yanhui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[10][];
		// 二维定义数组的长度

		// 定义二维中的一维长度
		for (int i = 0; i < arr.length; i++) {

			// arr 的个数-1 里面包含0
			arr[i] = new int[i + 1];

			// 定义外成为1
			arr[i][0] = arr[i][i] = 1;

			// 给中间的元素赋值
			// j，i 注意范围
			// 这里的ij 要放入数组中，表示的是第i+1个
			if (i > 1) {
				for (int j = 1; j < arr[i].length - 1; j++){
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}

			}

		}
		// 遍历二维数组
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
