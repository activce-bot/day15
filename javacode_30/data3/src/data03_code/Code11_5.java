package data03_code;

public class Code11_5 {
	public static void main(String[] args) {
		int a = 20, b = 10, c = 30;
		int max1 = a > b ? a : b;
		int max2 = max1 > c ? max1 : c;
		System.out.println("三个数的最大值为：" + max2);

		double a1 = 12.3, b1 = 32.1;
		if (a1 > 10 & b1 < 20) {
			double data1 = (a1 * b1);
			int date3 = (int) data1;
			
			System.out.println("俩数之ji为：" +  date3 );
		} else {
			double data2 = a1 + b1;
			//字符类型转换
			int date3 = (int) data2;
			System.out.println("俩数之和为：" + data2 + " date3 is " + date3 );
		}
			
			String s = "123";//字符串
			Integer i = Integer.parseInt(s);//int
			System.out.println( s.equals(i) );
			System.out.println( s.equals( "123" ) );
	}

}