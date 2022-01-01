package data6_11_11;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 求随机数的方法
		// 公式 math.random();
		// [a,b]
		// 范围表示:(math.random()*(b-a+1)+b)
		double arr = Math.random();
		System.out.println(arr);

		// 定义一维数组
		// 输入随机数并输出

		// 定义最大值，最小值，平均值
		int sum = 0, max, min, avge;

		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 90 + 10);
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// 定义max为数组中的元素,防止数组中最大值为负数
		// 接着输出最大值
		max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		System.out.println("数组中的最大值为：" + max);
		
		//最小值输出
		min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < min) {
				min = arr1[i];
			}
		}
		System.out.println("数组中的最小值为：" + min);
		
		//求和
		for (int i = 0; i < arr1.length; i++) {
			sum+=arr1[i];
			
		}
		System.out.println("数组中总和为：" +sum );
		
		//平均值
		avge=sum/arr1.length;
		
		System.out.println("数组的平均值为："+avge);
		
		
	}
	
}
