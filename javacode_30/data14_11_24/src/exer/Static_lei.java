package exer;

/**
 * ��̬��ʹ�� ֻ���Ծ�̬�;�̬�໥���ã��Ǿ�̬�����Ե��� ������ʹ��super��this
 * 
 * static
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021��11��24������8:37:56
 *
 */
public class Static_lei {
	public static void main(String[] args) {

		person.nation = "chain";
		System.out.println(person.nation);

		person p1 = new person();
		p1.nation = "chain1";
		p1.name = "ggg";
		p1.age = 18;
		p1.show();

		person p2 = new person();
		p2.age = 19;
		p2.name = "xxx";
		// p2.nation = "�й�";
		p2.show();

		p1.shownation();

	}
}

// ��
class person {

	String name;
	int age;
	static String nation;

	public static void shownation() {
		// ��̬���������Ե��÷Ǿ�̬����
		// show();

		System.out.println(nation);
	}

	public void show() {
		System.out.println("name:" + name + ",age:" + age + ",nation:" + nation);
	}
}
