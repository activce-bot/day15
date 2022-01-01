package exer;

public class Manager extends Employee {

	private int bonus;// 奖金

	public Manager(String name, int id, int salary, int bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("管理员工，提升效率");
	}

}
