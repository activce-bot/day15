package dara6_1_11_10;

/**
 * @author Guan_x_c
 * @version 1.8
 * @date 2021年11月10日下午7:44:49
 */
public class ArrarTAEXT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 静态初始化
		int[] ids;
		ids = new int[] { 100, 209, 31, 12 };
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
		// 输出个数
		System.out.println(ids.length + "\n");

		// 动态初始化
		int[] arr = new int[3];
		arr[0] = 111;
		arr[1] = 222;
		arr[2] = 2222;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
