package exer;

public class animalTest {
	public static void main(String[] args) {

		animal test = new animal();
		test.name = "С��";
		test.age = 3;
		// test.lage = 3;

		// ����Ϊ4
		test.setlage(6);

		System.out.println(test.getlage());
		test.show();
	}
}

// ��
class animal {
	// ����
	String name;
	int age;

	// ˽���� ������ֱ�ӵ���
	private int lage;

	// ���� ����lage
	// ����0��Ϊż����������
	public void setlage(int Lage) {
		if (Lage >= 0 && Lage % 2 == 0) {
			lage = Lage;
		} else {
			lage = 0;
		}

	}

	// ���� ��ȡlage
	public int getlage() {
		return lage;
	}

	public void show() {
		System.out.println("name:" + name + ",lage " + lage + ",age " + age);

	}

}
