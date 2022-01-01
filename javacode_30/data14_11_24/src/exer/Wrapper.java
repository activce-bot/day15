package exer;

import org.junit.Test;

public class Wrapper {

	/**
	 * String 类型转基本数据类型
	 * 调用包装类 parexxx(String s)
	 */
	@Test
	public void test1() {
		String str1 = "1234";
		int num2 = Integer.parseInt(str1);
		System.out.println(num2);

		String  str2="true";
		boolean b1=Boolean.parseBoolean(str2);
		System.out.println(b1);
	}

	/**
	 * 基本数据类型，包装类 转换String
	 */
	@Test
	public void testwarp2() {
		// 1.连接运算
		int num1 = 10;
		String string = num1 + "";
		System.out.println(string);
		
		// 2.
		// String.valueof(xxx)
		float f1 = 123.3f;
		String str2 = String.valueOf(f1);
		System.out.println(str2);

	}

	/**
	 * 自动装箱，自动拆箱
	 */
	@Test
	public void testwrap1() {
		int mun1 = 3;
		Integer int1 = mun1;
		System.out.println(int1);

		int mun2 = int1;
		System.out.println(mun2);
	}

	/**
	 * 包装类的使用
	 */
	@Test
	public void testwrap() {
		int mun1 = 10;
		Integer mun2 = new Integer(mun1);
		System.out.println(mun2.toString());
		System.out.println(mun2);

		System.out.println();
		Boolean num3 = new Boolean(true);
		Boolean num4 = new Boolean("true");
		System.out.println("mun3: " + num3 + " 4 :" + num4);

		Boolean num5 = new Boolean("teue12343");
		System.out.println("5:" + num5);
	}

	/**
	 * 包装类转换基本数据类型 包装类.xxxValue
	 */
	@Test
	public void testwap() {
		Integer in1 = new Integer(12);
		int mun1 = in1.intValue();
		System.out.println(mun1);

		Float f1 = new Float(11.2);
		float f2 = f1.floatValue();
		System.out.println(f2 + 2);
	}

}
