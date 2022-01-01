package exer;

public class PayrollSystem {

	public static void main(String[] args) {

		// 定义数组
		Employee employee[] = new Employee[2];
		employee[0] = new SalariedEmployee("管xx", 1001, new MyDate(2002, 1, 3), 10000);
		employee[1]=new HourlyEmployee("管jj", 1002, new MyDate(2001, 1, 3), 50, 240);
		
//		String info1= employee[0].toString();
//		System.out.println(info1);
//		System.out.println(employee[0].earnnigs());
//		String info2= employee[1].toString();
//		System.out.println(info2);
//		System.out.println(employee[1].earnnigs());
		
		//数组可以循环打印
		
		for(int i=0;i<employee.length;i++) {
			System.out.println(employee[i]+"\n月工资为："+employee[i].earnnigs());		
		}
		
		
		
	}
}