package exer;
/**
 * ����SalariedEmployee�ඨ��HourlyEmployee�࣬ʵ�ְ�Сʱ���㹤�ʵ�Ա������ 
 * ���������private��Ա����wage��hour��
 * ʵ�ָ���ĳ��󷽷�earnings(),�÷�������wage*hourֵ��
 * toString()�������Ա��������Ϣ��Ա����name��number,birthday��
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021��11��27������11:20:00
*
 */

public class HourlyEmployee extends Employee {
	
	private int wage;//ÿСʱ����
	private double hour;//������ʱ��
	
	
	
	public HourlyEmployee( String name, int munber, MyDate dirthday,int wage, double hour) {
		super(name, munber, dirthday);
		this.wage = wage;
		this.hour = hour;
	}

	@Override
	public double earnnigs() {
		return wage*hour;
	}

	@Override
	public String toString() {
		return "HourlyEmployee  ["+  super.toString()+"]";
	}
	
	
}
