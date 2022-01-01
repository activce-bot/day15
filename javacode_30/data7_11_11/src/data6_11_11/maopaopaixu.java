package data6_11_11;

public class maopaopaixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 34, 5, 22, -98, 6, -76, 0, -3 };

		// 使用冒泡排序
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i-1; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					System.out.println(i + " " + j);
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}