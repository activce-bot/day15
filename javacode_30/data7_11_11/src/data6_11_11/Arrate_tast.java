package data6_11_11;

import java.util.Arrays;

//java.utli.Arrays;
//arrart 的使用

public class Arrate_tast {
	public static void main(String[] args) {
		int arr []=new int [] {1,2,3,4,5,6};
		int arr1 []=new int[] {1,2,3,4,5,6};
		
		boolean isFlage=Arrays.equals(arr, arr1);
		//判断俩个数组是否相等
		
		System.out.println(isFlage);
		
		//输出数组信息
		System.out.println(Arrays.toString(arr1));
		
		
		//填充元素到数组中
		Arrays.fill(arr1, 5);
		System.out.println(Arrays.toString(arr1));
		
		int arr3[]=new int[] {2,3,1,4,5,2,7,9,3};
		
		//对数组进行排序
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		//对排序后的数组进行二分法检索指定的值
		int arr4[]=new int [] {1,2,3,4,4,5,6,6,7};
		//Arrays.sort(arr4);
		int index =Arrays.binarySearch(arr4,1);
		if(index>=0) {
		System.out.println("找到了，位置为："+index);
		}else {
			System.out.println("抱歉没有找到");
		}
	}	
	
}
