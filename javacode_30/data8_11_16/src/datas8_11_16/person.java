package datas8_11_16;

public class person {

	// ����
	String name;
	int age;
	/**
	 * sex 1 ��ʾ �� 0��ʾŮ
	 */
	int sex;

	// ����

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
