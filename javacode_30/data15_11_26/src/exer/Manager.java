package exer;

public class Manager extends Employee {

	private int bonus;// ����

	public Manager(String name, int id, int salary, int bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("����Ա��������Ч��");
	}

}
