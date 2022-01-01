package data_11_8;

public class primfenNumber_1 {
	public static void main (String[] arge){
	
		boolean b = true;//用来表示“这个数”是否为质数
		
		for(int i = 2;i <= 100;i ++){//100以内数的遍历
            //判断其是否为质数
		for(int j = 2;j < i;j ++){
			if(i % j == 0){
				b = false;
			}
		}
		if(b){//如果b为true，则输出i
			System.out.println(i);
		}
		b = true;//当判断完一个数之后，b的值重新赋成true
	}
}
}
