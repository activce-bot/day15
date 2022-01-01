package exer;

public class CommonEmployee extends Employee {

	public CommonEmployee(String name, int id, int salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("员工在一线工作");

	}

}
