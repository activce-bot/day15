package data03_code;

public class Code11_5 {
	public static void main(String[] args) {
		int a = 20, b = 10, c = 30;
		int max1 = a > b ? a : b;
		int max2 = max1 > c ? max1 : c;
		System.out.println("�����������ֵΪ��" + max2);

		double a1 = 12.3, b1 = 32.1;
		if (a1 > 10 & b1 < 20) {
			double data1 = (a1 * b1);
			int date3 = (int) data1;
			
			System.out.println("����֮jiΪ��" +  date3 );
		} else {
			double data2 = a1 + b1;
			//�ַ�����ת��
			int date3 = (int) data2;
			System.out.println("����֮��Ϊ��" + data2 + " date3 is " + date3 );
		}
			
			String s = "123";//�ַ���
			Integer i = Integer.parseInt(s);//int
			System.out.println( s.equals(i) );
			System.out.println( s.equals( "123" ) );
	}

}