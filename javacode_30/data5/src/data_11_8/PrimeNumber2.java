/*
 * 100内的素数打印
 */
package data_11_8;

import java.awt.font.NumericShaper.Range;

public class PrimeNumber2 {
	public static void main (String[] arge){
		
		int tmp=0;
		long start = System.currentTimeMillis();//开始毫秒数
		//遍历100以内的数
	label: for(int i=2;i<=100;i++) {
			//判断是否为质数
			//优化二  j<=Math.sqrt(i)  9592  9657
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i % j == 0) {
					continue label; 
				}
			}//是质数输出，并加个数
				
			tmp++;
			} 
		
		long end = System.currentTimeMillis();//再次获取当前累计毫秒数
		System.out.println("所花费的时间为" + (end - start) + "毫秒");
		System.out.println("个数为"+tmp);
		
}		
}
