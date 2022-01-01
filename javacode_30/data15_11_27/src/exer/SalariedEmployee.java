package exer;

/**
 * 定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。
 * 该类包括：private成员变量monthlySalary；
 * 实现父类的抽象方法earnings(),
 * 该方法返回monthlySalary值；toString()方法输出员工类型信息及员工的name，number,birthday
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021年11月27日上午11:08:19
*
 */
public class SalariedEmployee extends Employee {

	private double monthlySalsry;//月工资
	
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
