package exer;

/**
 * ��1������һ��Employee�࣬��������� private��Ա����name,number,birthday�� ����birthday
 * ΪMyDate��Ķ��� abstract����earnings()�� toString()������������name,number��birthday��
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021��11��27������11:03:22
 *
 */
public abstract class Employee {
	private String name;
	private int munber;
	private MyDate dirthday;

	public abstract double earnnigs();

	public Employee(String name, int munber, MyDate dirthday) {
		super();
		this.name = name;
		this.munber = munber;
		this.dirthday = dirthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMunber() {
		return munber;
	}

	public void setMunber(int munber) {
		this.munber = munber;
	}

	// �Զ�����࣬�����Ҫ��Ϊtostring��Ҫ��ֱ�����Ϊ��ֵַ
	public String getDirthday() {
		return dirthday.toString();
	}

	public void setDirthday(MyDate dirthday) {
		this.dirthday = dirthday;
	}

	@Override
	public String toString() {
		return "name=" + name + ", munber=" + munber + ", dirthday=" + getDirthday().toString();
	}

}
