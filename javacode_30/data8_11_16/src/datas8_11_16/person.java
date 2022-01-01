package datas8_11_16;

public class person {

	// 属性
	String name;
	int age;
	/**
	 * sex 1 表示 男 0表示女
	 */
	int sex;

	// 方法

	public void study() {
		System.out.println("studying");
	}

	public void showAge() {
		System.out.println(age);
	}

	public int addAge(int i) {
		age += i;
		return age;
	}

}
