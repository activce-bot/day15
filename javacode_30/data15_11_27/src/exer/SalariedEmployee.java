package exer;

/**
 * ����SalariedEmployee��̳�Employee�࣬ʵ�ְ��¼��㹤�ʵ�Ա������
 * ���������private��Ա����monthlySalary��
 * ʵ�ָ���ĳ��󷽷�earnings(),
 * �÷�������monthlySalaryֵ��toString()�������Ա��������Ϣ��Ա����name��number,birthday
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021��11��27������11:08:19
*
 */
public class SalariedEmployee extends Employee {

	private double monthlySalsry;//�¹���
	
	public SalariedEmployee(String name, int munber, MyDate dirthday,double monthlySalsry) {
		super(name, munber, dirthday);
		this.monthlySalsry=monthlySalsry;
	}

	
	
	@Override
	public double earnnigs() {
		return monthlySalsry;
	}
	
	@Override
	public String toString() {
		return   "SalariedEmployee["+ super.toString()+"]";
	}
}
