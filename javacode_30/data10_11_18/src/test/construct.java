package test;

/**
 * 
 * 
 * ��������ʹ�þ���
 * 
 * this��ʹ�� ��ʾ��ǰ����
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021��11��18������12:55:58
 *
 */

public class construct {
	public static void main(String[] args) {

		// persion per1 = new persion();
		// per1.show();
		// per1.name = "ggg";
		// per1.show();
		// System.out.println("----------");
		//
		// persion per = new persion(18);
		// per.name = "gxx";
		//
		// per.show();

		System.out.println("-------");
		// ���ù�����
		persion per2 = new persion(10);
		per2.name = "ggg";
	}
}

/**
 * ��������ʹ��
 */
class persion {
	// ����
	String name;
	int age;

	public persion(int i, int b) {
		System.out.println("i:" + i + " b " + b);

	}

	// ������Ĭ��Ϊ��
	public persion() {
		this(1, 2);
		System.out.println("name is��" + name);
	}

	/**
	 * ��������ʹ��
	 */
	// �����������趨����ֵ
	public persion(int age) {

		// this���ù�������ֻ���ڹ������ڻ���
		// �һ���ֹͣ��������������ѭ��
		// �����ڵ�һ��ʹ��
		// Constructor call must be the first statement in a constructo
		this();

		this.age = age;
		System.out.println("age is :" + age);
		// ���������÷���
		this.show();
		this.setname("gxx");
		this.show();
	
	}

	public void setname(String name) {

		// this���ö���
		// ����ʱ��Ҫ���ڵ�һ��ʹ��
		this.name = name;
	}

	public String getname() {

		show();
		return this.name;
	}

	public void show() {

		System.out.println("name��" + name + ",age:" + age);
	}
}
