/*
 * 素数打印
 */
package data6_11_9;

public class primeNumber {
	 
	public static void main(String[] args) {
		
		boolean tmp=true;
		//表示该数是否为质数
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i++) {
			
		table:for(int j = 2;j<i;j++) {
			//判断是否为质数
			//余数表示不是质数
			if(i % j == 0) {
					tmp=false;
					break;
			}
			//到这里的就都是质数了，自接输出即可
				if(tmp==true) {
					System.out.println(i);
					break table;
				}
				//重置tmp
				tmp=true;
			}
		
		}
	}
}
