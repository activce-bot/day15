package exer2;
/*
 * ��ĳ�Ա֮�ģ�����飨���ʼ���飩
 * 
 * 1. ���������ã�������ʼ���ࡢ����
 * 2. �������������εĻ���ֻ��ʹ��static.
 * 3. ���ࣺ��̬�����  vs �Ǿ�̬�����
 * 
 * 4. ��̬�����
 * 	   >�ڲ�������������
 * 	   >������ļ��ض�ִ��,����ִֻ��һ��
 * 	   >���ã���ʼ�������Ϣ
 * 	   >���һ�����ж����˶����̬����飬�����������Ⱥ�˳��ִ��
 * 	   >��̬������ִ��Ҫ�����ڷǾ�̬������ִ��
 * 	   >��̬�������ֻ�ܵ��þ�̬�����ԡ���̬�ķ��������ܵ��÷Ǿ�̬�Ľṹ
 * 
 * 5. �Ǿ�̬�����
 * 		>�ڲ�������������
 * 		>���Ŷ���Ĵ�����ִ��
 * 		>ÿ����һ�����󣬾�ִ��һ�ηǾ�̬�����
 * 		>���ã������ڴ�������ʱ���Զ�������ԵȽ��г�ʼ��
 * 		>���һ�����ж����˶���Ǿ�̬����飬�����������Ⱥ�˳��ִ��
 * 		>�Ǿ�̬������ڿ��Ե��þ�̬�����ԡ���̬�ķ�������Ǿ�̬�����ԡ��Ǿ�̬�ķ���
 * 
 */

public class BlockText {
	public static void main(String[] args) {

		String desc = person.desc;
		System.out.println(desc);

		person.Info();

		person per1 = new person();
		person per2 = new person();

		per1.happyper();
		System.out.println("-------");
		System.out.println(per1.toString());
		System.out.println(per2.toString());
	}
}

// ��
class person {
	String name;
	int age;
	static String desc = "����һ����";
	int geshu;

	static int total;

	// ������
	public person() {
	}

	// �����
	// ����ļ��ض����� һ������һ��
	{
		age = 1;
		System.out.println("�Ǿ�̬�����");
		geshu = ++total;
		System.out.println(total);
	}
	// ��ļ��ض����� ִֻ��һ��
	static {

		System.out.println("��̬�����");
	}

	// ����
	public static void Info() {
		System.out.println("��̬�ķ���");
	}

	public void happyper() {

		System.out.println("����һ�����ֵ���");
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", geshu=" + geshu + "]";
	}

}