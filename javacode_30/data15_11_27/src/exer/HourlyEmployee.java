package exer;
/**
 * 参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。 
 * 该类包括：private成员变量wage和hour；
 * 实现父类的抽象方法earnings(),该方法返回wage*hour值；
 * toString()方法输出员工类型信息及员工的name，number,birthday。
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021年11月27日上午11:20:00
*
 */

public class HourlyEmployee extends Employee {
	
	private int wage;//每小时工资
	private double hour;//工作的时间
	
	
	
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
