package exer;

public class PayrollSystem {

	public static void main(String[] args) {

		// ��������
		Employee employee[] = new Employee[2];
		employee[0] = new SalariedEmployee("��xx", 1001, new MyDate(2002, 1, 3), 10000);
		employee[1]=new HourlyEmployee("��jj", 1002, new MyDate(2001, 1, 3), 50, 240);
		
//		String info1= employee[0].toString();
//		System.out.println(info1);
//		System.out.println(employee[0].earnnigs());
//		String info2= employee[1].toString();
//		System.out.println(info2);
//		System.out.println(employee[1].earnnigs());
		
		//�������ѭ����ӡ
		
		for(int i=0;i<employee.length;i++) {
			System.out.println(employee[i]+"\n�¹���Ϊ��"+employee[i].earnnigs());		
		}
		
		
		
	}
}