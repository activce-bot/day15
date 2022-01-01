package exer;

public class TestManage {
	public static void main(String[] args) {

		Employee manage = new Manager("gxx", 1001, 5000, 50000);
		manage.work();

		Employee comm = new CommonEmployee("gxc", 1002, 5000);
		comm.work();

		// 匿名子类的对象
		// 需要重写
		Employee employee = new Employee("ggg", 1003, 1000) {
			@Override
			public void work() {
				System.out.println("人需要好好工作");
			}
		};
		employee.work();

		// 匿名子类的匿名对象

	}
}
