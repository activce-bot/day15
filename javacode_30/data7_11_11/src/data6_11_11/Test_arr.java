package data6_11_11;

public class Test_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		// 复制数组并输出
		int arr2[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			// System.out.print(arr2[i] + " ");
		}
		System.out.println("\n-----------------");

		int arr3[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
			System.out.print(arr3[i] + " ");
		}
		System.out.println("\n----------3333-");

		// 反转数组
		int tmp = 0;
		for (int i = 0, j = arr3.length - 1; i < j; i++, j--){
			tmp = arr3[i];
			arr3[i] = arr3[j];
			arr3[j] = tmp;
		}

		// 垃圾代码。。。
		// for (int i = 0; i < arr3.length / 2; i++) {
		// for (int j = arr3.length; i < j; j--) {
		// System.out.println(i+" "+j);
		// tmp = arr3[i];
		// arr3[i] = arr3[j];
		// arr3[j] = tmp;
		// //break;
		// }
		// }

		// 打印
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();

		// 定义是否找到数据
		boolean isFlage = true;
		// 线性查找
		int tmp1 = 1;
		for (int i = 0; i < arr3.length; i++) {
			if (tmp1 == arr3[i]) {
				System.out.println("找到了，位置为：" + i);
				isFlage = false;
				break;
			}

		}
		if (isFlage) {
			System.out.println("不好意思没有找到");
		}
	}
}
