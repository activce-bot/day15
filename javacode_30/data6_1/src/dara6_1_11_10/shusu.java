package dara6_1_11_10;

public class shusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ifFlag=true;
		//定义i为素数
		
		//遍历100以内的数
		for(int i=2;i<=100;i++) {
			
		table:for(int j=2;j<i;j++) {
			
			//判断是否为质数
				if(i%j==0) {
					ifFlag=false;
					break ;
				}
				//输出i
				if(ifFlag) {
					System.out.println(i);
					break table;
				}
				//重置table
				ifFlag=true;
			}
		}
	}

}
