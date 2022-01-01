package dara6_1_11_10;

public class dabool_ArrarText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 二维数组
		int[][] arr1 = { { 1, 1, 1 }, { 2, 2, 3 } };

		String[][] arr2 = new String[2][2];

		int[][] arr3 = new int[][] { { 1, 2 }, { 2, 3 } };

		int arr5[] = new int[] { 1, 2 };

		int arr6[] = new int[4];

		int arr7[][] = new int[][] { { 1, 2 }, { 2, 3 } };
		int arr8[][] = new int[1][2];

		// 遍历二维数组
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("输出遍历为" + arr[i][j]);
			}
		}

	}

}
